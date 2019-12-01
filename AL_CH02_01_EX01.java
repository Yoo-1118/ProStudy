//실습 2-1
public class AL_CH02_01_EX01 {
	public static void main(String[] args){
		int[] a = new int[5]; //배열의 생성
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1]*2;
		
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
		//출력 결과 0 37 51 0 74
	}
}
