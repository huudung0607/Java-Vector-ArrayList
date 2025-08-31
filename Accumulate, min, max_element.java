import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        long sum = 0;
        for(int i = 0 ; i < n ;i++) {
            list.add(sc.nextInt());
            sum += list.get(i);
        }
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(sum);
    }
}
