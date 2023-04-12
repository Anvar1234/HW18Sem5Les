package Homework5;

import java.util.*;

/**
 * 1)Реализуйте структуру телефонной книги с помощью HashMap,
 * учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Task1 {

    public static Map<String, List<String>> getNamesAndPhone() {
        Map<String, List<String>> contacts = new HashMap<>();

        contacts.put("Иван Иванов", Arrays.asList("+7{981}-111-11-11", "8-9[31-111]-11-11"));
        contacts.put("Петр Петров", Arrays.asList("+7-982-222-22-22", "8-932-222-22-22"));
        contacts.put("Петр Иванов", Arrays.asList("+7-9(83-)333-33-33", "8-933-333-33-33"));
        contacts.put("Ивана Петрова", Arrays.asList("+7-984-444-44-44", "8-934-(444}-44-44"));
        contacts.put("Галина Шматько", Arrays.asList("+7-9-85-555-55-55"));
        System.out.println("Контакты в виде мапы: \n" + contacts + "\n");

        //подчистим номера от лишних знаков (удалим знаки скобок и другие).
        List<String> strToInt;

        for (var entry : contacts.entrySet()) {
            strToInt = new ArrayList<>(entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                strToInt.add(entry.getValue().get(i).trim().replaceAll("[+\\-()\"{}\\[\\]]", ""));
            }
            contacts.replace(entry.getKey(),strToInt);
        }
        return contacts;
    }

    public static void printAllContacts (Map<String, List<String>> contacts) {
        System.out.println("Телефонная книга: ");
        for(Map.Entry<String, List<String>> entry : contacts.entrySet()) {
            System.out.printf("Контакт: %s\tТел: %s\n", entry.getKey(), entry.getValue());
        }
    }
}


