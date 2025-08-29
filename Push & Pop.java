import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i = 0; i < n ;i++){
            int t = sc.nextInt();
            if(t == 1){
                list.add(sc.nextInt());
            }
            else if(t == 2){
                if(!list.isEmpty()){
                    list.remove(list.size() - 1);
                }
            }
        }
        if(list.isEmpty()) System.out.print("EMPTY");
        else{
            for(int i : list){
                System.out.print(i + " ");
            }
        }

    }
}
