import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		/*
		System.out.println("이름을 입력하세요");
		Scanner scanner = new Scanner(System.in); // 생성 instance 생성
		String name = scanner.next();
		System.out.println("나의 이름은" + name + "입니다");
		
		System.out.println("나이를 입력하시오");
		int age = scanner.nextInt();
		System.out.println("내 나이는" + age + "입니다");

		System.out.println("몸무게를 kg 단위로 입력하시오 ex) 66");
		double weight = scanner.nextDouble();

		System.out.println("키를 센치 단위로 입력하시오 ex) 180");
		double height = scanner.nextDouble();
		//18.5 보다 적으면 저체중
		//23보다 작으면 정상
		//25 과체중
		//나머지는 고도 비만
		double Height = height / 100;
	      double biman = weight / Height / Height;
	      
	      if(biman <18.5) {
	         System.out.println("저체중");
	      } else if(biman < 23) {
	         System.out.println("정상");
	      } else if(biman < 25) {
	         System.out.println("과체중");
	      } else if (biman < 30) {
	         System.out.println("비만");
	      } else {
	         System.out.println("고도비만");
	      }
		System.out.println("뭄무게는" + weight + "입니다");

		scanner.close();
		//삼항연산자...
		 * 
		 */
		int a = -10;
		int b = 20;
		System.out.println(a > b ? a - b : b - a); //첫번째 조건을 만족하면 앞에 것 아니면 뒤에 것을 사용한ㄷ
	}
}



