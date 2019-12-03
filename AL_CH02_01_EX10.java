import java.util.Scanner;

//실습 2-7
public class AL_CH02_01_EX10 {
	static boolean equals(int[] a, int[] b){
		if(a.length!=b.length)
			return false;
		
		for(int i=0; i<a.length; i++){
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("배열 a의 요소수를 입력하세요 : ");
		int na = stdIn.nextInt();
		int[] a = new int[na];
		
		for(int i=0; i<a.length; i++){
			a[i] = stdIn.nextInt();
		}
		System.out.print("배열 b의 요소수를 입력하세요 : ");
		int nb = stdIn.nextInt();
		int[] b = new int[nb];
		
		for(int i=0; i<b.length; i++){
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("두 배열은 "+(equals(a,b)?"같습니다.":"같지 않습니다."));
		
	}
}
