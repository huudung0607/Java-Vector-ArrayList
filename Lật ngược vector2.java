import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    public static ArrayList<Integer> rev(ArrayList<Integer> list){
        ArrayList<Integer>  tmp = new ArrayList<>();
        for(int i = 0; i < list.size()/2 ;i++){
            int a = list.get(i);
            list.set(i,list.get(list.size() - i - 1));
            list.set(list.size() - i - 1,a);
        }
        for(int i = 0; i < list.size();i++){
            tmp.add(list.get(i));
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
        ArrayList<Integer> tmp = rev(list);
        for(int i : tmp){
            System.out.print(i + " ");
        }
    }
}
