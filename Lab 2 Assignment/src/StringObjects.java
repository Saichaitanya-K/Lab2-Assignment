/**
 * 
 * @author : Sai Chaitanya Krishna
 * @Date : 23-10-2020
 * @Description : Sorting of string objects in alphabetical order
 *
 */
import java.util.*;
public class StringObjects {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of string objects:");
		size=sc.nextInt();
		String objects[] = new String[size];
		for(int i = 0; i < size; i++) {
			objects[i] = sc.next();
		} 
		String result[]=sortStrings(objects);
		for(int i=0;i<size;i++) {
			System.out.println(result[i]+" ");
	}
	}

	private static String[] sortStrings(String[] objects) {
		Arrays.sort(objects);
		return objects;
		}
}
