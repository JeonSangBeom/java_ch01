package Exec;

import java.util.Scanner;

public class Ex08 {
	public static boolean inRect(int x, 
								 int y, 
								 int rectx1, 
								 int recty1, 
								 int rectx2, 
								 int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("좌표 4개를 x1,y1, x2, y2 순서로 입력하시오.");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();

		//하나라도 겹쳐진 경우
		if(inRect(x1,y1,100,100,200,200) || 
		   inRect(x2,y2,100,100,200,200) || 
		   inRect(x1,y2,100,100,200,200) ||
		   inRect(x2,y1,100,100,200,200)
		   ) 
		{
			System.out.println("충돌");
		}
		else if(inRect(x1,y1,100,100,200,200) && 
				   inRect(x2,y2,100,100,200,200) && 
				   inRect(x1,y2,100,100,200,200) &&
				   inRect(x2,y1,100,100,200,200)
				   ) 
		{
			System.out.println("충돌");
		}
		else if(inRect(100,100,x1,y1,x2,y2) && 
				   inRect(100,200,x1,y1,x2,y2) && 
				   inRect(200,100,x1,y1,x2,y2) &&
				   inRect(200,200,x1,y1,x2,y2)
				   ) 
		{
			System.out.println("충돌");
		}
		else 
		{System.out.println("안충돌");}
		scanner.close();
	}
}
