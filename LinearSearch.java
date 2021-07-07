package mySecJavaProgram;
//Searching key using Linear Search
import java.util.*;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<=arr.length-1;i++){
			System.out.println("Enter the array elements");
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key to find");
		int key=scan.nextInt();
		for(int i=0;i<arr.length-1;i++){
		if(arr[i]==key){
			System.out.println("Key is found at the index "+i);
			System.exit(0);
		}
	}
		System.out.println("Key is not found");
}}
