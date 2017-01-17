import java.util.Scanner;


public class Peter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int n = input.nextInt();
			int k = input.nextInt();
			int result = n;
			int fin = n/k;
			result += fin;
			int res = n%k;
			fin = fin+res;
			while(fin >= k){
				res = fin%k;
				fin = fin/k;
				result += fin;				
				fin += res;
			}
			System.out.println(result);
			
		}
	}

}
