import java.util.Scanner;

//연습문제6 복습
public class AL_CH02_01_EX15 {
	static int cardConv(int x, int r, char[] d){
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do{
			d[digits++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		for(int i=0;i<digits;i++){
			char temp = d[i];
			d[i] = d[digits-1-i];
			d[digits-1-i]=temp;
		}
		return digits;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int x;
		int r;
		char[] d = new char[32];
		System.out.println("10진수를 기수 변환합니다.");
		do{
			System.out.print("변환하는 음이 아닌 정수 : ");
			x = stdIn.nextInt();
		}while(x<0);
		do{
			System.out.print("어떤 진수로 변환할까요? (2-36)");
			r = stdIn.nextInt();
		}while(r<2||r>36);

		int dg = cardConv(x,r,d);
		System.out.print(x+"진수로는");
		for(int i=0; i<dg; i++)
			System.out.print(d[i]);
		System.out.println("입니다.");
	}
}
