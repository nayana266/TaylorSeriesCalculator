import java.util.Scanner;

public class TaylorExpansion {
    // calculating factorial
    public static long factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // taylor series approx. method
    public static void TaylorExpansion(double x, double a, int n){
        double sum = 0.0;
        for(int i = 0; i <=n; i++){
            if(i==0){
                sum+= Math.sin(a);
                System.out.println("f(" + x + ") ≈ " + sum);
            } else if (i==1) {
                sum += Math.cos(a) * (x - a);
                System.out.println("f'(" + x + ") ≈ " + sum);
            } else if(i==2){
                sum += -Math.sin(a) * (x - a) * (x - a) / factorial(2);
                System.out.println("f''(" + x + ") ≈ " + sum);
            } else if (i == 3) {
                sum += -Math.cos(a) * (x - a) * (x - a) * (x - a) / factorial(3);
                System.out.println("f'''(" + x + ") ≈ " + sum);
            }

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the center: ");
        double a = scanner.nextDouble();


        System.out.print("Enter the value of x you want to approximate: ");
        double x = scanner.nextDouble();

        System.out.println("First four nonzero terms of the Taylor series approximation:");
        TaylorExpansion(x, a, 3);

        scanner.close();
    }


}