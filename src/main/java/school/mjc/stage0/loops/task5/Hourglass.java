package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        for (int i = 1; i <= height / 2 + 1; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= height - (2 * (i - 1)); j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        for (int i = height / 2 + 1 - 1; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= height - (2 * (i - 1)); j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}



