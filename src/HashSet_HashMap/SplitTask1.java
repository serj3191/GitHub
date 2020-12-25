package HashSet_HashMap;

import java.util.HashSet;

public class SplitTask1 {

    public static void main(String[] args) {
        String s = "Batch    21 is  the best   batch in    Cybertek";

        for (String each : s.split(" ")) {
            System.out.println(each);
        }

    }
}