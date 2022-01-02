import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		//Scanner 임포트해서 점수를 정수로 입력받기..
		/*
		 * 90 이상이면 A
		 * 80B
		 * 70C
		 * 60d
		 * 나머지 ㄹ
		 */
		
		Scanner scanner = new Scanner(System.in); //heap 영역
		System.out.println("점수를 입력하세요");
		int score = scanner.nextInt();//스캐너 한테 점수를 받을때
		String result = null;
		if(score >= 90) {
			result = "A";
		} else if(score>=80) {
			result = "B";
		}else if(score>=70) {
			result = "c";
		}else if(score>=60) {
			result = "d";
		}else {
			result = "F";
		}
		System.out.println("당신의 학점은 ==="+result);
		scanner.close();
	}

}
