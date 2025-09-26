import java.util.Scanner;

public class ThreeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];

        System.out.println("Enter 3 integers:");
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }

        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < 3; i++) {
            if (min > nums[i]) min = nums[i];
            if (max < nums[i]) max = nums[i];
        }


        int median = nums[0] + nums[1] + nums[2] - min - max;


        System.out.println("Min: " + min);
        System.out.println("Median: " + median);
        System.out.println("Max: " + max);

        sc.close();
    }
}
