package HashSet_HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HashMap3 {

    public static void main(String[] args) {

        String str = "  BATCH  IT APPLE   TESLA IT    TESLA    JOHN  MAN   TEA  MAN";
        str =str.trim();
        HashMap <String,Integer> map = new HashMap<>();
        for (String each: str.split("\\s+")){
            if (map.containsKey(each)) {
                map.put(each,map.get(each)+1);   }
            else { map.put(each,1);}
        }
        System.out.println(map);


    }
}

