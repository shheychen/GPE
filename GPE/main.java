import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input =new Scanner(System.in);
			
			int dist;
			while(input.hasNextLine()){
				int testNum = input.nextInt();
				for(int i=1;i<=testNum;i++){
					int eachNum = input.nextInt();
					int[] a = new int[eachNum];
					for(int j=0;j<eachNum;j++){
						a[j]=input.nextInt();
					}
					Arrays.sort(a);
					dist=0;
					for(int j=0;j<eachNum;j++){
						dist = dist + Math.abs(a[j]-a[eachNum/2]);  
					}
					System.out.println(dist);
				}
			}
	}

}
