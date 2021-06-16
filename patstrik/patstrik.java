import java.util.*;
class patstrik
{
	public static void main (String k[])
	{
		Scanner sc = new Scanner (System.in);
		int i ,j , n ;
		System.out.println(" enter the size of height ");
		n = sc.nextInt ();
		for ( i=1;i<=n;i++)
		{
			for (j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}