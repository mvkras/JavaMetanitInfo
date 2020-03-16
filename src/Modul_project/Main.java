package Modul_project;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	final int x=10;
	int y=14;
	int z=x+y;
//	System.out.println("x= "+x+", y= "+y+";");
//	System.out.println(x+", "+y+";");
//	System.out.println("Сумма двух чисел равна: "+z);
//    System.out.print("Прием, как слышно меня? \n");
//		int a=5;
//		int b=6;
//		System.out.printf("a=%x; b=%x \n", a, b);
//		//String name = "Tom";
//		//int age = 30;
//		float height = 1.7f;
//		//System.out.printf("Name: %s  Age: %x  Height: %.2f \n", name, age, height);
//		//-------------------------------------------SCANNER ввод чисел в консоль---------------------------------------
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Введите свое имя: ");
//		String name=sc.next();
//		System.out.println("Напишите ваш возраст: ");
//		int age=sc.nextInt();
//		System.out.println("Ваша профессия: ");
//		String skills=sc.next();
//		System.out.println("Имя: "+name+", Возраст: "+age+", Профессия: "+skills+".");
//		sc.close();
		//--------------------------------------------------------------------------------------------------------------
int d=15;
int e=10;
boolean f=e!=d;  //e не равно d
boolean f1=e>d;
//System.out.println(f1);//-----------------------IF/ELSE---------------------------------------------------------------
		int a=25;
		int b=45;
		if(a>b)
		{
			System.out.println("Верно");
		}
		else {
			System.out.println("Ошибка");
		}

//---------------------------------------------SWITCH/CASE/BREAK--------------------------------------------------------
		int num = 3;
		int output = 0;
		switch(num){
			case 1: output = 3; break;
			case 2:
			case 3: output=45; break;
			case 4: output = 0; break;
			case 5: output = 12; break;
			default: output = 24;
		}
		System.out.println(output);

    }
}
