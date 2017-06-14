package src;

import javax.swing.*;

public class Timer {
    public static void main(String[] args) {

Journey j = new Journey();
Meeting m = new Meeting();
Events e = new Events();

Events[]x = new Events[3];
x [0] = j;
x [1] = m;
x [2] = e;
        for (Events aX : x) aX.action();
    }
}
