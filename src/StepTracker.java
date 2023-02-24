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
        while (true) {
            System.out.println("Введите номер месяца от 1 до 12 (включительно)");
            int month = scanner.nextInt();

            if (month > 0 && month < 13) {
                System.out.println("Введите день от 1 до 30 (включительно) ");
                int day = scanner.nextInt();
                if (day > 0 && day < 31) {
                    System.out.println("Введите количество шагов");
                    int step = scanner.nextInt();
                    if (step > 0) {
                        monthToData[month-1].days[day - 1] = step;
                    } else {
                        System.out.println("Введеное вами значение " + step + "неверно." + "Используйте положительное значение");
                        break;
                    }
                } else {
                    System.out.println("Под номером " + day + " нет дня!");
                    break;
                }
            } else {
                System.out.println("Под номером " + month + " нет месяца!");
                break;
            }
            break;
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
        System.out.println("Количество пройденых шагов по дням:");
        monthToData[month-1].printDaysAndStepsFromMonth();
        System.out.println("Количество пройденых шагов за месяц: " + monthToData[month-1].sumStepsFromMonth());
        System.out.println("Максимальное количество шагов в месяце за день: " + monthToData[month-1].maxSteps());
        System.out.println("Среднее количество шагов в месяце: " + (monthToData[month-1].sumStepsFromMonth() / 30));
        System.out.println("Пройденная дистанция в месяце: " + (converter.convertToKm(monthToData[month-1].sumStepsFromMonth()) * 0.75) + " километров.");
        System.out.println("Количество сожжённых килокалорий в месяце: " + (converter.convertStepsToKilocalories(monthToData[month-1].sumStepsFromMonth()) / 1000));
        System.out.println("Лучшая серия выполнения цели в этом месяце состовляет: " + monthToData[month-1].bestSeries(goalByStepsPerDay) + " дней.");
    }
}














