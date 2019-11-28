import java.util.Scanner;
//연습문제8 가우스 공식으로 1부터 n까지의 합계 나타내기

public class AL_CH01_02_EX04 {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.print("n의 값 : ");
		int n = stdin.nextInt();
		
		int sum = (n+1)*n/2;
		System.out.println(sum);
	}
}
