package Modul_project;

import java.util.Arrays;

public class Glava8_Lambda {
    public static void main(String[] args) {
        Mathmatics math;        //интерфейс
        math = (a, b)-> a*b;       //лямбда выражение (в левой части параметры, в правой его действия)
        int result=math.calculate(15,4);
        System.out.println(result);
        math = (x,y)->x-y;
        int res=math.calculate(28,11);
        System.out.println(res);

        Printable printer = s->System.out.println(s);
        printer.print("HOME!");
        int[] m=new int[]{1,15,8,3,4,2};
        for(int k:m)
        {
            System.out.print(k+", ");
            Arrays.sort(m);
        }

    }
}

    interface Mathmatics {
        int calculate(int x, int y);   //Метод без реализации
    }

    interface Printable{
        void print(String s);
}