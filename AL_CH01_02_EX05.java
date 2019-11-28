import java.util.Scanner;
//연습문제9 정수 a,b의 합을 반환하는 메서드 sumof 작성하기

public class AL_CH01_02_EX05 {
	static int sumof(int a, int b){
		int sum=0,max=0,min =0;
		if(a>b){
			max = a;
			min = b;}
		else{
			max = b;
			min = a;}
		for(int i = min; i<=max; i++){
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int a = stdin.nextInt();
		System.out.print("두번째 정수 : ");
		int b = stdin.nextInt();
		int sum = sumof(a,b);
		System.out.println("합계 : " + sum);
	}
}
