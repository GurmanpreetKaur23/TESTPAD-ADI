import java.util.Scanner;

class Main {
    static void primeFactors(int n, int i) {
        if (i > n) return;
        if (n % i == 0) {
            System.out.println(i);  
            primeFactors(n / i, i); 
        } else {
            primeFactors(n, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactors(n, 2); 
        sc.close(); 
    }
}
