import java.util.Scanner;
class StepTracker {
    Converter converter = new Converter();
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;
    StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца от 1 до 12 (включительно):");
        int month = scanner.nextInt();
        if (month > 0 && month < 13) {
            System.out.println("Введите день от 1 до 30 (включительно):");
            int day = scanner.nextInt();
            if (day > 0 && day < 31) {
            System.out.println("Введите количество шагов:");
                int step = scanner.nextInt();
                if (step > 0) {
                monthToData[month-1].days[day - 1] = step;
                } else {
            System.out.println("Введеное вами значение " + step + " неверно. " + " Используйте положительное значение!");
                }
            } else {
            System.out.println("Под номером " + day + " нет дня!");
            }
        } else {
            System.out.println("Под номером " + month + " нет месяца!");
            }
    }
    void changeStepGoal() {
        System.out.println("Ваша текущая цель состовляет: " + goalByStepsPerDay + " шагов.");
        System.out.print("Укажите новую цель: ");
        goalByStepsPerDay = scanner.nextInt();
        System.out.println("Тукущая цель изменилась! Теперь она состовляет: " + goalByStepsPerDay + " шагов.");
    }
    void printStatistic() {
        System.out.print("Введите номер месяца :");
        int month = scanner.nextInt();
        MonthData selectMonth = monthToData[month - 1];
        System.out.println("Количество пройденых шагов по дням:");
        selectMonth.printDaysAndStepsFromMonth();
        System.out.println("Количество пройденых шагов за месяц: " + selectMonth.sumStepsFromMonth());
        System.out.println("Максимальное количество шагов в месяце за день: " + selectMonth.maxSteps());
        System.out.println("Среднее количество шагов в месяце: " + (selectMonth.sumStepsFromMonth() / 30));
        System.out.println("Пройденная дистанция в месяце: " + (converter.convertToKm(selectMonth.sumStepsFromMonth())) + " километров.");
        System.out.println("Количество сожжённых килокалорий в месяце: " + (converter.convertStepsToKilocalories(selectMonth.sumStepsFromMonth())));
        System.out.println("Лучшая серия выполнения цели в этом месяце составляет: " + selectMonth.bestSeries(goalByStepsPerDay) + " дней.");
    }
}














