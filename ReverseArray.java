package com.methodofarray;
//write a program to print all elements of an array

//write a program to find the average of array elements
//public class Average{
//public static void main (String args[]){
//int[]arr3={1,2,3,4,5};
//int sum=0;
//for(int i=0;i<arr3.length;i++){
//sum=sum+arr3[i];
//}
////System.out.println(arr[i]);
//int average=sum/arr3.length;
//System.out.println("Avereage ="+average);
//}
//}
//write a program to count even and odd numbers in array

//public class CountEvenOdd{
//public static void main(String args[]){
//int[] arr6={1,2,3,4,5};
//int sum=0;
//for(int i=0;i<arr6.length;i++){
//if(arr6[i]%2==0){
//sum=sum+arr6[i];
//}else{
//sum=sum+arr6[i];
//}
//
//}
//}
//}
//write a program to search an elements in an array
//public class SearchElemnts{
//public static void main(String args[]){
//int[] arr7={1,2,3,4,5};
//for(int i=0;i<arr7.length;i++){
//if(arr7[i]==3){
//System.out.println("Elements found");
//}
//}
//}
//}
//
//write a program to reverse an array
public class ReverseArray {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = arr.length - 1; i <= 0; i++) {
			System.out.println(arr[i]);
		}
	}
}
