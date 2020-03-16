package Modul_project;
import java.util.*;
import java.util.stream.Stream;

public class Glava10_Stream_Limit_Skip {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.addAll(Arrays.asList(
                new String[]{"Lumua", "Xiomi", "LG", "Samsung", "Honor", "Huawey", "RED", "SIX"}));
            int pageSize=2; //Размер элементов на странице
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.print("Выберете страницу(1-4): ");
            int page = sc.nextInt();
            if (page < 1 || page >4) break;
            list.stream().skip((page-1)*pageSize)
                    .limit(pageSize).forEach(l->System.out.print(l+" "));
        }

 List<String> names=new ArrayList<String>();
        names.addAll(Arrays.asList(new String[]{"Сэм","Дин","Джонатан","Сэмюэль", "Константин","Мордекай"}));
       Optional<String> any= names.stream().findAny();
        System.out.print(any.get());
    }
}

