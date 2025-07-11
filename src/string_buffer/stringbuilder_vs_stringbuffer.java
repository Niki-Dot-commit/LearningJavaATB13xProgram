package string_buffer;

public class stringbuilder_vs_stringbuffer {
    public static void main(String[] args) {
        String s0 = "Pramod";
        String s1 = new String("Pramod");

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuilder stringBuilder = new StringBuilder("Pramod");



        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
