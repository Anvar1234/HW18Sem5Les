package Homework5;

import java.util.*;

/**
 * Пусть дан список сотрудников:
 * Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 */
public class Task2 {

    //Получаем список имен сотрудников:
    public static ArrayList<String> getArrayOfNames(String[] listOfEmployees) {
        ArrayList<String> listOfNames = new ArrayList<>();
        for (String fN : listOfEmployees) {
            listOfNames.add(fN);
        }
        return listOfNames;
    }

    //Получаем мапу с уникальными ключами, подсчитываем кол-во повторов имени:
    public static Map<String, Integer> getMapNamesAndCount(ArrayList<String> listOfNames) {
        Map<String, Integer> mapNamesAndCount = new HashMap<>();

        for (int i = 0; i < listOfNames.size() - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < listOfNames.size(); j++) {
                if (listOfNames.get(i).equals(listOfNames.get(j))) count++;
            }
            if (!mapNamesAndCount.containsKey(listOfNames.get(i))) {
                mapNamesAndCount.put(listOfNames.get(i), count);
            }
        }
        return mapNamesAndCount;
    }

    //Сортируем и выводим ключи и значения > 1:
    public static void sortedMap(Map<String, Integer> mapNamesAndCount) {

        Map<String, Integer> sortedMap = new HashMap<>(); //мапа для пройденных значений
        List<Integer> countOfName = new ArrayList<>(mapNamesAndCount.values()); //список значений входящей мапы
        Collections.sort(countOfName, Collections.reverseOrder()); //сортировка списка по убыванию
        //System.out.println(countOfName);

        //перебираем значения отсортированного по убыванию списка:
        for (int item1 : countOfName) {
            //перебираем энтрисеты:
                for (var employee : mapNamesAndCount.entrySet()) {
                    //перебираем и сравниваем значения:
                    if (employee.getValue() == item1 && (!sortedMap.containsKey(employee.getKey()))) {

                        System.out.println(employee.getKey() + "=" + item1);
                    }
                    //отсеиваем и помещаем в мапу использованных значений те,
                    // которые уже прошли или которые == 1, чтобы в дальнейшем по ним не проходить:
                    if(employee.getValue() == 1 || employee.getValue() == item1) sortedMap.put(employee.getKey(), 0);

                }
            }
        }
    }

