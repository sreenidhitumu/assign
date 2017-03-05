import java.util.*;

class Assign{
	
	int noConsecutive(int n)	
    {
        int a[] = new int [n];
        int b[] = new int [n];
        a[0] = b[0] = 1;
        for (int i = 1; i < n; i++)
        {
            a[i] = a[i-1] + b[i-1];
            b[i] = a[i-1];
        }
        return a[n-1] + b[n-1];
    }
    public static void main (String args[])
    {
        Assign a=new Assign();
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for (int i=1;i<=t;i++){
			int n=s.nextInt();
			int c=a.noConsecutive(n);
			System.out.println(c);
		}
    }
	
}