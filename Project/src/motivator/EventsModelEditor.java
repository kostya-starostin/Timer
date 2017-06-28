/*
Обеспечивает взаимодействие между GUI и XMLParser
 */
package motivator;

import java.io.IOException;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import java.util.*;
import javafx.util.converter.LocalDateTimeStringConverter;
import javax.xml.transform.TransformerException;

public class EventsModelEditor {

    // Набор свойств (тегов), описывающих событие
    private static final String[] PROPERTIES_LIST = {"Number",
        "Name",
        "Time",
        "Remark"};

    // Количество свойств, описывающих  событие
    private static final int PROPERTIES_NUMBER = PROPERTIES_LIST.length;

    // создаёт ListModel на основании данных, полученных из XML-файла
    public static DefaultListModel createEventsModel(String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException {

        DefaultListModel eventListModel = new DefaultListModel();

        String eventList[][] = XMLParser.getAllEvents(filename);

        for (int i = 0; i < XMLParser.countEvents(filename); i++) {
            eventListModel.insertElementAt(eventList[i][1], i);
        }

        return eventListModel;
    }

    // добавляет новое событие, записывает его в файл, возвращает ListModel
    public static DefaultListModel addNewEvent(String dateTime, String name,
            String remark, String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException,
            TransformerException {

        XMLParser.addEvent(dateTime, name, remark, filename);

        return createEventsModel(filename);
    }

    // завершает выбранное событие, удаляет его из файла, возвращает ListModel
    public static DefaultListModel finishEvent(int index, String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException,
            TransformerException {

        XMLParser.removeEvent(index, filename);

        return createEventsModel(filename);
    }

    // завершает активное событие, удаляет его из файла, возвращает ListModel
    public static DefaultListModel finishActiveEvent(String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException,
            TransformerException {

        int index = getMinimalTimeIndex(filename);
        if (index != -1) {
            XMLParser.removeEvent(index, filename);
        }

        return createEventsModel(filename);
    }

    // возвращает индекс события с минимальным временем дедлайна (ближайшего)
    public static int getMinimalTimeIndex(String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException {

        String[][] events = XMLParser.getAllEvents(filename);
        int countEvents = XMLParser.countEvents(filename);

        if (countEvents > 0) {
            LocalDateTime times[] = new LocalDateTime[countEvents];

            for (int i = 0; i < countEvents; i++) {

                LocalDate ld = LocalDate.parse(events[i][2].split(" ")[0], DateTimeFormatter.ISO_LOCAL_DATE);
                LocalTime lt = LocalTime.parse(events[i][2].split(" ")[1], DateTimeFormatter.ISO_LOCAL_TIME);
                LocalDateTime dateTime = LocalDateTime.of(ld, lt);
                times[i] = dateTime;
            }

            LocalDateTime res = times[0];
            int index = 0;

            for (int i = 1; i < countEvents; i++) {
                if (times[i].isBefore(res)) {
                    res = times[i];
                    index = i;
                }
            }

            return index;
        } else {
            return -1;
        }
    }

    public static String[] getActiveEventDateTime(String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException {

        String s[] = new String[2];
        int index = getMinimalTimeIndex(filename);

        if (index != -1) {
            String dateTime = XMLParser.getEvent(index, filename)[2];
            s[0] = dateTime.split(" ")[0];
            s[1] = dateTime.split(" ")[1];

        } else {
            s[0] = s[1] = " ";
        }

        return s;
    }
    
    
    public static String getActiveEventName(String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException {
        
        String name = "Выберите событие";
        int index = getMinimalTimeIndex(filename);
        
        if (index != -1) {
            name = XMLParser.getEvent(index, filename)[1];
        } 
        
        return name;
    }
    
    
    public static String getActiveEventRemark(String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException {
        
        int index = getMinimalTimeIndex(filename);
        
        String remark = "";
        if (index != -1) {
            remark = XMLParser.getEvent(index, filename)[3];
        } 
        
        return remark;
    }
}
