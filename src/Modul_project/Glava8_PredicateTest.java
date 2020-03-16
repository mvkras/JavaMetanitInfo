package Modul_project;
import java.util.function.Predicate;
import java.util.function.Function;
public class Glava8_PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> isPositive=x->x>0;
        System.out.println(isPositive.test(-7));

        Function<Integer,String> convert=x->x+ " долларов";
        System.out.println(convert.apply(12));
    }
}

