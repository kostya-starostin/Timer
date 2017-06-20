package src;


public class Timer {
// основной класс для тестирования структуры
    public static void main(String[] args) {
// создаем объекты, которые уже есть
        Journey j = new Journey();
        Meeting m = new Meeting();
        Events e = new Events();

        Events[] x = new Events[3];
        x[0] = j;
        x[1] = m;
        x[2] = e;
        for (Events aX : x) aX.action();
// проверяем что могут
    }
}
