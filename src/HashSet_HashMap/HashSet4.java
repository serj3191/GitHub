package HashSet_HashMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class HashSet4 {

    public static void main(String[] args) {

        String str = "  BATCH  IT APPLE   TESLA IT    TESLA    JOHN  MAN   TEA  MAN";
        str =str.trim();
        String [] ar = str.split("\\s+");
        HashSet<String> set = new HashSet<>(Arrays.asList(ar));

        for (String each : set){
            int count =0;
            for (String each1 :ar){
                if (each.equals(each1)){
                    count+=1;
                }
            }
            System.out.print(each+": "+count+", ");
        }


    }
}
