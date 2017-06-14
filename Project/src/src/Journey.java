package src;

import javax.swing.*;

public class Journey extends Events{
    int day;
    String name;
    public void action(){
        String str = "Добавлено новое событие:";
        str+="Дней до конца = "+day+"\n";
        str+="Событие="  +name+  "\n";
        JOptionPane.showMessageDialog(null, str);
    }


}

