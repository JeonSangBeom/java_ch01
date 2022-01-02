import java.util.Scanner;

public class GradeSwitch {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		String result = null;
		switch(score/10) {
		case 10:
//			result = "A";
//			break;
		case 9:
			result = "A";
			break;
		case 8:
			result = "B";
			break;
		case 7:
			result = "C";
			break;
		case 6:
			result = "D";
			break;
		default:
			result = "F";
		}
	
		System.out.println(result);
		scanner.close();
	}

}
