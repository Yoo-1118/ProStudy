import java.util.Scanner;

//실습 1-8
public class AL_CH01_02_EX14 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		int num = 0;
		do{
			System.out.print("몇 단 삼각형입니까 ? ");
			num = stdIn.nextInt();
		}while(num<1);
		
		for(int i=1; i<=num; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}System.out.println();
		}
	}
}
