import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>(n);
        for(int i = 0 ; i < n ; i++){
            ArrayList<Integer> tmp = new ArrayList<>();
            int x = sc.nextInt(), y = sc.nextInt();
            tmp.add(x); tmp.add(y);
            a.add(tmp);
        }
        for(ArrayList<Integer> tmp : a){
            for(int i = 0; i < tmp.size() - 1;i++){
                double ans = Math.sqrt((tmp.get(i) * tmp.get(i) + tmp.get(i + 1) * tmp.get(i + 1)));
                System.out.printf("%.2f" + " ",ans);
            }
        }
    }
}
