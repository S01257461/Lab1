//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Morissi Ramirez: 
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));
    

    int[] labarray = {5, 9, 3, 12, 7, 3, 11, 5};

    // output array using a while loop
    int i = 0;
    System.out.println("This is the array");
    while (i<labarray.length){
      
      System.out.println(labarray[i]);
      i++;
    }
    // output array in reverse using a while loop
    int w = labarray.length;
    System.out.println("This is the array in reverse");
    while (w >1) {
      System.out.println(labarray[w-1]);
      w--;
    }

    // output first and last value of the array
    System.out.println("This is the first value");
    System.out.println(labarray[0]);
    System.out.println("This is the last value");
    System.out.println(labarray[labarray.length-1]);
    
    //calling methods in Lab1

    System.out.println("The bigger number is: "+lab.max(1,9));

    System.out.println("The smaller number is: "+lab.min(99,199));

    System.out.println("The sum of the array is: "+lab.sum(labarray));

    System.out.println("The average of the array is: "+lab.average(labarray));

    System.out.println("The largest number in the array is: "+lab.maxvalue(labarray));

    System.out.println("The smallest number in the array is: "+lab.minvalue(labarray));

  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b){
    if (a>= b){
      return a;
    }else{
      return b;
    }
  }
  public int min(int a, int b){
    if ( a<= b) {
      return a;
    }else{
      return b;
    }
  }
  public int sum(int[] nums){
    int total = 0;
    for (int i = 0; i<nums.length; i++){
      total+=nums[i];
    }
    return total;
  }

  public int average(int[] nums){
    int total = 0;
    for (int i = 0; i<nums.length; i++){
      total+=nums[i];
    }
    return total/nums.length;

  }

  public int maxvalue(int[] nums){
    int maxvalue = nums[0];
    for (int i = 1; i<nums.length; i++){
      if(nums[i]>maxvalue){
        maxvalue = nums[i];
      }
    }
    return maxvalue;
  }
  public int minvalue(int[] nums){
    int minvalue = nums[0];
    for (int i = 1; i<nums.length; i++){
      if(nums[i]<minvalue){
        minvalue = nums[i];
      }
    }
    return minvalue;
  }
}