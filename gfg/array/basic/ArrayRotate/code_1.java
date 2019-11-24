//this Algrithm shifts the elements of the array one by one
//time: o(nd)
//space: o(1)
import java.lang.*;
import java.util.*;
import java.io.*;
class code_1
{
  public static void main (String args[])throws Exception
  {
    code_1 ob =new code_1();
    Scanner in =new Scanner (system.in);
    int t=in.nextInt();
    while(t-- >0)
    {
      int n=in.nextInt();
      int d=in.nextInt();
      int a[] =new int(n);
      for(int i=0;i<n;i++)
          a[i]=in.nextInt();
       ob.rotbyd(a,d);
       ob.print(a);
    }
    
    }
   int [] rotbyone (int a[])
   {
      int n =a.length;
      int temp=a[0];
      int i=0; // loop variable
      for(i=0;i<n-1;i++)
      {
        a[i]=a[i+1];
        }
        a[i]=temp;
        return a;
        }
    int [] rotbyd(int a[], int d)
    {
      int i=0;
      for(i=0;i<d;i++)
        rotbyone(a);
        
       return a;
       }
    void print(int a[])
      {
        int i=0; 
        for(i=0;i<a.length;i++)
        {
          System.out.print(a[i]+" ");
          }
        }
   }
