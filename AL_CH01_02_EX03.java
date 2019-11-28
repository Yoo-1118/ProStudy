import java.util.Scanner;
//연습문제 7

public class AL_CH01_02_EX03 {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.println("n의 값 : ");
		int n = stdin.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++){
			sum += i;
			if(i<n)
				System.out.print(i + " + ");
			else
				System.out.print(i);
		}
		System.out.println(" = "+sum);
		
	}
}
