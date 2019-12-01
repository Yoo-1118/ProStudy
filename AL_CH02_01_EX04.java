import java.util.Scanner;

//실습 2-4
public class AL_CH02_01_EX04 {
	static int maxOf(int[] a){
		int max = a[0];
		
		for(int i=1; i<a.length; i++)
			if(a[i]>max) max=a[i];
		return max;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수를 입력하세요 : ");
		int num = stdIn.nextInt();
		
		int[] height = new int[num]; //입력받은 사람 수를 배열의 길이로 지정
		
		for(int i=0; i<num; i++){
			System.out.print("height["+i+"] : ");
			height[i] = stdIn.nextInt();
		}
		
		System.out.print("최댓값은"+maxOf(height)+"입니다.");
	}
}
