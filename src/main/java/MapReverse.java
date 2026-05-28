import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MapReverse {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Sonu", 1);
        map.put("Rajesh", 10);
        map.put("Ramesh", 6);
        map.put("Ram", 4);

        Map<String, Integer> result = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                //OR
               // .sorted(Map.Entry.<String, Integer>comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a,b)->a,
                        LinkedHashMap::new));
        System.out.println(result);

        //OR

//        map.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));

    }
}
