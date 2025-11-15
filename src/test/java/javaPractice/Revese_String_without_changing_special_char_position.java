package javaPractice;

public class Revese_String_without_changing_special_char_position {
    public static void main(String[] args) {
       // Using String Builder it uses the built-in reverse() method of StringBuilder.
//        String original = "Tom & Jerry";
//
//        StringBuilder sb = new StringBuilder(original);
//        String reversed = sb.reverse().toString();
//
//        System.out.println("Reversed String: " + reversed);
//
//        //Using loop iterative approach where characters are appended in reverse order
//        String original1 = "Hello World";
//        String reversed1 = "";
//
//        for (int i = original.length() - 1; i >= 0; i--) {
//            reversed1 += original1.charAt(i);
//        }
//
//        System.out.println("Reversed String: " + reversed1);

                /// ///////////////[^a-zA-Z0-9]
//        String input = "Aer@pl@ne=enl@pr@eA";
//        String result = input.replaceAll("[^a-zA-Z]", "");
//        StringBuilder reversed = new StringBuilder();
//
//        for (int i = result.length() - 1; i >= 0; i--) {
//            reversed.append(result.charAt(i));
//        }
//
//        System.out.println("Reversed String: " + reversed);
                //String input = "Aer@pl@ne";
                //String input = "Aer@pl@ne=enl@pr@eA";
                // String result = input.replaceAll("[^a-zA-Z]", "");
//        String reversed = reverse(input);
//        System.out.println("Original: " + input);
//        System.out.println("Reversed: " + reversed);
//    }
//    public static String reverse(String str) {
//        if (str == null || str.length() <= 1) {
//            return str;
//        }
//
//                return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
                // WAP to revrse string Original - Aer@pl@ne
                //Reverse - enl@pr@eA
                String input = "Aer@pl@ne";
        System.out.println(input);
        char[] stringArray = input.toCharArray();
        int j = stringArray.length-1;
        for( int i = 0; i < j;) {
            if(!Character.isAlphabetic(stringArray[i])) {

                i++;
            }else
            if(!Character.isAlphabetic(stringArray[j])) {
                j--;
            }else
            {
                char temp = stringArray[i];
                stringArray[i] = stringArray[j];
                stringArray[j] = temp;
                i++;
                j--;
            }
        }
        System.out.print(stringArray);
    }}



