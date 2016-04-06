import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(Arrays.asList("1", "2"));
        List<String> newList = Arrays.asList("3","4");
        
        newList.stream()
            .map(s -> doSomething(s))
            .collect(Collectors.toCollection(() -> arrayList));
        
        System.out.println(arrayList);
    }
    
    public static String doSomething(String s) {
        return s;
    }
}

