package deneme;

import java.util.Scanner;

public class odev_2 {
	
public static void main(String[] args) {
		
	int tahmin,ctrl=1;
	Scanner oku=new Scanner(System.in);
	
	int rndsayi=(int) (Math.random() * 100);
	do {
	System.out.print("\nTahmininiz :");
	tahmin=oku.nextInt();
	if(tahmin==rndsayi) {
		System.out.print("Tebrikler doğru bildiniz");
	}
	else if(tahmin>rndsayi) {
		System.out.print("Tahminin biraz büyüktü");
	}
	else {
		System.out.print("Tahminin biraz küçüktü");
	}
	//System.out.print("\ndevam etmek için 1 \nkapatmak için 0 girin : ");
	//ctrl=oku.nextInt();
	}while(tahmin!=rndsayi);
			
		
	}
}
