import java.util.Scanner;

//연습문제 16
public class AL_CH01_02_EX16 {
	static void spira(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i+1; j++)
				System.out.print(' ');
			for(int j=1;j<=(i-1)*2 + 1;j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n=0;
		
		do{
			System.out.print("몇 단의 피라미드입니까?");
			n = stdIn.nextInt();
		}while(n<1);
		
		spira(n);
	}
}
