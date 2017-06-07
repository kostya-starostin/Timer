package src;

import javax.swing.*;

public class Timer {
    public static void main(String[] args) {
        Events у = new Events();
        у.day = 12;
        у.name = "something";
        String str = "Добавлено новое событие:";
        str+="Дней до конца = "+у.day+"\n";
        str+="Событие="  +у.name+  "\n";
        JOptionPane.showMessageDialog(null, str);

    }
}
