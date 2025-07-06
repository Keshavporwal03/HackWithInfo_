import java.util.*;
public class ID_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] result = new int[n + 1];
        int low = 0, high = n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[n] = low;
        System.out.println(Arrays.toString(result));
    }
}
