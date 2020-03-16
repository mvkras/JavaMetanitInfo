package Modul_project;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Glava10_Stream_Sorted {
    public static void main(String[] args) {
        List<String> phones=new ArrayList<String>();
        Collections.addAll(phones,"Nokia","Samsung","Lumia","Honor","LG","Huawey","Xiomi");
        phones.stream().filter(p->p.length()<20).sorted().forEach(p->System.out.print(p+" \n"));

        Stream<Books>book=Stream.of(new Books(1,"Ведьмак", 1600),
                new Books(2,"Властелин колец",1200),
                new Books(3,"S.P.Q.R.",800),
                new Books(4,"Незнакомцы на мосту",600));
        //book.forEach(b->System.out.print(b.getName()+" \n"));
        System.out.print("Цена книг, которые меньше 1200 рублей: ");
        book.filter(b->b.getPrice()<1200).forEach(b->System.out.print(b.getName()));

        List<Integer>numbers=new ArrayList<Integer>();
        Collections.addAll(numbers, 1,5,2,6,4,7,0,2);
        numbers.stream().sorted().distinct().forEach(n->System.out.print(n+" "));
    }
}

class Books{
    private String name;
    private int id;
    private int price;

    public Books(int id, String name,  int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}