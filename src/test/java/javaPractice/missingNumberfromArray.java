package javaPractice;

public class missingNumberfromArray {
    public static void main(String[] args) {
// make sum of all no in array ane then strore in one variable and add all
// elements in all total element from 1 to 7 then store it in another variable and substract it
// you will get missing no
        int a[] = {1,2,3,4,5,7};
        int sum =0;
        int sum1 =0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);
        for(int j=1;j<=7;j++){
            sum1+=j;
        }
        System.out.println(sum1);
        System.out.println("Missing No is"+ " "+ (sum1-sum));
    }
}
