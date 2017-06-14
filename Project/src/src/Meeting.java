package src;

import javax.swing.*;

/**
 * Created by bensonizabel on 14.06.17.
 */
public class Meeting extends Events{
    int day;
    String name;
    int priority;
    public void action(){
        String str = "Добавлено новое событие:";
        str+="Дней до конца = "+day+"\n";
        str+="Событие="  +name+  "\n";
        str+="Приоритет" +priority+ "\n";
        JOptionPane.showMessageDialog(null, str);
    }

}
