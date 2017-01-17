import java.util.Scanner;


public class Minesweeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int raw = input.nextInt();
			int col = input.nextInt();
			if(raw == 0 && col == 0){
				break;
			}
			char map[][]=new char[raw+1][col+1];
			for(int i=1;i<raw;i++){
					map[i]=input.nextLine().toCharArray();	
			}
			for(int i=1;i<raw;i++){
				for(int j=1;j<col;j++){
					System.out.printf("%c ",map[i][j]);
				}
				System.out.println();
			}
			
			break;
		}
	}

}
