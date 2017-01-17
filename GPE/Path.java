import java.util.Scanner;

public class Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int ti=0;ti<num;ti++){
			int raw = input.nextInt();
			int col = input.nextInt();
			int tab[][] = new int[raw][col];
			int result[][] = new int[raw][col];
			
			for(int i=0;i<raw;i++){
				for(int j=0;j<col;j++){
					tab[i][j] = input.nextInt();
				}				
			}
			
			result[0][0] = tab[0][0];
			for(int i=1;i<col;i++){
				result[0][i] = result[0][i-1] + tab[0][i];
			}
			for(int j=1;j<raw;j++){
				result[j][0] = result[j-1][0] + tab[j][0];
			}
			
			for(int i=1;i<raw;i++){
				for(int j=1;j<col;j++){
					int lefhead = result[i-1][j-1];
					if(lefhead+result[i][j-1] > lefhead+result[i-1][j]){
						result[i][j] = result[i-1][j] + tab[i][j];
					}
					else{
						result[i][j] = result[i][j-1] + tab[i][j];
					}
				}
			}
			
			System.out.println(result[raw-1][col-1]);
		}
				
	}

}