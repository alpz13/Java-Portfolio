/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabooSearch;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class TStsp {
    /*
    Taboo search is an heuristic to find the optimal path
    Traveling Salesman is a problem in which a salesman has to cover
    N cities (5,8,31) with the lowest or cheapest path.
    we make the combinations and taboo makes sure to only use combination
    we havent use to evaluate.
    this is on big scale what we are trying to do.
    
    The base of the code is one i once had in a lecture. it was already messy.
    */
    
    private static int map = 2;
    private static int tenure = 7;
    private static boolean is_tabu = false;
    private static int max_iteration = 200;
    private static int map_size[] = {5,8,31};
    
    static int cities = map_size[map];
    private static int[][] ubications = new int[cities][cities];
    private static double[][] ubications2;
    
    private static LinkedList<String[]> results = new LinkedList<String[]>();
    
    
    public static void main(String[] args){
    
        Scanner reader = new Scanner(System.in);
        boolean keep = true;
        
        do{
            
            menu();
            int map_op = reader.nextInt();
            
            System.out.println("Would you like to use Taboo \n (0: False / 1: True)");
            int tabu_op = reader.nextInt();
            
            if(tabu_op == 1){
                is_tabu = true;
                System.out.println("Select the time on the taboo list");
                int tenure_op = reader.nextInt();
                tenure = tenure_op;
            }
            
            System.out.println("Select the number of iterations you want");
            int iter_op = reader.nextInt();
            
            max_iteration = iter_op;
            map = map_op - 1;
            cities = map_size[map];
            
            TS ts = new TS(cities, tenure, is_tabu);
            ReadData d = new ReadData();
            ubications2 = d.reading(map);
            
            set_map_data(ts);
            run_search(ts);
            
            System.out.println("want to run again? \n (0: False / 1: True)");
            int continue_op = reader.nextInt();
            keep = continue_op ==1;
            
        
        } while(keep);
        System.out.println(" Results ");
        for(String[] array: results){
            System.out.println(array[0] + array[1] + array[2]);
        }
        reader.close();
    }
    
    public static void menu(){
        System.out.println(" == Menu ==");
        System.out.println(" Select a map ");
    	System.out.println("1) 5 cities");
    	System.out.println("2) 8 cities");
    	System.out.println("3) 31 cities");
    }
    
    private static double calculateEuclidianDistance(double x1, double y1, double x2, double y2){
        return Math.abs((Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))));
    }
    
    private static void run_search(TS ts){
        int[] currSolution = new int[cities];
        for(int i  = 0; i < cities; i++){
            currSolution[i] = i;
        }
        int[] bestSol = new int[currSolution.length];
        System.arraycopy(currSolution, 0, bestSol, 0 , bestSol.length);
        double bestCost = ts.calculateDistance(bestSol);
        for(int i = 0; i < max_iteration; i++){
            currSolution = ts.getBestNeighbour(ts, currSolution);
            double currCost = ts.calculateDistance(currSolution);
            if(currCost < bestCost){
                System.arraycopy(currSolution, 0, bestSol, 0, bestSol.length);
                bestCost = currCost;
            }
            System.out.println(i + 1 + " best cost " + bestCost);
        }
        
        System.out.println("Best Cost found = " + bestCost);
        String conf = "\n\tconf => ";
        conf += " size: " + cities ;
        conf += " is_tabu: " + (is_tabu) ;
        conf += " tenure: " + tenure;
        conf += " iterations: " + max_iteration;
        String a_result[] = { "Map " + (map+1), conf , "\n\tCost: "+bestCost };
        results.add(a_result);
        
    }
    
    private static void set_map_data(TS ts){
        for(int x = 0; x < cities; x++){
            for(int y = 0; y < cities; y++){
                ts.distances[x][y] = calculateEuclidianDistance(ubications2[x][0], ubications2[x][1],ubications2[y][0],ubications2[y][1]);
            }
        }
    }
    
    public static void printSolution(int[] solution) {
        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i] + 1 + " ");
        }
        System.out.println("");
        for (int i = 0; i < solution.length - 1; i++) {
            System.out.println(
            		ubications2[solution[i]][0] + "," +  ubications2[solution[i]][1] + "," + 
            		ubications2[solution[i + 1]][0] + "," +  ubications2[solution[i + 1]][1]
			);
        }
        System.out.println(
        		ubications2[solution[solution.length - 1]][0] + "," +  ubications2[solution[solution.length - 1]][1] + "," + 
				ubications2[solution[0]][0] + "," +  ubications2[solution[0]][1]
		);
    }
}
