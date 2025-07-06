public class S2L40StringBuffer {
    //StringBuffer is thread safe and StringBuilder is not
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Raghav");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Goyal.");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.deleteCharAt(12);
        sb.append(" is a very good boy. He loves coding in Java.");
        System.out.println(sb);
        System.out.println(sb.capacity());
        String str = sb.toString();
        System.out.println(str);
        System.out.println(str);
        sb.insert(6, " Java");
        System.out.println(sb);
    }
}
