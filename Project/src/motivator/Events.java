package motivator;

import javax.swing.*;

/**
 * Created by bensonizabel on 07.06.17.
 */
public class Events {
    int day;
    String name;
    public void action(){
        String str = "Добавлено новое событие:";
        str+="Дней до конца = "+day+"\n";
        str+="Событие="  +name+  "\n";
        JOptionPane.showMessageDialog(null, str);
    }
   // public void Event() {
   //     System.out.println("это Event" + name);
    //    System.out.println("До конца осталось дней" + day);
   // }
    
}

