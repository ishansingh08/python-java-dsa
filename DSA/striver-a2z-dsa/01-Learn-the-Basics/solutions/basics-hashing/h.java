public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2};

        int[] hash = new int[10];

        // Store frequency
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        // Print frequency
        System.out.println("Frequency of 1: " + hash[1]);
        System.out.println("Frequency of 2: " + hash[2]);
        System.out.println("Frequency of 3: " + hash[3]);
    }
}
