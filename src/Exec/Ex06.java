package Exec;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("Á¤¼ö 1~99»çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À.");
//	int num = scanner.nextInt();
//	int first = num/10;
//	int second = num%10;
//	int count = 0;
//	if(first%3==0 && first!=0) {
//		count++;
//	}
//	if(second%3==0 && second!=0) {
//		count++;
//	}
//	if(count==2) {
//		System.out.println("¹Ú¼öÂ¦Â¦");
//	}else if(count==1) {
//		System.out.println("¹Ú¼öÂ¦");
//	}else {
//		System.out.println("¹Ú¼öÄ¡¸é Á×À½...");
//	}
//	scanner.close();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~99 »çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À>>");
		int num = scanner.nextInt();

		if (num != 0 && num >= 1 && num <= 99) {
			int a, b;
			a = num / 10;
			b = num % 10;

			if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9)) {
				System.out.println("¹Ú¼ö Â¦Â¦");
			} else if ((a == 3 || a == 6 || a == 9) || (b == 3 || b == 6 || b == 9)) {
				System.out.println("¹Ú¼ö Â¦");
			}
		} else {
			System.out.println("¼ıÀÚÀÇ ¹üÀ§¸¦ ¹ş¾î³µ½À´Ï´Ù.");
		}
		scanner.close();
	}
}