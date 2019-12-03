import java.util.Scanner;

//연습문제 5
public class AL_CH02_01_EX12 {
	static void rcopy(int[] a, int[] b){
		for(int i=0; i<a.length; i++){
			a[a.length-1-i] = b[i];
		}
		System.out.println("복사를 완료했습니다.");
		for(int i=0; i<a.length; i++)
			System.out.println("a["+i+"] : "+a[i]);
		for(int i=0; i<b.length; i++)
			System.out.println("b["+i+"] : "+b[i]);

	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 b의 요소수을 입력하세요 : ");
		int nb = stdIn.nextInt();
		int[] b = new int[nb];
		int[] a = new int[nb];
		
		System.out.println("배열 b의 요소값을 입력하세요 : ");
		for(int i=0; i<b.length; i++){
			b[i] = stdIn.nextInt();
		}
		rcopy(a,b);
		
	}
}
