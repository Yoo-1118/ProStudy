import java.util.Scanner;
//연습문제3
	public class AL_CH02_01_EX09 {
		static int sumOf(int[] a){
			int sum = 0;
			for(int i=0; i<a.length; i++)
				sum+=a[i];
			return sum;
		}
		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			int[] x = new int[5];
			for(int i=0;i<x.length;i++){
				System.out.print("x["+i+"] : ");
				x[i] = stdIn.nextInt();
			}
			
			System.out.println("요소의 합은 "+sumOf(x)+"입니다.");
		}
	}
