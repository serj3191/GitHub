package HashSet_HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class HashSet2 {

    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(5,6,18,6,5,2,4,3,9,3));
        HashSet <Integer> set = new HashSet<>(ar);
        System.out.println(set);
        ArrayList<Integer> ar2 = new ArrayList<>(set);
        Collections.sort(ar2);
        System.out.println(ar2);



    }
}
