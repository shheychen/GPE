import java.util.ArrayList;
import java.util.Scanner;


public class Common_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String a = input.nextLine();
			String b = input.nextLine();
			ArrayList<String> c = new ArrayList<String>();
			for(int i=0; i<a.length();i++){
				String d =""+a.charAt(i);
				if(b.contains(d)){
					c.add(d);
				}
			}
			c.sort(null);
			for(int i=0;i<c.size();i++){
				System.out.print(c.get(i));
			}
			System.out.println();
		}
	}

}