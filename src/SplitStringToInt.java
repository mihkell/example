import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitStringToInt {

	public static void main(String[] args) {
		String str = "1_23_46";
		List<Integer> ints = Arrays.stream(str.split("_"))
															.map(Integer::parseInt)
															.collect(Collectors.toList());

	}

}
