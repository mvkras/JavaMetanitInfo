package Modul_project;
import java.awt.*;
import java.awt.event.*;  //При нажатии на кнопку, происходит какое-то действие
import javax.swing.*;  //Для формочек, надписей, полей

class GUI{
    public static void main(String[] args) {
        Simple_GUI gui=new Simple_GUI(); //создаем экземпляр класса Simple_GUI
        gui.setVisible(true); //сделать видимым форму
    }
}

public class Simple_GUI extends JFrame { //насдедуем класс, который позволяет создавать различные формочки
    private JButton button = new JButton("Enter"); //создаем кнопку и вводим надпись
    private JTextField text = new JTextField("",5); //текстовое поле размер 10 колонок
    private JLabel label = new JLabel("Введите сообщение: "); //надпись для формочки
    private JRadioButton choose0 = new JRadioButton("Выберете 1:"); // Позволяет выбирать из вариантов
    private JRadioButton choose1 = new JRadioButton("Выберете 2:"); //выбор из вариантов
    private JCheckBox checkBox = new JCheckBox("Подтвердить",false); //ставить галочку (согласиться с лицензией) по умолч не активна

    //---------------------------------------------------------Создаем конструктор--------------------------------------
    public Simple_GUI(){
    super("Simple_Example"); //передаем название формочки
      this.setBounds(950,350,400,200);  //делаем размер формочки где находится, размер, ширина, высота
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //формочка для закрытия операции, когда закроем формочку, будет означать, что операция выполнена
        Container container = this.getContentPane(); //это формочка в которую можем помещать все данные (кнопки, поля и тд)
        container.setLayout(new GridLayout(3,2,2,2)); //новые размеры в виде таблицы (строки, столбцы, отступы по вертикали и горизонтали)
        container.add(label); //помещаем надпись в контейнер
        container.add(text);  //помещаем поле ввода
        ButtonGroup group = new ButtonGroup();  //Сгруппируем кнопки для кнопок выбора
        group.add(choose0);  //группируем эту кнопку
        group.add(choose1); //с этой
        container.add(choose0); //добавляем кнопку в контейнер
        choose0.setSelected(true); //кнопка сразу будет выбрана
        container.add(choose1);
        container.add(checkBox);
        button.addActionListener(new ButtonEventListener()); //добавляет действия к кнопке позволит вызвать класс, в котором будет реализация действия
        //записываем класс, который будем вызывать (addActionListener(new) пока этот класс не создали
        container.add(button);
    }
    //Создаем класс для взаимодействия кнопки button.addActionListener
    class ButtonEventListener implements ActionListener {  //реализует интерфейс
        public void actionPerformed(ActionEvent e){  //какое-то событие передается в качестве параметра
            String message="";
            message += "Кнопка была нажата \n"; //к этой строке добавлеям следующие +=
            message +="Сообщение: " + text.getText()+"\n";
            message +=(choose0.isSelected()?"Вариант 1 ":"Вариант 2 ") + "Выбрано!\n"; //если выбрано, то 1й вариант, иначе 2й
            message += ((checkBox.isSelected()? "Галочка поставлена":"Галочка Не поставлена"));
            JOptionPane.showMessageDialog(null,message, "Output",JOptionPane.PLAIN_MESSAGE); //null будет новая панелька,
            // то что выводим message, название, и крайнее - простое какое-либо сообщение. Выводим новым окном, новое сообщение

        }
    }



}
