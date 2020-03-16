package Modul_project;
import java.util.stream.Stream;
public class Glava10_Pracrise_Stream_ForEach_Filter {
    public static void main(String[] args) {
        Stream<Student> st= Stream.of(new Student("Дмитрий", "м", 25,3),
                new Student("Михаил","м",26,4),
                new Student("Настя","ж",24,2));
        st.filter(s->s.getAge()<=25).forEach(s->System.out.print(s.getName()+", "));
    }
}

class Student{
    private String name;
    private String sex;
    private int age;
    private int course;

    //Конструктор
    public Student(String name, String sex, int age, int course){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.course=course;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(){
        this.sex=sex;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age=age;
    }
    public int getCourse(){
        return course;
    }
    public void setCourse(){
        this.course=course;
    }
}