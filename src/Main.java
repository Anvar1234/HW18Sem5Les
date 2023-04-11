import Homework5.Task2;

public class Main {
    public static void main(String[] args) {
        String[] listOfEmployees = new String[]{"Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Иван Ежов",
                "Павел Чернов",
                "Иван Иванов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Иван Иванов",
                "Мария Рыкова",
                "Анна Крутова",
                "Марина Лугова",
                "Анна Владимирова",
                "Петр Лыков",
                "Иван Мечников",
                "Петр Петин",
                "Петр Лыков",
                "Кристина Белова",
                "Иван Ежов",
                "Иван Ежов",
                "Иван Ежов"
        };

        //System.out.println(Task2.getArrayOfNames(listOfEmployees));
        //System.out.println(Task2.getMapNamesAndCount(Task2.getArrayOfNames(listOfEmployees)));
        Task2.sortedMap(Task2.getMapNamesAndCount(Task2.getArrayOfNames(listOfEmployees)));
    }

}