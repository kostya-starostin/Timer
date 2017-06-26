/*
Класс определяет поток выполнения для какого-либо события.
При создании экземпляра ожидает получить на входе метку, в поле которой будет
отображаться результат, и время окончания события.
Чтобы заработало, надо в главном файле вот это прописать DurationThread dtr = new DurationThread(jLabel1, LocalDateTime.of(2017, 6, 26, 22, 44, 15));:
вот в этом блоке кода:
public NewJFrame() {
        initComponents();
        DurationThread dtr = new DurationThread(jLabel1,
                LocalDateTime.of(2017, 6, 28, 19, 30, 0));
    }
*/

package motivator;

import java.awt.Label;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class DurationThread {

    public DurationThread(JLabel label, LocalDateTime finish) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    // текущее время
                    LocalDateTime start = LocalDateTime.now();
                    // разница между текущим временем и временем окончания
                    Duration d = Duration.between(start, finish);

                    // сколько осталось дней, месяцев, часов, минут, секунд
                    long months = (long) (d.toDays() / 30.4);
                    long days = d.toDays();
                    long hours = d.toHours();
                    long minutes = d.toMinutes();
                    long seconds = d.toMillis() / 1000 % 60;

                    String res;

                    // в зависимости от оставшегося времени, отображаться будет только
                    // 2 самых длительных параметра, чтобы не перегружать интерфейс
                    if (months > 0) {
                        res = months + " месяца, " + Math.round(days % 30.4) + " дня";
                    } else if (days > 0) {
                        res = days + " дня, " + hours % 24 + " часов";
                    } else if (hours > 0) {
                        res = hours + " часов, " + minutes % 60 + " минут";
                    } else if (minutes > 0) {
                        res = minutes + " минут, " + seconds % 60 + " секунд";
                    } else {
                        res = seconds % 60 + " секунд";
                    }

                    // вывод текста в поле метки
                    label.setText(res);
                }
            }
        }
        ).start();
    }

}
