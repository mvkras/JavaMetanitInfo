package Modul_project;

public class Glava9_MultyReading_THREAD {
    //--------------------------------------МНОГОПОТОЧНОСТЬ-------------------------------------------------------------

    public static void main(String[] args) {
        Thread th=Thread.currentThread();
        System.out.println(th);
        Thread th2=Thread.currentThread();
        th2.setName("Вторичный поток");
        System.out.println("Главный поток запущен? "+th.isAlive());
        System.out.println("Имя потока №2: "+th2.getName());
        System.out.print("Информация по потоку №2: "+th2);
        System.out.println("Вторичный поток запущен? "+th2.isAlive());
        th.interrupt();
        th2.interrupt();
    }
}
