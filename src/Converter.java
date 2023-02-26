class Converter {
    int convertToKm(int steps) {
        int stepsToKm = (steps * 75) / 100000;
        return stepsToKm;
    }
    int convertStepsToKilocalories(int steps) {
        int stepsToKilocolries = (steps * 50) / 1000;
        return stepsToKilocolries;
    }
}