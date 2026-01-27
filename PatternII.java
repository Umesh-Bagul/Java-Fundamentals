public class PatternII {
    void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    void pattern2(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 65; j < 65 + i; j++) {
                char ch = (char) j;
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 65; j <= 65 + n - i; j++) {
                char ch = (char) j;
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    void pattern5(int n) {
         for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){
              System.out.print(" ");
            }
             for(int k = 65; k<65+i; k++){
                char ch = (char)k;
                System.out.print(ch);
              }
              for(int l = 65+i; l>=65; l--){
                char c = (char)l;
                System.out.print(c);
              }
            System.out.println();
        }
    }

    void pattern6(int n){
        for(int i = 0; i<n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("*");
            }
            for(int k = 1; k<=2*i; k++){
                System.out.print(" ");
            }
            for(int l = 1; l<=n-i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int k = 1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for(int l = 1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern7(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int k = 1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for(int l = 1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<n; i++){
            for(int j = n-i; j >= 1; j--){
                System.out.print("*");
            }
            for(int k = 1; k<=2*i; k++){
                System.out.print(" ");
            }
            for(int j = n-i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PatternII p = new PatternII();
        System.out.println("Pattern 1 : ");
        p.pattern1(4);
        System.out.println("Pattern 2 : ");
        p.pattern2(4);
        System.out.println("Pattern 3 : ");
        p.pattern3(4);
        System.out.println("Pattern 4 : ");
        p.pattern4(4);
        System.out.println("Pattern 5 : ");
        p.pattern5(4);
        System.out.println("Pattern 6 : ");
        p.pattern6(10);
        System.out.println("Pattern 7 : ");
        p.pattern7(10);

    }
}
