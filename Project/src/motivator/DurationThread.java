/*
Класс определяет поток выполнения для какого-либо события.
При создании экземпляра ожидает получить на входе метку, в поле которой будет
отображаться результат, и время окончания события.
 */
package motivator;

import java.awt.Font;
import java.awt.FontMetrics;
import java.time.*;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;

public class DurationThread extends Thread {

    private JLabel label;
    private String finDateTime[];

    public DurationThread(JLabel label, String finDateTime[]) {
        this.label = label;
        this.finDateTime = finDateTime;
    }

    @Override
    public void run() {

        if (!finDateTime[0].equals(" ")) {
            while (true) {

                if (!Thread.interrupted()) {

                    LocalDateTime finish = LocalDateTime.of(
                            LocalDate.parse(finDateTime[0], DateTimeFormatter.ISO_LOCAL_DATE),
                            LocalTime.parse(finDateTime[1], DateTimeFormatter.ISO_LOCAL_TIME));

                    // текущее время
                    LocalDateTime start = LocalDateTime.now();

                    // разница между текущим временем и временем окончания
                    Duration d = Duration.between(start, finish);

                    if (d.isZero() || d.isNegative()) {
                        this.interrupt();
                        Font f = new Font(label.getFont().getName(), label.getFont().getStyle(), 24);
                        label.setFont(f);
                        label.setText("Список событий пуст");
                        return;
                    }

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

                    Font f = new Font(label.getFont().getName(), label.getFont().getStyle(), 36);
                    label.setFont(f);
                    label.setText(res);
                } else {

                    return;
                }
            }

        } else {
            Font f = new Font(label.getFont().getName(), label.getFont().getStyle(), 24);
            label.setFont(f);
            label.setText("Список событий пуст");
        }
    }
}
