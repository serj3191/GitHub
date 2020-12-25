package HashSet_HashMap;

import java.util.ArrayList;

public class SplitTask2 {

    public static void main(String[] args) {


        ArrayList<String> ar = new ArrayList<>();
        ar.add("Bradd Pitt");
        ar.add("Johny Depp");
        ar.add("Angelina Jolie");
        ar.add("Pamela Anderson");
        ar.add("Keanu Reaves");
        for (String each: ar){
            System.out.println(each.split("\\s+")[1]);
        }

    }
}
