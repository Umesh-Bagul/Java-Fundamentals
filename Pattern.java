public class Pattern {

    public void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2(int n) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public void pattern9(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if(j%2 == 0){
                    System.out.print("0");
                }
                if(j%2 != 0){
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern p = new Pattern();
        System.out.println("Pattern 1 :");
        p.pattern1(5);
        System.out.println("Pattern 2 :");
        p.pattern2(10);
        System.out.println("Pattern 3 :");
        p.pattern3(5);
        System.out.println("Pattern 4 :");
        p.pattern4(5);
        System.out.println("Pattern 5 :");
        p.pattern5(10);
        System.out.println("Pattern 6 :");
        p.pattern6(10);
        System.out.println("Pattern 7 :");
        p.pattern7(5);
        System.out.println("Pattern 8 :");
        p.pattern8(5);
        System.out.println("Pattern 9 :");
        p.pattern9(5);
    }
}
