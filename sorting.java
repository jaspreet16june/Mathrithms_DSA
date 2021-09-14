import java.io.*;
import java.util.*;

    // it basicallky sorts n-1 times the length of array 
    // first for loop is to iterate the array n-1 times the length of array
    // assume that first element is alredy sorted .
    // jth for loop iterate fromm second element
    // and swap if the th element is smaller than its previous ones if not it automatically breaks.  
public class Main {

  public static void insertionSort(int[] arr) {
    //write your code here
    int n = arr.length;
    for(int i= 1; i<n;i++){
        for(int j = i;j>=1;j--){
            if(isGreater(arr,j-1,j)==true){
                swap(arr,j-1,j);
            }else{
                break;
            }
        }   
    }
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // return true if jth element is greater than ith element
  public static boolean isGreater(int[] arr, int j, int i) {
    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    insertionSort(arr);
    print(arr);
  }

}