package Modul_project;

public class Glava10_Referense {
    public static void main(String[] args) {
        {
            int m = 5;
            int n = 6;

            System.out.println("M=" +m+ " N=" + n);
            int a = m, b = n;

            int c = a;
            a = b;
            b = c;

            System.out.println("M=" +m+ " N=" + n);
        }
        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int count=0;
        for(int i:numbers){

            if(i > 0) count++;
        }
        System.out.println(count);
    }
}
