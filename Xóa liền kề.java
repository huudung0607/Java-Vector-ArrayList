import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static Vector<Integer> uniqueVector(Vector<Integer> v){
        Vector<Integer> tmp = new Vector<>();
        tmp.add(v.get(0));
        for(int i = 1 ;i < v.size() ;i++){
            if(v.get(i - 1) != v.get(i)){
                tmp.add(v.get(i));
            }
        }
        return tmp;
    }
    public static Vector<Integer> nhap(){
        int n = sc.nextInt();
        Vector<Integer> v = new Vector<>();
        for(int i = 0 ;i < n;i++){
            v.add(sc.nextInt());
        }
        return v;
    }
    public static void in(Vector<Integer> v){
        for(int i = 0; i < v.size(); i++){
            System.out.print(v.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        Vector<Integer> v = nhap();
        Vector<Integer> res = uniqueVector(v);
        in(res);
    }
}
