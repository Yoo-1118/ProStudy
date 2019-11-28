import java.util.Scanner;

//연습문제10
public class AL_CH01_02_EX07 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int a=0,b=0;
		
/*		System.out.print("a값 :");
		a = stdIn.nextInt();
		System.out.print("b값 :");
		b = stdIn.nextInt();
		while(a>b){
			System.out.println("a보다 큰 값을 입력하세요");
			System.out.print("b값 :");
			b = stdIn.nextInt();
		}
		System.out.print(b+"-"+a+"="+(b-a));*/ //내가 푼 방식
		
		//답안
		System.out.print("a의 값：");
		a = stdIn.nextInt();

		b=0;
		while (true) {
			System.out.print("b의 값：");
			b = stdIn.nextInt();
			if (b > a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}

		System.out.println("b - a는 " + (b - a) + "입니다.");

	}
}
