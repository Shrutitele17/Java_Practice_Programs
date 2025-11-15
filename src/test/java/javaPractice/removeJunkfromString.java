package javaPractice;

public class removeJunkfromString {
    public static void main(String[] args) {

        String str1 ="@$^%^&% sele((&*nium *&^&* Testing";
        String str2 = str1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str2);

    }
}
