/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabooSearch;

/**
 *
 * @author alex
 */
public class TS {
    
    int[][] tabuList;
    public double[][] distances = new double[TStsp.cities][TStsp.cities];
    private int tabu_tenure = 7;
    private boolean is_tabu = true;
    
    public TS(int numCities, int tenure, boolean tabu){
        tabuList = new int[numCities][numCities];
        this.tabu_tenure = tenure;
        this.is_tabu = tabu;
    }
    
    public void tabuMove(int city1, int city2){
        tabuList[city1][city2] += tabu_tenure;
        tabuList[city2][city1] += tabu_tenure;
    }
    
    public void decrementTabu(){
         for (int i = 0; i < tabuList.length; i++) {
            for (int j = 0; j < tabuList.length; j++) {
                tabuList[i][j] -= tabuList[i][j] <= 0 ? 0 : 1;
            }
        }
    }
    
    public int[] getBestNeighbour(TS tabuList, int[] initSolution){
        int[] bestSol = new int[initSolution.length];
        bestSol = copyArray(initSolution);
        double bestCost = calculateDistance(initSolution);
        int city1 = 0;
        int city2 = 0;
        boolean firstNeighbor = true;
        boolean selectedMove = false;
        double newBestCost = 0;
        int[] newBestSol = new int[bestSol.length];
        boolean tabu_test;
        
        for(int i = 0; i < bestSol.length - 1; i++){
            for(int j = i + 1; j < bestSol.length; j++){
                newBestSol = copyArray(bestSol);
                newBestSol = swapOperator(i,j,initSolution);
                newBestCost = calculateDistance(newBestSol);
                tabu_test = (this.is_tabu) ? (newBestCost < bestCost || firstNeighbor) && tabuList.tabuList[i][j] == 0 :(newBestCost < bestCost || firstNeighbor);
                if (tabu_test) {
                    firstNeighbor = false;
                    city1 = i;
                    city2 = j;
                    bestSol = copyArray(newBestSol);
                    bestCost = newBestCost;
                    selectedMove = true;
                }
            }
        }
        if(selectedMove){
            tabuList.decrementTabu();
            tabuList.tabuMove(city1, city2);
            selectedMove = false;
        }
        return bestSol;
    }
    
    public int[] copyArray(int[] arr){
        int[] output = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            output[i] = arr[i];
        }
        return output;
    }
    
    public int[] swapOperator(int city1, int city2,int[] solution){
        int temp = solution[city1];
        solution[city1] = solution[city2];
        solution[city2] = temp;
        return solution;
    }
    
    public double calculateDistance(int solution[]){
        double cost = 0;
        for(int i = 0; i < solution.length - 1; i++){
            cost += distances[solution[i]][solution[i+1]];
        }
        cost  += distances[solution[solution.length - 1]][solution[0]];
        return cost;
    }
}
