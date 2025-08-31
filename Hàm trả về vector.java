import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    public static boolean primeCheck(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static ArrayList<Integer> primeList(ArrayList<Integer> list){
        ArrayList<Integer>  tmp = new ArrayList<>();
        for(int i : list){
            if(primeCheck(i)){
                tmp.add(i);
            }
        }
        return tmp;
    }
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i = 0;i < n;i++){
            list.add(sc.nextInt());
        }
        ArrayList<Integer> tmp = primeList(list);
        for(int i : tmp){
            System.out.print(i + " ");
        }
    }
}
