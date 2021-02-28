package utilities;

import java.util.Random;

public class Utility {
    public int generate5RandomNumbers() {
        Random ran = new Random();
        int fiveRandomNumbers = ran.nextInt(99999);

        return fiveRandomNumbers + 10000;

    }
}