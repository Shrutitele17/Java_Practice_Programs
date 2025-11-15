import java.util.ArrayList;

public class test {
    public static void main(String[] args){

        ArrayList<Integer> ll = new ArrayList<Integer>();
        ll.add(1);
        ll.add(2);
      //  System.out.println(ll);

        ll.add(3);
        ll.add(4);
       // System.out.println(ll);
int n = ll.get(2);
       // System.out.println(n+":::::::::::::::::::::::");

      //  for (int i=0;i<ll.size();i++){
        //    System.out.println(ll.get(i));
        //Advance for loop
            for(int num:ll){
                System.out.println(num);
            }
        }
    }

//}

