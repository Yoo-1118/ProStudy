import java.util.Scanner;

//연습문제 15
public class AL_CH01_02_EX15 {
	
	//왼쪽 아래가 직각인 삼각형
	static void triangleLB(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}System.out.println();
		}
	}
	//왼쪽 위가 직각인 삼각형
	static void triangleLU(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i+1; j++){
				System.out.print("*");
			}System.out.println();
		}
	}
	//오른쪽 위가 직각인 삼각형
/*	static void triangleRU(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i+1;j++){
				for(int k=1;k<=i-j;k++){
					System.out.print(" ");
				}System.out.print("*");
			}System.out.println();
		}
	}*/
	static void triangleRU(int n) { //해답
		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= i - 1; j++) 		// i-1개의 ' '를 나타냄 . 앞에서 공백 먼저 처리하였다.
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println();					// 개행(줄변환)
		}
	}
	
	//오른쪽 아래가 직각인 삼각형
	static void triangleRB(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i; j++)
				System.out.print(' ');
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		int num=0;
		
		do{
			System.out.print("몇 단 삼각형입니까? ");
			num = stdIn.nextInt();
		}while(num<1);
		
		System.out.println("왼쪽 아래가 직각인 삼각형");
		triangleLB(num);
		System.out.println("왼쪽 위가 직각인 삼각형");
		triangleLU(num);
		System.out.println("오른쪽 위가 직각인 삼각형");
		triangleRU(num);
		System.out.println("오른쪽 아래가 직각인 삼각형");
		triangleRB(num);
	}
}
