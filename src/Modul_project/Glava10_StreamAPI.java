package Modul_project;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.*;

public class Glava10_StreamAPI {
    public static void main(String[] args) {
        int[] numbers = {-5, -6, -7, -3, -2, -1, 0, 4, 2, 1, 3};
        for (int i : numbers)
            System.out.print(i + " ");

        System.out.println("");
        Arrays.sort(numbers);
        System.out.print("Сортировка по возрастанию: ");
        for (int i : numbers) {
            //for(int i=0;i<numbers.length;i++)
            System.out.print(i + " ");
        }
        //------------------------------------------------STREAM API----------------------------------------------------
        System.out.println("");
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        System.out.print("StreamAPI: " + count);
        System.out.println("");
        

    }
}
