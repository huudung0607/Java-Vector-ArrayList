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
        Collections.reverse(list);
        for(int i : list){
            System.out.print(i + " ");
        }
        System.out.println();
        Collections.reverse(list.subList(l,r + 1));
        for(int i : list){
            System.out.print(i + " ");
        }
    }
}
