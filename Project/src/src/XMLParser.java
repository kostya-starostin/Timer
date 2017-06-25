/*
 Класс для создания и редактирования XML-файла, в котором хранится
 список событий пользователя
 
 Позволяет:
    - извлекать данные в виде строкового массива, характеризующего конкретное событие
    - записывать строковый массив (строго по форматы) данных в файл
    - редактировать параметры каждого отдельного события
    - удалять события

 Структура тэгов:
    <Event>
        <Number>Номер</Number>
        <Name>Название события</Name>
        <Time>Время окончания события</Time>
        <Remark>Примечание</Remark>
        <Priority>Приоритет</Priority>
    </Event>

 Структура строкового массива:
    {"Number", "Name", "Time", "Remark", "Priority"}
 */
package motivator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class XMLParser {

    // Набор свойств (тегов), описывающих событие
    private static final String[] PROPERTIES_LIST = {"Number",
                                                    "Name",
                                                    "Time",
                                                    "Remark",
                                                    "Priority"};

    // Количество свойств, описывающих  событие
    private static final int PROPERTIES_NUMBER = PROPERTIES_LIST.length;

    // Создать XML-файл
    public static void createXML(String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException,
            TransformerException {

        DocumentBuilderFactory DocumentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = DocumentFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();

        Element root = document.createElement("Events");
        document.appendChild(root);

        File file = new File(filename);

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(document), new StreamResult(file));
    }

    // Получить массив данных события по индексу index
    public static String[] getEvent(int index, String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException {

        String eventList[] = new String[PROPERTIES_NUMBER];

        DocumentBuilderFactory DocumentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = DocumentFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(filename);
        Node root = document.getDocumentElement();
        NodeList events = root.getChildNodes();

        for (int i = 0; i < events.getLength(); i++) {
            Node event = events.item(i);
            if (event.getNodeType() != Node.TEXT_NODE) {
                eventList[i] = event.getFirstChild().getTextContent();
            }
        }

        return eventList;
    }

    // получить полный список имеющихся событий в виде двумерного массива
    public static String[][] getAllEvents(String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException {

        DocumentBuilderFactory DocumentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = DocumentFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(filename);
        Node root = document.getDocumentElement();
        NodeList events = root.getChildNodes();

        int count = events.getLength();
        
        String s[][] = new String[count][PROPERTIES_NUMBER];
        
        for (int i=0; i < count; i++) {
            
            Node event = events.item(i);
            //String s[] = new String[PROPERTIES_NUMBER];
                    
            for (int j = 0; j < PROPERTIES_NUMBER; j++) {
                s[i][j] = event.getChildNodes().item(j).getTextContent();
            }
        }
        
        return s;
    }

    // Удалить событие с индексом index
    public static void removeEvent(int index, String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException,
            TransformerException {

        DocumentBuilderFactory DocumentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = DocumentFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(filename);
        Node root = document.getDocumentElement();
        NodeList events = root.getChildNodes();
        Node event = events.item(index);
        // удаляем событие с индексом index
        root.removeChild(event);

        // меняем порядковые номера оставшихся в списке событий, чтобы сохранить последовательность
        for (int i = 0; i < events.getLength(); i++) {
            event = events.item(i);

            event.getChildNodes().item(0).getFirstChild().setNodeValue(String.valueOf(i + 1));
        }

        writeDocument(document, filename);
    }

    // Редактировать событие с индексом index
    public static void editEvent(String[] EventList, String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException,
            TransformerException {

        DocumentBuilderFactory DocumentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = DocumentFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(filename);
        Node root = document.getDocumentElement();
        NodeList events = root.getChildNodes();
        Node event = events.item(Integer.parseInt(EventList[0]));

        for (int i = 0; i < PROPERTIES_NUMBER; i++) {
            event.getChildNodes().item(i).getFirstChild().setNodeValue(EventList[i]);
        }

        writeDocument(document, filename);
    }

    // Добавление нового события в конец XML-файла
    public static void addEvent(String[] eventList, String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException,
            TransformerFactoryConfigurationError,
            TransformerException,
            DOMException {

        DocumentBuilderFactory DocumentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = DocumentFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(filename);
        Node root = document.getDocumentElement();
        NodeList events = root.getChildNodes();

        int eventsNumber = events.getLength();

        // Создаем новую книгу по элементам
        Element event = document.createElement("Event");

        Element number = document.createElement("Number");
        number.setTextContent(String.valueOf(eventsNumber + 1));
        event.appendChild(number);

        for (int i = 1; i < PROPERTIES_NUMBER; i++) {
            Element e = document.createElement(PROPERTIES_LIST[i]);
            e.setTextContent(eventList[i]);
            event.appendChild(e);
        }

        root.appendChild(event);

        // Записываем XML в файл
        writeDocument(document, filename);
    }

    // Фунцкия для подсчёта количества записанных в файл событий
    public static int countEvents(String filename) throws
            ParserConfigurationException,
            SAXException,
            IOException {

        DocumentBuilderFactory DocumentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = DocumentFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(filename);
        Node root = document.getDocumentElement();
        NodeList events = root.getChildNodes();

        return events.getLength();
    }

    // Функция для сохранения DOM в файл
    private static void writeDocument(Document document, String filename) throws
            TransformerFactoryConfigurationError,
            TransformerException,
            IOException {

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(document);
        FileOutputStream fos = new FileOutputStream(filename);
        StreamResult result = new StreamResult(fos);
        transformer.transform(source, result);
    }

}
