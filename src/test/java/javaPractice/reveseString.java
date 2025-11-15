package javaPractice;

public class reveseString {
    public static void main(String[] args) {
        String str1 = "Shruti";
        String rev ="";
        int len = str1.length();
        for(int i=len-1;i>=0;i--)
        {
            rev = rev + str1.charAt(i);
        }
        System.out.println("Reverse String - "+rev);

        // reverse string using  StringBuffer
        StringBuffer bf = new StringBuffer(str1);
        String str3 ="";
        str3 = str3+bf.reverse();
        System.out.println("Reverse String using StringBuffer- "+str3);
    }
}
