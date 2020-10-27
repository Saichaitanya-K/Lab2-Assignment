/**
 * 
 * @author : Sai Chaitanya Krishna
 * @Date : 23-10-2020
 * @Description : Finding the second smallest element in an array
 *
 */
import java.util.*;
public class SecondSmallestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size,result;
		System.out.println("Enter the size of an array:");
		size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements of an array:");
		for(int i=0;i<size;i++) 
		{
			array[i] = sc.nextInt();
		}
		result = getSecondSmallest(array);
		System.out.println("The second smallest number in array is : "+result);
	}

	private static int getSecondSmallest(int[] array) {
		int temp;
		for(int i=0;i<array.length;i++) 
		{
			for(int j=i+1;j < array.length;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		return array[1];
	}

	}
