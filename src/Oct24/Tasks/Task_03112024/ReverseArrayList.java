import java.util.*;

    public class ReverseArrayList {
        public static void main(String[] args) {

            List<Integer> list = new ArrayList<>(Arrays.asList(60, 55, 21, 67, 10));
            Collections.reverse(list);

            System.out.println("Reversed ArrayList: " + list);
        }
    }



