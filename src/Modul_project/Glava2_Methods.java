package Modul_project;

import java.util.Scanner;

public class Glava2_Methods {
    public static void main(String[] args) {
        System.out.println(daytime(7));     // Good morning
        System.out.println(daytime(13));    // Good after noon
        System.out.println(daytime(18));    // Good evening
        System.out.println(daytime(2));     // Good night
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Введите значение");
            int x=sc.nextInt();
            if(x>=30){
                throw new Exception("Выход за пределы значения");
            }
             }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    static String daytime(int hour){

        if(hour<=6)
            return "ночь";
        else if (hour<=11)
            return "morning";
        else if (hour<=17)
            return "day";
        else if (hour<=5)
            return "night";
        else return "false";
    }

}
