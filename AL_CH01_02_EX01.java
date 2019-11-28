import java.util.Scanner;


public class AL_CH01_02_EX01 {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.println("n의 값 : ");
		int n = stdin.nextInt();
		
		int i=1;
		int sum=0;
		while(i<=n){
			sum += i;
			i++;
			System.out.println("i값 : " + i); //i는 다음 반복에 더해질 값이다. 따라서 최종 i값은 n이 아닌 n+1이다.
		}
		
		System.out.println("합계 : " + sum); //최종 sum값은 최종 i값이 더해지기 전의 값이다.
	}
}
