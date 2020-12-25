package HashSet_HashMap;

import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {

        HashMap<Character,Integer> map = new HashMap<>();

        int [] ar = {95, 68, 54, 84, 92, 90, 88, 75, 72, 65, 84, 89, 91, 71, 55};
        for (char i='A';i<70;++i){
            map.put(i,0);
            System.out.println(map);
            for (int each : ar){
                if (each >90){ map.put('A',map.get('A')+1);}
                else if (each >80){ map.put('B',map.get('B')+1);}
                else if (each >70){ map.put('C',map.get('C')+1);}
                else if (each >60){ map.put('D',map.get('D')+1);}
                else{ map.put('E',map.get('E')+1);}
            }
            System.out.println(map);



        }

    }
}

