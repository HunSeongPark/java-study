/**
 * Created by Hunseong on 2022/02/10
 */
public class Conversion {
    public static void main(String[] args) {

        // 숫자 -> 문자
        int num = 3;
        char ch = 3 + '0';
        System.out.println(ch);

        // 문자 -> 숫자
        num = ch - '0';
        System.out.println(num);

        // 숫자,문자 -> 문자열
        String numStr = num + "";
        String chStr = ch + "";
        System.out.println(numStr);
        System.out.println(chStr);

        // 문자열 -> 숫자
        num = Integer.parseInt(numStr);
        System.out.println(num);

        // 문자열 -> 문자
        ch = chStr.charAt(0);
        System.out.println(ch);
    }
}