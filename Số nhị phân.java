import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static Vector<Character> Convert(long n){
        Vector<Character> v = new Vector<>();
        while(n != 0){
            long r = n % 2;
            v.add((char)(r + '0'));
            n /= 2;
        }
        while(v.size() < 64){
            v.add('0');
        }
        Collections.reverse(v);
        return v;
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        for(int i = 0 ;i < t;i++){
            long n = sc.nextLong();
            Vector<Character> res = Convert(n);
            for(char x : res){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
