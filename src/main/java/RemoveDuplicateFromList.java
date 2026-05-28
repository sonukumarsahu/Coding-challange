import java.util.List;

public class RemoveDuplicateFromList {

    public static void main(String[] args)
    {
        List<Integer> list = List.of(1,2,2,3,4,4,5,1);

        List<Integer> uniqueList = list.stream().distinct().toList(); // Use when  don’t need to modify the result
       // List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList()); // Use when need to modify the result

        uniqueList.forEach(System.out::println);
    }
}
