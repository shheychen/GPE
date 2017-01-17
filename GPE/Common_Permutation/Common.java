import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String a = input.nextLine();
			String b = input.nextLine();
			//ArrayList<String> c = new ArrayList<String>();
			String c="abcdefghijklmnopqrstuvwxyz";
			char d[]=c.toCharArray();
			int e[]=new int[26];
			int f[]=new int[26];
			for(int i=0;i<a.length();i++){
				for(int j=0;j<d.length;j++){
					if(a.charAt(i)==d[j]){
						e[j]++;
					}
				}
			}
			for(int i=0;i<b.length();i++){
				for(int j=0;j<d.length;j++){
					if(b.charAt(i)==d[j]){
						f[j]++;
					}
				}
			}
			for(int i=0;i<26;i++){
				if(e[i]>0&&f[i]>0){
					if(e[i]<f[i]){
						for(int j=0;j<e[i];j++){
							System.out.print(d[i]);
						}
					}
					else{
						for(int j=0;j<f[i];j++){
							System.out.print(d[i]);
						}
					}
				}
			}
			System.out.println();
		}
	}

}
