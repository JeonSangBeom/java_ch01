package Exec;

import java.util.Scanner;

public class Ex06_Hyuck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 1~99������ ������ �Է��Ͻÿ�.");
		int num = scanner.nextInt();
		int newnum = num / 10;
		if (newnum == 3 || newnum == 6 || newnum == 9) {
			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
				System.out.println("�ڼ�¦¦");
			} else {
				System.out.println("�ڼ�¦");
			}
		} else {
			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
				System.out.println("�ڼ�¦");
			}
		}
	}

}
