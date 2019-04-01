package deneme;

import java.util.Scanner;

public class odev_1 {
	
public static void main(String[] args) {
		
	System.out.print("Sınav Notunuz : ");
		Scanner oku=new Scanner(System.in);
		int puan=oku.nextInt();
		
		if(puan>=60) {
			System.out.print("Sınavı geçtiniz!");
		}
		else {
			System.out.print("Üzgünüz, sınavı geçemediniz.");
		}
			
		
	}
}
