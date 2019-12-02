import java.util.Random;

//연습문제2
public class AL_CH02_01_EX08 {
	static void swap(int[] a,int idx1,int idx2){
		int t=a[idx1]; a[idx1]=a[idx2]; a[idx2]=t;
	}
	static void reverse(int[] a){
		for(int i=0; i<a.length/2; i++){
			System.out.println("a["+i+"]과 (와) a["+(a.length-i-1)+"]를 교환합니다.");
			swap(a,i,a.length-i-1);
			for(int j=0;j<a.length;j++)
				System.out.print(a[j]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args){
		Random rand = new Random();
		int[] x = new int[6];
		for(int i=0; i<x.length; i++){
			x[i] = 1+rand.nextInt(100);
		}
		for(int j=0;j<x.length;j++)
			System.out.print(x[j]+" ");
		System.out.println();
		reverse(x);
	}
}
