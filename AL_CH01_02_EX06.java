import java.util.Scanner;

//실습1-6
public class AL_CH01_02_EX06 {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		int n = 0;
		do{
			System.out.print("n의 값 : ");
			n = stdin.nextInt();
		}while(n<=0);
		
		int sum = 0;
		for(int i=1; i<=n; i++)
			sum+=i;
		System.out.println("1에서부터 "+n+"까지의 합은 "+sum+"입니다.");
	}
}
