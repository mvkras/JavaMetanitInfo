package Modul_project;

public class Glava2_Cicles_FOR {
    public static void main(String[] args) {
        for(int i=25;i>=10;i-=5)
        {
           // System.out.print(i+", ");
        }

        int n = 10;
        for(int i=0, j = n - 1; i < j; i++, j--){

            System.out.println(i * j);
        }

        for (int z = 1; z < 10; z++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d\t",z * j);
            }
            System.out.println();
        }

        int population = 10000000;
        int born = 14;
        int death = 8;
        int dif = born - death;
        for(int i = 1; i <= 10; i++){
            population += population * dif / 1000;
        }
        System.out.println(population);
    }
}

