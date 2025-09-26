import java.util.Scanner;

public class LongestRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập dãy số nguyên (nhấn Ctrl+D để kết thúc):");

        int prev = -1;
        int cnt = 0;
        int maxCnt = 0;
        int maxVal = 0;

        while (sc.hasNextInt()) {
            int val = sc.nextInt();

            if (cnt == 0 || val != prev) {
                cnt = 1;
                prev = val;
            } else {
                ++cnt;
            }

            if (cnt > maxCnt) {
                maxCnt = cnt;
                maxVal = val;
            }
        }
        sc.close();

        if (maxCnt == 0) {
            System.out.println("Không có dữ liệu đầu vào!");
        } else {
            System.out.println("Longest run: " + maxCnt + " consecutive " + maxVal + "s.");
        }
    }
}
