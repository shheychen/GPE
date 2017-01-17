import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		for(int i=0;i<number;i++){
			int p = input.nextInt();
			int q = input.nextInt();
			int r = input.nextInt();
			
			int x = input.nextInt();
			int y = input.nextInt();
			int z = input.nextInt();
			
			int N = input.nextInt();
			
			int A[]=new int[N];
			int B[]=new int[N];
			
			ArrayList<Integer> list = new ArrayList<Integer>(); 
			
			for(int j=0;j<N;j++){
				A[j] = (j*j*p)+(j*q)+r;
				B[j] = (j*j*x)+(j*y)+z;
			}
			
			int aa=0;
			int bb=0;
	
			while(aa < N && bb < N){
				
				if(A[aa] < B[bb]){
					list.add(A[aa]);
					aa++;
				}
				else{
					list.add(B[bb]);
					bb++;
				}
				if(list.size() == N){
					break;
				}
			}
			
				System.out.println(list.get(N-1));
			
			
			
		}
			
	
		

	}

}