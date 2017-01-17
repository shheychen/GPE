import java.util.Scanner;


public class three_n_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
		int fir = input.nextInt();
		int sec = input.nextInt();
		input.nextLine();
		if(sec < fir){
			int tmp = sec;
			sec = fir;
			fir = tmp;
		}
		
		int result=0;
		int max=0;
		for(int i=fir;i<=sec;i++){
			int k = i;
			int len=1;
			while(true){
				if(k%2 == 1){
					k = (3*k)+1;
				}
				else{
					k = k/2;
				}
				len++;
				if(k == 1){
					break;
				}
			}
			if(len > max){
				max = len;
			}
		}
		
		
		System.out.printf("%d %d %d\n",fir,sec,max);
	}
	}
}
