package Modul_project;
import java.util.stream.Stream;

public class Glava10_Stream_Filter {
    public static void main(String[] args) {
        Stream<Phone> tel=Stream.of(new Phone("Nokia",7400),new Phone("Lumia",8200),new Phone("Samsung",10400));
        System.out.print("Цена телефона менее 10 тыс.: ");
        tel.filter(t->t.getPrice()<10000).forEach(t->System.out.print(t.getName()+" "+t.getPrice()+", "));
        //tel.map(p->p.getName()).forEach(p->System.out.print(p+" "));
    }
}

class Phone{
    private String name;
    private int price;
    //Создаем конструктор и передадим туда все эти параметры:
    public Phone(String name, int price){
        this.name=name;
        this.price=price;
    }
    //Создаем метода класса телефон
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(){
        this.price=price;
    }
}