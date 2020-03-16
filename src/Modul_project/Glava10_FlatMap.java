package Modul_project;
import java.util.stream.Stream;
public class Glava10_FlatMap {
    public static void main(String[] args) {
        Stream<Phone2> phoneStream = Stream.of(new Phone2("iPhone 6S", 54000), new Phone2("Lumia 950", 45000),
                new Phone2("Samsung Galaxy S6", 40000));

        phoneStream
                .flatMap(p->Stream.of(
                        String.format("название: %s  цена без скидки: %d", p.getName(), p.getPrice()),
                        String.format("название: %s  цена со скидкой: %d", p.getName(), p.getPrice() - (int)(p.getPrice()*0.2))
                ))
                .forEach(s->System.out.println(s));
    }
}

class Phone2 {
    private String name;
    private int price;

    //Создаем конструктор и передадим туда все эти параметры:
    public Phone2(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //Создаем метода класса телефон
    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }
}