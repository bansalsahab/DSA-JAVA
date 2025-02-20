
public class Patterns {
    public static void hollow_rectangle(int totRows, int totCols) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // inner - columns
            for (int j = 1; j <= totCols; j++) {
                // cell -(i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundary cells
                    System.out.print("x");

                } else {
                    System.out.print(" ");

                }

            }
            System.out.println();
        }

    }

    public static void inverted_rotated_half_pyramid(int n) {
        // outer
        for (int i = 1; i <= n; i++) {
            // spACE
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid_number(int n) {
        // outer
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void zero_1triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");

                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }

    public static void Butterfly_pattern(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces -- n-i
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces -- n-i
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }

    public static void Solid_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // space

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void Hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // hollow rectangle - STARS
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Diamond(int n) {
        for (int i = 1; i <= n; i++) {
            // 1st half
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void main(String args[]) {
        hollow_rectangle(5, 10);
        inverted_rotated_half_pyramid(7);
        inverted_rotated_half_pyramid_number(5);
        zero_1triangle(5);
        Butterfly_pattern(5);
        Solid_Rhombus(8);
        Hollow_rhombus(5);
        Diamond(5);

    }
}
