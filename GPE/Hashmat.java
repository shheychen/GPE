import java.util.Scanner;


public class Hashmat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while(input.hasNextInt()){
			int fir = input.nextInt();
			int sec = input.nextInt();
			int result = sec - fir;
			
			System.out.print(result);
			System.out.println();
		}
	}

}
