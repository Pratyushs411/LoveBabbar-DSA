public class pattern_07 {
    public static void main(String args[]) throws Exception {
        int n = 4;

        // System.out.println("Enter the value of n : ");
        // Input n

        int i = 1;

        while(i <= n) {
            int j = 1;
            int count = i;

            while(j <= i) {
                System.out.print(count + " ");
                j++;
                count++;
            }

            System.out.print("\n");
            i++;
        }
    }
}