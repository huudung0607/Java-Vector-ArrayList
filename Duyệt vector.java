import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i = 0 ; i < n ; i ++){
            list.add(sc.nextInt());
        }
        int l = sc.nextInt(), r = sc.nextInt();
        for(int i = l ; i <= r; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for(int i = r ; i >= l ; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
