import java.util.Scanner;

//연습문제 14
public class AL_CH01_02_EX13 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int num = 0;
		
		do{
			System.out.print("수를 입력하세요 :");
			num = stdIn.nextInt();
		}while(num<=0);
		
		for(int i=1; i<=num; i++){
			for(int j=1; j<=num; j++){
				System.out.print("*");
			}System.out.println();
		}
	}
}
