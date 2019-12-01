package practice;

import java.util.Scanner;
//연습문제15~17 복습
public class practice {
/*	static void triangleLB(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print('*');
			}System.out.println();
		}
	}
	static void triangleLU(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=(n-i)+1;j++){
				System.out.print('*');
			}System.out.println();
		}
	}
	static void triangleRU(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i-1;j++){
				System.out.print(' ');
			}
			for(int j=1;j<=(n-i)+1;j++){
				System.out.print('*');
			}System.out.println();
		}
	}
	static void triangleRB(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i; j++){
				System.out.print(' ');
			}
			for(int j=1; j<=i; j++){
				System.out.print('*');
			}System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 단 삼각형입니까?");
		int n = stdIn.nextInt();
		System.out.println("triangleLB");
		triangleLB(n);
		System.out.println("triangleLU");
		triangleLU(n);
		System.out.println("triangleRU");
		triangleRU(n);
		System.out.println("triangleRB");
		triangleRB(n);
	}*/
	static void spira(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i; j++){
				System.out.print(' ');
			}
			for(int j=1; j<=(i-1)*2+1; j++){
				System.out.print('*');
			}System.out.println();
		}
	}
	static void nspira(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i; j++){
				System.out.print(' ');
			}
			for(int j=1; j<=(i-1)*2+1; j++){
				System.out.print(i%10);
			}System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 단 피라미드입니까?");
		int n = stdIn.nextInt();
		spira(n);
		nspira(n);
	}
}
