/**
 * 
 * @author : Sai Chaitanya Krishna
 * @Date : 23-10-2020
 * @Description : Concatenating names with salutation
 *
 */
import java.util.*;
public class Names {

	public static void main(String[] args) {
		String result[][]=new String[2][];
		String salutation[]= {"Mr","Mrs","Miss"};
		String names[]={"Surya","Supriya","Aparna","Gopi","Rajesh"};
		result[0]= salutation;
		result[1]= names;

		for(int i=0;i<result.length;i++) {
	    	   for(int j=0;j<result[i].length;j++) {
	    		 System.out.print(result[i][j]+"  ");  
	    	   }
	    	   System.out.println();
	       } 
		System.out.println(result[0][0]+"."+result[1][0]);
		System.out.println(result[0][2]+"."+result[1][1]);
		System.out.println(result[0][1]+"."+result[1][2]);
		System.out.println(result[0][0]+"."+result[1][3]);
		System.out.println(result[0][0]+"."+result[1][4]);

	}

}
