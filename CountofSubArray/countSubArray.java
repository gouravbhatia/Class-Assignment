import java.util.*;
public class countSubArray
{
    public static void main(String [] args)
    {
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=g.nextInt();
        }
        int k=g.nextInt();
        int count=0;
        n=n-k+1;
        count=(n*(n+1))/2;
        System.out.println(count);
    }
}