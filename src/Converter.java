class Converter {
    int convertToKm(int steps) {
        int stepsToKm = steps / 1000;
        return stepsToKm;
    }
    int convertStepsToKilocalories(int steps) {
        int stepsToKilocolries = steps * (1000 / 50);
        return stepsToKilocolries;
    }
}


