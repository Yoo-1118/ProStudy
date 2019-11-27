import java.util.Scanner;

class Min3m{
	static int min3(int a, int b, int c){
		int min = a;
		
		if(b<min)
			min = b;
		if(c<min)
			min = c;
		
		return min;
	}

	
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.println("첫번째 정수 : "); int a = stdin.nextInt();
		System.out.println("두번째 정수 : "); int b = stdin.nextInt();
		System.out.println("세번째 정수 : "); int c = stdin.nextInt();
		int min = min3(a,b,c);
		System.out.println(min);
	}
}