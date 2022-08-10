import java.io.*;
import java.lang.*;
import java.util.*;

/*

* Author : Amrit Manash
  Code Created : 10th August 2022
  Description: This code will search for key element from the array and return its index at which it is present

*/

class LinearSearchCode 
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int size=sc.nextInt();

      int[] arr=new int[size];

      System.out.println("Enter the array elements");
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.println("Enter the key to search in array");
      int key =sc.nextInt();

      LinearSearchCode obj=new LinearSearchCode();
      int val=obj.doLinearSearch(arr,key);

      if(val==-1)
      {
        System.out.println("No element found");
      }
      else
      {
        System.out.println("Element found at index:"+val);
      }
      
    }

  public static int doLinearSearch(int[] arr,int key)
{
    int res=0;
    if(arr.length==0)
    return -1;

    else 
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                res= i;
            }
            else
            {
                continue;
            }
        }
    }
    return res;
}
}

