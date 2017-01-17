import java.util.Scanner;


public class Power {
	static int count=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String str = input.nextLine();
			if(str.equals(".")){
				break;
			}
			char a[]=str.toCharArray();
			
			String same="";
			
			for(int i=0;i<a.length;i++){
				same = same +a[i];
				if(same == str){
					break;
				}
				if(check(str,same) == true){
					break;
				}
				setcou(0);
			}
			if(same == str){
				System.out.printf("1");
			}
			else{
				//int c = getcou();
				System.out.print(getcou()+1);
			}
			System.out.println();
		}
		
	}//end main
	static boolean check(String str,String che){
		int lee = che.length();
		int count =0;
		if(str.length()%che.length()!=0){
			//System.out.println("Inpossible");
			return false;
		}
		for(int i=lee;i+lee-1<str.length();i=i+lee){
			String c = str.substring(i, i+lee);
			//System.out.printf("che:%s c:%s\n",che,c);
			if(!che.equals(c)){
				return false;
			}
			count++;
		}
		setcou(count);
		return true;
	}
	static void setcou(int cou){
		count = cou;
	}
	static int getcou(){
		return count;
	}

}
