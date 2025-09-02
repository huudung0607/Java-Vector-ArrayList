import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), q = sc.nextInt();
        Vector<Vector<Integer>> v = new Vector<>(n);
        for(int i = 0 ; i < n ;i++){
            int m = sc.nextInt();
            Vector<Integer> tmp = new Vector<>(m);
            for(int j = 0; j < m ;j++){
                int x = sc.nextInt();
                tmp.add(x);
            }
            v.add(tmp);
        }
        for(int i = 0; i < q;i++){
            int x = sc.nextInt(), y = sc.nextInt();
            x--;y--;
            Vector<Integer> tmp = v.get(x);
            System.out.println(tmp.get(y));
        }
    }
}
