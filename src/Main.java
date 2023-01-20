import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int costs[] = new int[30];
        int minCost = 200_000, maxCost = 0, midCost, totalCost = 0;
        for (int i = 0; i < costs.length; i++) {
            costs[i] = (int) (100_001 * Math.random()) + 100_000;   //Math.random() возвращает случайное число из интервала [0,1)
        }
        for (int i = 0; i < costs.length; i++) {
            totalCost += costs[i];
            if (minCost > costs[i]) minCost = costs[i];
            if (maxCost < costs[i]) maxCost = costs[i];
        }
        midCost = totalCost / 30;
        System.out.println("Задача 1");
        System.out.println("Сумма трат за месяц составила "+totalCost+" рублей");
        System.out.println("Задача 2");
        System.out.println("Минимальная сумма трат за день составила "+minCost+" рублей");
        System.out.println("Максимальная сумма трат за день составила "+maxCost+" рублей");
        System.out.println("Задача 3");
        System.out.println("Средняя сумма трат за месяц составила "+midCost+" рублей");
        System.out.println("Задача 4");
        char buffer;
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            buffer = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = buffer;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}