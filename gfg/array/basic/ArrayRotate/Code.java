/**
This method is using a temp memory location to store the rotatable part of the array
time : 0(n)
space: 0(d)
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Code
 {
	public static void main (String[] args)
	 {
	         Scanner in = new Scanner(System.in);
	         int test = in.nextInt();
	         while(test-->0)
	         {
	             int N = in.nextInt();
	             int D = in.nextInt();
	             int a[]= new int[N];
	             for(int i=0; i<N; i++)
	             {
	                a[i] = in.nextInt();
	             }
	             StringBuffer s = new StringBuffer();
	             for(int i=D; i<N; i++ )
	             {
	                 s.append(a[i]+" ");
	             }
	             for(int i=0;i<D;i++)
	             {
	                 s.append(a[i]+" ");
	             }
	             System.out.println(s);
	         }
	 }
}
