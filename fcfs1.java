import java.util.Scanner;
class Schdedule
{  
   public static void main(String...args)
{     Scanner sc=new Scanner(System.in);
     int n;
System.out.println("Enter the no. of processes");
    n=sc.nextInt();  
     int ar[]=new int[n];
     int bt[]=new int[n];
     int ct[]=new int[n];
     
     
       for(int i=0;i<n;i++)
         {   System.out.println("Arrival time of process"+i); 
             ar[i]=sc.nextInt();
          }

       for(int i=0;i<n;i++)
       {   System.out.println("Burst time of process"+i); 
           bt[i]=sc.nextInt();
     }
   for(int  i = 0 ; i < n; i++)
		{
			if( i == 0)
			{	
				ct[i] = ar[i] + bt[i];
			}
			else
			{
				if( ar[i] > ct[i-1])
				{
					ct[i] = ar[i] + bt[i];
				}
				else
					ct[i] = ct[i-1] + bt[i];
			}
                               }
         for(int i=0;i<n;i++)
       {
          System.out.println("Completion time is"+ct[i]);
       }
}
}
 