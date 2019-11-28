import java.util.Scanner;


public class AL_CH01_02_EX02 {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.println("n의 값 : ");
		int n = stdin.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++){
			sum += i; //명령문을 실행한 다음 업데이트문 실행
		}
		System.out.println("합계 : " + sum);
	}
}
