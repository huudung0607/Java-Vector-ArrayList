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
        int q = sc.nextInt();
        for(int i = 0 ;i < q; i++){
            int t = sc.nextInt();
            if (t == 1){
                int idx = sc.nextInt(), num = sc.nextInt();
                list.add(idx,num);
            }
            else if(t == 2){
                int idx = sc.nextInt();
                list.remove(idx);
            }
        }
        if(list.isEmpty()) System.out.print("EMPTY");
        else {
            for(int i : list){
                System.out.print(i + " ");
            }
        }
    }
}
