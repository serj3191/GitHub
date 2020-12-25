package HashSet_HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSet3 {


    public static void main(String[] args) {

        ArrayList<Character> ar = new ArrayList<>(Arrays.asList('A','B','C','D','C','A'));
        HashSet <Character> set = new HashSet<>(ar);
        System.out.println(set);

    }
}

