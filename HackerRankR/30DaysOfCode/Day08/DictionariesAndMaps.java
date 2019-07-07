
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesAndMaps {
	
	 public static void main(String []args){
		 
	        Scanner in = new Scanner(System.in);
	        
	        Map<String, Integer> directory = new HashMap<String, Integer>();
	        
	        int n = in.nextInt();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            // Write code here
	            directory.put(name, phone);
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            // Write code here
	            if(directory.containsKey(s)) {
	            	System.out.println(s + "=" + directory.get(s));
	            } else {
	            	System.out.println("Not found");
	            }
	        }
	        in.close();
	    }

}
