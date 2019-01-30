package string;

public class test1 {
    public static void main(String[] args) {
        String a = "a";
        a += "c";
        StringBuilder sb = new StringBuilder();
        a.concat("ppp");
        sb.append(a);
        sb.append("ccc");
        Integer b = 50;
        System.out.println(sb);
    }
}
