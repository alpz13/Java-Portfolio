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
public class ReadData {
    
    double position [][];
    
    public ReadData(){
    
    }
    
    public double[][] reading(int option){
        /* I really suck on reading data from files in java, i think java also
           makes it somehow hard at it, so this is really bad but, im hardcoding
           the examples to test the Traveling Salesman using Taboo search
        */
    
        switch (option){
            case 0 :
                position = new double[5][5];
                position[0][0]=430;   position[0][1]=470;
	    	position[1][0]=560;   position[1][1]=590;
	    	position[2][0]=350;   position[2][1]=205;
	    	position[3][0]=200;   position[3][1]=402;
	    	position[4][0]=601;   position[4][1]=400;
	    	break;
            case 1:
                position = new double[7][7];
	    	position[0][0]=0.0;   position[0][1]=0.0;
	    	position[1][0]=3.2;    position[1][1]=3.0;
	    	position[2][0]=2.8;   position[2][1]=5.8;
	    	position[3][0]=5.6;    position[3][1]=5.6;
	    	position[4][0]=8.0;    position[4][1]=4.0;
	    	position[5][0]=8.0;    position[5][1]=6.4;
	    	position[6][0]=8.7;     position[6][1]=2.0;
                break;
            case 2:
            default:
                position = new double[31][31];
    	        position[0][0]=12;        position[0][1]=85;
    	        position[1][0]=110;       position[1][1]=10;
    	        position[2][0]=15;        position[2][1]=17;
    	        position[3][0]=127;       position[3][1]=80;
    	        position[4][0]=50;        position[4][1]=74;
    	        position[5][0]=55;        position[5][1]=21;
    	        position[6][0]=28;        position[6][1]=104;
    	        position[7][0]=9;         position[7][1]=11;
    	        position[8][0]=6;         position[8][1]=36;
    	        position[9][0]=3;         position[9][1]=60;
    	        position[10][0]=7;        position[10][1]=32;
    	        position[11][0]=80;       position[11][1]=43;
    	        position[12][0]=32;       position[12][1]=77;
    	        position[13][0]=67;       position[13][1]=25;
    	        position[14][0]=88;       position[14][1]=23;
    	        position[15][0]=64;       position[15][1]=93;
    	        position[16][0]=59;       position[16][1]=4;
    	        position[17][0]=78;       position[17][1]=106;
    	        position[18][0]=98;       position[18][1]=73;
    	        position[19][0]=35;       position[19][1]=92;
    	        position[20][0]=220;      position[20][1]=30;
    	        position[21][0]=120;      position[21][1]=90;
    	        position[22][0]=180;      position[22][1]=63;
    	        position[23][0]=150;      position[23][1]=50;
    	        position[24][0]=120;      position[24][1]=100; 
    	        position[25][0]=5;        position[25][1]=50;
    	        position[26][0]=195;      position[26][1]=83;
    	        position[27][0]=57;       position[27][1]=39;
    	        position[28][0]=82;       position[28][1]=59;
    	        position[29][0]=68;       position[29][1]=69;
    	        position[30][0]=58;       position[30][1]=79;
    	        break;
        }
        return position;
    }
    
}
