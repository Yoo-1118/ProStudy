import java.util.Random;
import java.util.Scanner;

//연습문제 1
public class AL_CH02_01_EX06 {
	static int maxOf(int[] a){
		int max = a[0];
		for(int i=1; i<a.length; i++){
			if(a[i]>max) max=a[i];
		}
		
		return max;
	}
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 출력합니다.");
		int num = 2+rand.nextInt(9); //2~10명으로 범위 제한
		System.out.println("사람의 수는 "+num+"명 입니다.");
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i=0; i<num; i++){
			height[i] = 100+rand.nextInt(90); //100~189로 범위 제한
			System.out.println("height["+i+"] : "+height[i]+"cm");
		}
		System.out.println("키의 최댓값은 "+maxOf(height)+"cm입니다.");
	}
}
