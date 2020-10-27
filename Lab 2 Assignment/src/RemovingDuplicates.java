/**
 * 
 * @author : Sai Chaitanya Krishna
 * @Date : 23-10-2020
 * @Description : Removing duplicates in array and sort in descending order
 *
 */
import java.util.*;
public class RemovingDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array");
		size=sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the numbers to the array:");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		int resultArray[] = modifyArray(array);
		for(int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i]+" ");
		}

	}

	private static int[] modifyArray(int[] array) {
		int length = array.length;
		// Loop for removing duplicate elements
		for(int i = 0; i < length; i++) {
			for(int j = i+1; j < length;j++) {
				if(array[i] == array[j]) {
					array[j]=array[length-1];
					length--;
					
				}
			}
		}
		// New Array to copy unique elements in original array
		int array1[] = Arrays.copyOf(array, length);
		// Sorting the array in descending order
		int temp;
		for(int i=0;i<array1.length-1;i++) {
			for(int j=i+1;j<array1.length;j++) {
			if(array1[j]>array1[i]) {
				temp=array1[j];
				array1[j]=array1[i];
				array1[i]=temp;
			}
			}
		}
		
		return array1;
	}
}