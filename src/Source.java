public class Source {
    public static void main(String[] args) {
    String hex = ("FF");
        System.out.println(hexToDec(hex)==255);
    }
    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString,16);
    }
}
