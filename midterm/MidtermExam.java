import java.util.Random;

public class MidtermExam {
    public static int roll(int faceNum) {
        Random rand = new Random();
        return rand.nextInt(faceNum) + 1;
    }

    public static String replace(String a, String b, String c) {
        System.out.println(a.length());
        String result = "";
        int i = 0;
        while(i<a.length()) {
            boolean match = false;
            if(i<=a.length()-b.length()) {
                String check = a.substring(i, i + b.length());
                if (check.equals(b)) {
                    match = true;
                }
            }
            if (match) {
                result += c;
                i += b.length();
            } else {
                result += a.charAt(i);
                i++;
            }
        }
        return result;
    }

    public static int sum(int n) {
        int sign = 1;
        if(n<0) {
            sign = -1;
        }
        n = Math.abs(n);

        int result = 0;
        for(int i=0; i<=n; i++) {
            result += Math.pow(i, 3);
        }
        result *= sign;
        return result;
    }

    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            System.out.println(roll(20));
        }
        System.out.println();

        System.out.println(replace("Todote is another Tuesdote.", "ote", "ay"));
        System.out.println();

        System.out.println(sum(5));
        System.out.println(sum(-10));
    }
}
