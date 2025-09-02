import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Character> nhap(){
        ArrayList<Character> a = new ArrayList<>();
        while(sc.hasNext()){
            char c = sc.next().charAt(0);
            a.add(c);
        }
        return a;
    }
    public static ArrayList<Character> thaydoi(ArrayList<Character> a){
        ArrayList<Character> res = new ArrayList<>();
        for(char c : a){
            if(c >= 'A' && c <= 'Z'){
                c += 32;
                res.add(c);
            }
            else if(c >= 'a' && c <= 'z'){
                c -= 32;
                res.add(c);
            }
            else res.add(c);
        }
        return res;
    }
    public static void print(ArrayList<Character> a){
        for(char c : a){
            System.out.print(c + " ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Character> a = nhap();
        ArrayList<Character> res = thaydoi(a);
        print(res);
    }
}
