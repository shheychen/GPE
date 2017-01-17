import java.util.ArrayList;
import java.util.Scanner;


public class Judge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n=0;
		while(input.hasNext()){
			n++;
			String ntest = input.nextLine();
			int number = Integer.parseInt(ntest);
			if(number == 0){
				break;
			}
			ArrayList<String> answer = new ArrayList<String>();
			for(int i=0;i<number;i++){
				String tmp = input.nextLine();
				answer.add(tmp);
			}
			String testnums = input.nextLine();
			int testnum = Integer.parseInt(testnums);
			ArrayList<String> sample = new ArrayList<String>();
			for(int i=0;i<testnum;i++){
				String tmp = input.nextLine();
				sample.add(tmp);
			}
			boolean fin = false;
			for(int i=0;i<number;i++){
				String tmp1 = answer.get(i);
				String tmp2 = sample.get(i);
				if(tmp1.equals(tmp2)){
					fin = true;
				}
				else{
					fin = false;
					break;
				}	
			}
			if(fin == true){
				System.out.printf("Run #%d: Accepted\n",n);
				continue;
			}
			boolean presentation = true;
			for(int i=0;i<number;i++){
				char a[] = answer.get(i).toCharArray();
				char b[] = sample.get(i).toCharArray();
				ArrayList<Character> aa = new ArrayList<Character>();
				ArrayList<Character> bb = new ArrayList<Character>();
				for(int j=0;j<a.length;j++){
					if(Character.isDigit(a[j])){
						aa.add(a[j]);
					}
					
					
				}
				for(int j=0;j<b.length;j++){
					if(Character.isDigit(b[j])){
						bb.add(b[j]);
					}
				}
				if(aa.size() != bb.size()){
					presentation = false;
					break;
				}
				for(int j=0;j<aa.size();j++){
					char aaa = aa.get(j);
					char bbb = bb.get(j);
					if(aaa == bbb){
						presentation = true;
					}
					else{
						presentation = false;
						break;
					}
				}
			}
			if(presentation == true){
				System.out.printf("Run #%d: Presentation Error\n",n);
				continue;
			}
			System.out.printf("Run #%d: Wrong Answer\n",n);
		}
		
		
	}

}