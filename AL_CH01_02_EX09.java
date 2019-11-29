import java.util.Scanner;

//실습 1C-2
public class AL_CH01_02_EX09 {
	public static void main(String[] args){
		/*Scanner stdIn = new Scanner(System.in);
		int num =0;
		do{
			System.out.print("두 자리 정수를 입력하세요 :");
			num = stdIn.nextInt();
		}while(num<10||num>99); //1)계속 조건
		
		System.out.println("변수 num의 값은 "+num+"이 되었습니다.");*/
		
		Scanner stdIn = new Scanner(System.in);
		int num =0;
		do{
			System.out.print("두 자리 정수를 입력하세요 :");
			num = stdIn.nextInt();
		}while(!(num>10&&num<99)); //2)종료 조건의 부정
		
		System.out.println("변수 num의 값은 "+num+"이 되었습니다.");
	}
}
