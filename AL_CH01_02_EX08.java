import java.util.Scanner;
//연습문제 11

public class AL_CH01_02_EX08 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int num = 0;
		do{
			System.out.print("정수를 입력하세요 :");
			num = stdIn.nextInt();
		}while(num<0);
		
		int no=0; //자릿수. 결과값이자 증가할 값
		while(num>0){
			num /= 10;
			no++;
		}
		System.out.println("그 수는 "+no+"자릿 수입니다.");
	}
}