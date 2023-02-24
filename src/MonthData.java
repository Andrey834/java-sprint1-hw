import java.util.Scanner;
class MonthData {
    int[] days = new int[30];
    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i+1) + " день: " + days[i]);
        }
    }
    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps = sumSteps + days[i];
        }
        return sumSteps;
    }
    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i]>=maxSteps){
                maxSteps = days[i];
            }
        }
        return maxSteps;
        }

    int bestSeries(int goal) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i]>=goal) {
                if (++currentSeries > finalSeries) {
                    finalSeries = finalSeries +1;
                }
            } else {
                currentSeries = 0;
            }
        }
        return finalSeries;
    }
}
