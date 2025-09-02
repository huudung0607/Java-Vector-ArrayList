import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void nhap(ArrayList<ArrayList<Integer>> a,int n, int m){
        for(int i = 0; i < n ;i++){
            ArrayList<Integer> tmp = new ArrayList<>(m);
            for(int j = 0 ;j < m ;j++){
                int x = sc.nextInt();
                tmp.add(x);
            }
            a.add(tmp);
        }
    }
    public static void xuat(ArrayList<ArrayList<Integer>> a , int n, int m){
        for(ArrayList<Integer> v : a){
            for(int i : v){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void lat(ArrayList<ArrayList<Integer>> a , int n,int m){
        for(ArrayList<Integer> tmp : a){
            Collections.reverse(tmp);
        }
    }
    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>(n);
        nhap(a,n,m);
        lat(a,n,m);
        xuat(a,n,m);
    }
}
