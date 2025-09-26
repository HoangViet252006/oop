package HW1;

import edu.princeton.cs.algs4.*;

/**
 * Chạy:
 *   javac -cp .:algs4.jar HW1/RandomWalk.java
 *   java  -cp .:algs4.jar HW1.RandomWalk 5
 */
public class RandomWalk {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int x = 0, y = 0;
        int steps = 0, len = 0, dir = 0;

        boolean done = false;

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledSquare(x, y, 0.45);
        StdDraw.show();
        StdDraw.pause(40);

        while (!done) {

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < len; j++) {
                    x += dx[dir];
                    y += dy[dir];

                    steps++;

                    if (Math.abs(x) > n || Math.abs(y) > n) {
                        done = true;
                        break;
                    }

                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(x, y, 0.45);
                    StdDraw.show();
                    StdDraw.pause(40);
                }
                if (done) break;
                dir = (dir + 1) % 4;
            }
            len++;
        }

        StdOut.println("Total steps = " + steps);
    }
}
