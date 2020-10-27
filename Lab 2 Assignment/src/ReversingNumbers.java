/**
 * 
 * @author : Sai Chaitanya Krishna
 * @Date : 23-10-2020
 * @Description : Reversing the numbers in array
 *
 */
import java.util.*;
public class ReversingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array: ");
		size=sc.nextInt();
		System.out.println("Enter the elements to the array: ");
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i]=sc.nextInt();
		}
		int resultArray[]=getSorted(array); // Method to reverse the array
		System.out.println("The reversed array is : ");
		for(int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i]+" ");
		}

	}
	private static int[] getSorted(int[] array) {
		int j=array.length;
		int b[] = new int[j];
		for(int i = 0; i < array.length; i++) {
			b[j-1] = array[i];
			j = j-1;
		}
		return b;
	}

}
