import java.util.Scanner;


public class three_n {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext())
		{
			int N = input.nextInt();
			int M = input.nextInt();
			input.nextLine();
			int max=0;
			for(int i=(M<N?M:N);i<=(M>N?M:N);++i)
				if(func(i)>max)
					max=func(i);
			System.out.printf("%d %d %d\n",N,M,max);
		}	
	}
	
	static public int func(int N)
	{
		int i;
		for(i=1;N!=1;++i)
			if(N%2==0)
				N/=2;
			else
				N=3*N+1;
		return i;
	}
}
