/**
 * Created by Hunseong on 2022/02/10
 */
public class Literal {
    public static void main(String[] args) {
        boolean bool = true;
        char ch = 'A';
        String str = "Hello";

        byte by = 127;
//        byte by2 = 128;  // (Error) byte type은 -128 ~ 127
        int i = 100;
        int oct = 0100; // 8진수
        int hex = 0x100; // 16진수
        int bin = 0b100; // 2진수
        long lon = 10_000_000_000L;
        long lon2 = 100;

        float fl = 3.141592f;
        float fl2 = 10f; // 10.0f
        double doub = 3.141592;
        double doub2 = 10.; // 10.0
        double doub3 = .10; // 0.10
        double doub4 = 1e3; // 1000.0 (10^3)
    }
}