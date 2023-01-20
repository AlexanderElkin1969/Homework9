public class Main {
    public static void main(String[] args) {
        int costs[] = new int[30];
        int minCost, maxCost, midCost, totalCost = 0;
        for (int i = 0; i < costs.length; i++) {
            costs[i] = (int) (100_001 * Math.random()) + 100_000;   //Math.random() возвращает случайное число из интервала [0,1)
        }
        System.out.println("Задача 1");
        System.out.println("Задача 2");
        System.out.println("Задача 3");
        System.out.println("Задача 4");
    }
}