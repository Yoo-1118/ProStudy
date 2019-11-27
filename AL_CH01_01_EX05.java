import java.util.Scanner;


class Median {
	static int med3(int a, int b, int c){
	
		if(a>=b)
			if(b>=c)
				return b;
			else if(a>=c)
				return c;
			else
				return a;
		else if(a>c)
			return a;
		else if(b>c)
			return c;
		else
			return b;
			
	}
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : "); int a = stdin.nextInt();
		System.out.println("두번째 정수 : "); int b = stdin.nextInt();
		System.out.println("세번째 정수 : "); int c = stdin.nextInt();
		int med = med3(a,b,c);
		System.out.println(med);
	}
}
