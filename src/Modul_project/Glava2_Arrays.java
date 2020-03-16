package Modul_project;

public class Glava2_Arrays<x> {
    public static void main(String[] args) {
       Welcome();
       Math(15,62);
       Human("Agent, 47", 47);
       Summa(25,17,15,0,1,14,12,10);
        int[] x;  //Создаем массив
        x = new int[4];
        x[0] = 4;
        x[1] = 0;
        x[2] = 2;
        x[3] = 3;
        System.out.println(x.length - 1); //находим крайний индекс массива
        System.out.println(x[2]); //Находим значение по индексу 2
        for (int i : x) {
            System.out.print(i + " "); //выводим список значений массива
        }
        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int z = 0; z < array.length; z++) {
            array[z] = array[z] * 2;  //умножили на 2 массив
            System.out.print(array[z] + " ");
        }
        System.out.println(" ");

        int[][] nums = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < nums.length; i++) {        //Перебор по строкам
            for (int j = 0; j < nums[i].length; j++) { //Перебор по столбцам

                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }

    }
  public static void Welcome(){
        System.out.println("Welcome back, 47!");
    }
    public static int Math(int a, int b){
        int result=a+b;
        System.out.println("a +"+" b"+" = "+result);
        return result;
    }

    public static void Human(String name, int age){
        System.out.print(name);
        System.out.println(", Возраст "+age);
    }

    public static int Summa(int...numbers){
        int sum=0;
        for(int k:numbers)
            sum+=k;
        System.out.println("Сумма всех чисел равна: "+sum);
        return sum;
    }
}
