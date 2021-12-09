import java.util.*;
import java.util.stream.Stream;

public class ReverseString {

    public String returnReverseStringWithFori(String s) {
        String result = "";
        String[] split = s.split(" ");
        for (int i = split.length - 1; i >= 0; i--) {
            result = result + split[i] + " ";
        }
        StringBuilder sb = new StringBuilder(result);
        return sb.toString().trim();

    }

    public String returnReverseStringsWithCollection(String s) {
        List<String> list = new ArrayList<String>(Arrays.asList(s.split(" ")));
        Collections.reverse(list);
        return String.join(" ", list).trim();
    }

    public String returnReverseStringWithLambdas(String s) {
        String result = " ";
        Stream<String> input = Arrays.stream(s.split(" "));
        List<String> output =
                input.collect(ArrayList::new,
                        (list, e) -> list.add(0, e),
                        (list1, list2) -> list1.addAll(0, list2));
        for (int i = 0; i < output.size(); i++) {
            result = result + " " + output.get(i);
        }
        return result.trim();
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String s = "   The input string will be a sentence and the output string should be. ";
        System.out.println("1.This is result with FORI: " + rs.returnReverseStringWithFori(s));
        System.out.println("2.This is result with STREAM: " + rs.returnReverseStringWithLambdas(s));
        System.out.println("3.This is the result with Collection: " + rs.returnReverseStringsWithCollection(s));
    }
}
