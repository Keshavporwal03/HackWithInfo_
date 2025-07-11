import java.util.*;

public class Activity_selection_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        // Store index of activities and sort them by end time
        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) index[i] = i;

        Arrays.sort(index, (i, j) -> end[i] - end[j]);

        int count = 1;
        int lastEnd = end[index[0]];

        for (int i = 1; i < n; i++) {
            if (start[index[i]] >= lastEnd) {
                count++;
                lastEnd = end[index[i]];
            }
        }

        System.out.println(count);
    }
}
