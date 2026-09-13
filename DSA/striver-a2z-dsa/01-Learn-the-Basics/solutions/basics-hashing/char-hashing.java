public class Main {
    public static void main(String[] args) {

        String s = "aabbc";

        int[] hash = new int[26];

        // Store frequency
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        // Print frequency
        System.out.println("a = " + hash['a' - 'a']);
        System.out.println("b = " + hash['b' - 'a']);
        System.out.println("c = " + hash['c' - 'a']);
    }
}
