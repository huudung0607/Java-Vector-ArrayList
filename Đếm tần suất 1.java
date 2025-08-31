import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        LinkedHashMap<Integer,Integer> mp = new LinkedHashMap<>();
        for(int i = 0 ;i < n;i++){
            int x = sc.nextInt();
            mp.put(x, mp.getOrDefault(x,0) + 1);
        }
        for(Map.Entry<Integer,Integer> x : mp.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
