/*
Обеспечивает взаимодействие между GUI и XMLParser
*/
package motivator;

import java.io.IOException;
import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import java.time.*;
import java.util.*;
import javax.xml.transform.TransformerException;

public class EventsModelEditor {

    // Набор свойств (тегов), описывающих событие
    private static final String[] PROPERTIES_LIST = {"Number",
                                                    "Name",
                                                    "Time",
                                                    "Remark",
                                                    "Priority"};

    // Количество свойств, описывающих  событие
    private static final int PROPERTIES_NUMBER = PROPERTIES_LIST.length;

    // создаёт ListModel на основании данных, полученных из XML-файла
    private static DefaultListModel<String> createEventsModel(String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException {

        DefaultListModel<String> eventListModel = new DefaultListModel<String>();

        String eventList[][] = XMLParser.getAllEvents(filename);

        for (int i = 0; i < XMLParser.countEvents(filename); i++) {
            eventListModel.setElementAt(eventList[i].toString(), i);
        }

        return eventListModel;
    }

    // доваляет новое событие, записывает его в файл, возвращает ListModel
    public static DefaultListModel<String> addNewEvent(String[] Event, String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException,
            TransformerException {

        String s[] = new String[5];
        s[0] = String.valueOf(XMLParser.countEvents(filename));
        for (int i = 1; i < PROPERTIES_NUMBER; i++) {
            s[i] = Event[i - 1];
        }

        XMLParser.addEvent(s, filename);

        return createEventsModel(filename);
    }

    // завершает выбранное событие, удаляя его из файла, возвращает ListModel
    public static DefaultListModel<String> finishEvent(int index, String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException,
            TransformerException {

        XMLParser.removeEvent(index, filename);

        return createEventsModel(filename);
    }

    // изменяет приоритет события, записывает изменения в файл, возвращает ListModel
    public static DefaultListModel<String> changeEventPriority(int index, int priority, String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException,
            TransformerException {

        String[] event = XMLParser.getEvent(index, filename);
        event[PROPERTIES_NUMBER - 1] = String.valueOf(index);
        XMLParser.editEvent(event, filename);

        return createEventsModel(filename);
    }

    // изменяет время дедлайна, записывает изменения в файл, возвращает ListModel
    public static DefaultListModel<String> changeEventExecutionTime(
            int index, int year, int month, int day, String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException,
            TransformerException {

        String event[] = XMLParser.getEvent(index, filename);
        event[2] = String.valueOf(dateToSeconds(year, month, day));
        XMLParser.editEvent(event, filename);

        return createEventsModel(filename);
    }
    
    // извлекает из xml время дедлайна события с индексом index, возвращает его в секундах
    private static long getExecutionTime(int index, String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException {
        
        int timeIndex = Arrays.asList(PROPERTIES_LIST).indexOf("Time");
        String s = XMLParser.getEvent(index, filename)[timeIndex];
        
        return Long.parseLong(s);
    }

    // переводит год-месяц-день в секунды
    private static long dateToSeconds(int year, int month, int day) {

        Calendar c = new GregorianCalendar(year, month, day);
        long seconds = c.getTime().getTime();
        
        return seconds;
    }

    // кол-во секунд, оставшихся до окончания события
    private static long secondsRemain(int index, String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException {
        
        Date d = new Date();
        long currentTime = d.getTime();
        long finalTime = getExecutionTime(index, filename);        
        
        return finalTime - currentTime;
    }
     
}
