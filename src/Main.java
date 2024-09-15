
// has a time complexity of o(logn) and is efficient for large datasets
// In this half array is eliminated and each step 

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int [] array=new int [10000000];
        for(int i=0;i<array.length;i++)
        {
        array[i]=i;
        }
       int index= binary_search(76,array);

        if (index==-1){
            System.out.println("The elemnt not found");
        }
        else{
            System.out.println("The element found "+ index);
        }
      }
    private static  int binary_search(int target,int [] array){
        int low=0;
        int high=array.length-1;


        while(low<=high){
            int middle=low+(high-low)/2;
            int value=array[middle];
            System.out.println("Middle "+value);
            if (value>target){
                high=middle-1;
            }
            else if(value<target){
                low=middle+1;
            }
            else{
                return middle;
            }






        }
        return -1;
    }}
