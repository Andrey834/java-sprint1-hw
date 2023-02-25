import java.util.Scanner;
import java.util.Date;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        StepTracker stepTracker = new StepTracker(scanner);

        while (true) {
            System.out.println(date);
            printMenu();
            int i = scanner.nextInt();
            if (i == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (i == 2) {
                stepTracker.changeStepGoal();
            } else if (i == 3) {
                stepTracker.printStatistic();
            } else if (i == 4) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }
    static void printMenu() {
        System.out.println("Введите команду");
        System.out.println("1. Ввод количество шагов за определённый день.");
        System.out.println("2. Изменить цель по количеству шагов в день.");
        System.out.println("3. Напечатать статистику за определённый месяц.");
        System.out.println("4. Выход.");
        System.out.print("Ввод:");
    }
}
