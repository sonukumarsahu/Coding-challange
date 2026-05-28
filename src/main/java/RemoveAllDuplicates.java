import java.util.stream.Collectors;


public class RemoveAllDuplicates {

    public static void main(String[] args) {
        String str = "aabbccddeeffgghh";

        String  result=str.chars().distinct()
                        .mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());

        System.out.println(result); // Output: "abcdefgh"
    }
}
