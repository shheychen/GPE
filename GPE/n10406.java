import java.util.Arrays;
import java.util.Scanner;

public class n10406
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		while(input.hasNext())
		{
			int N = input.nextInt();
			while(N>0)
			{
				int M = input.nextInt();
				int[] a = new int[M];
				for(int i=0;i<M;++i)
					a[i] = input.nextInt();
				Arrays.sort(a);
				int dis = 0;
				for(int i=0;i<M;++i)
					dis += Math.abs(a[i]-a[M/2]);
				--N;
				System.out.println(dis);
			}
		}
	}
}