package Modul_project;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

//-----------------------------------REDUCE()выполняет действия над объектами (+-/*)------------------------------------
public class Glava10_Stream_Reduce {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1,2,3,4,5,6);
        Optional<Integer> result = numbers.reduce((x,y)->x+y);
        System.out.println(result.get()); // 21

        int[] nums = {30, -4, 5, 29, 7, -8};
        Arrays.parallelSort(nums);
        for(int i: nums)
            System.out.println(i);
    }

}
