import java.util.ArrayList;
import java.util.LinkedList;

public class TestLinkedlist {
    public static void main(String[] args){

        LinkedList<Integer> la = new LinkedList<>();
        la.add(1);
        la.add(2);
        //  System.out.println(ll);

        la.add(3);
        la.add(4);
        // System.out.println(ll);
        int n = la.get(2);
        // System.out.println(n+":::::::::::::::::::::::");

        //  for (int i=0;i<ll.size();i++){
        //    System.out.println(ll.get(i));
        for(int num:la){
            System.out.println(num);
        }
    }
}
