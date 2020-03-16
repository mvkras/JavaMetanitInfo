package Modul_project;
import java.util.stream.Stream;

public class Glava10_Stream_forEach {
    public static void main(String[] args) {
        Stream<String> city = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        city.forEach(s -> System.out.print(s+", "));

        Stream<Integer> numbers=Stream.of(1,4,5,3,8,2,10);
        numbers.forEach(n->System.out.print(n+", "));

        Stream<String> country=Stream.of("Москва", "Воронеж", "Сочи", "Днепропетровск");
        country.filter(c->c.length()<=6).forEach(c->System.out.print(c+", "));

        Stream<String> coun=Stream.of("Москва", "Воронеж", "Сочи", "Днепропетровск");
        coun.filter(c->c.contains("Д")).forEach(c->System.out.print(c));
    }
}
