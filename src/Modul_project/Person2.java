package Modul_project;

import java.util.Scanner;

public class Person2 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Введите имя: ");
//        String name=sc.nextLine();
//        System.out.println(" Введите возраст: ");
//        int age=sc.nextInt();
//        System.out.println("Имя: "+name+", возраст: "+age);

//----------------------------------------------ПЕРЕЧИСЛЕНИЯ ENUM-------------------------------------------------------
        Day[] days_of_week=Day.values();
        for(Day d:days_of_week){
            System.out.println(d);
        }
        System.out.println("Какой день недели по счету, начиная с нуля: "+Day.Пятница+" "+Day.Пятница.ordinal());

    }

}
    enum Day {
        Понедельник,
        Вторник,
        Среда,
        Пятница,
        Четверг,
        Суббота,
        Воскресенье;

    }
