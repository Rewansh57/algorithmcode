import java.util.Scanner;
import static java.lang.Math.pow;

class Enter {
    public void num() {
        System.out.println("Enter the numbers a and b respectively");
    }
}
class trigo_function{
    Scanner scn=new Scanner(System.in);
    public double sin(){
        System.out.println("Enter the value of base  ");
        double x=scn.nextDouble();
        System.out.println("Enter the value of perpendicular ");
        double y=scn.nextDouble();
        System.out.println("Result: ");


        double z= Math.sqrt(x*x+y*y);

        return y/z;}
    public double cosine(){
        System.out.println("Enter the value of base  ");
        double x=scn.nextDouble();
        System.out.println("Enter the value of perpendicular ");
        double y=scn.nextDouble();
        System.out.println("Result: ");


        double z= Math.sqrt(x*x+y*y);


        return x/z;
    }
    public double tangent() {
        System.out.println("Enter the value of base  ");
        double x = scn.nextDouble();
        System.out.println("Enter the value of perpendicular ");
        double y = scn.nextDouble();
        System.out.println("Result: ");
        if (x == 0) {
            try {
                throw new MyExceptions();

            } catch (MyExceptions mex) {
                mex.Except_undefined();
            }
        }

        double z = Math.sqrt(x * x + y * y);
        return y / x;


    }}


class SpecialCase {
    public void maximumEffort(int a, int b) {
        if (a > 10000 || b > 10000) {
            try {
                throw new MyExceptions();
            } catch (MyExceptions mex) {
                mex.Except_maxinput();
            }
        }
    }
}

class MyExceptions extends Exception {
    public void Except_arithmetic() {
        System.out.println("You committed an arithmetic error");
    }

    public void Except_undefined() {
        System.out.println("You did a mathematical error");
    }

    public void Except_maxvalue() {
        System.out.println("You exceeded the value which the calculator can handle");
    }

    public void Except_maxinput() {
        System.out.println("Your input is too large to be calculated");
    }
}

class Operations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        if (a * b > 1000000) {
            try {
                throw new MyExceptions();
            } catch (MyExceptions mex) {
                mex.Except_maxvalue();
            }
        }
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            try {
                throw new MyExceptions();
            } catch (MyExceptions mex) {
                mex.Except_undefined();
            }
        }
        return a / b;
    }
    public double exponential_op(){
        System.out.println("Enter your number which you want to give an exponentially statement");

        Scanner scn=new Scanner(System.in);
        int a =scn.nextInt();
        System.out.println("Enter the exponent value");
        int b=scn.nextInt();
        if (a==0){
            try{
                throw new MyExceptions();

            }
            catch(MyExceptions mex){
                mex.Except_undefined();

            }
        }


      double b1 = Math.pow(a,b);

        return b1;
    }
    public double root_calculation(){
        Scanner scn=new Scanner(System.in);
        System.out.println("The number you want to the root of");
        double a=scn.nextDouble();
        System.out.println("The number you want to take the root with ");
        double b =scn.nextDouble();
        if (a==0){
            try{ throw new MyExceptions();}
            catch (MyExceptions mex){
                mex.Except_undefined();
            }
        }
        double c=Math.pow(a,1/b);
        return c;
    }}

class MatrixOperations {
    public void matrixAdd(int[][] array1, int[][] array2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("This is your added matrix:");
        printMatrix(result);
    }

    public void matrixSubtract(int[][] array1, int[][] array2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = array1[i][j] - array2[i][j];
            }
        }

        System.out.println("This is your subtracted matrix:");
        printMatrix(result);
    }

    public void matrixDeterminant() {
        Scanner scn = new Scanner(System.in);
        int[][] matrix = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter the value for matrix element [" + i + "][" + j + "]: ");
                matrix[i][j] = scn.nextInt();
            }
        }

        System.out.println("The determinant of your 2x2 matrix is: " +
                (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]));
    }



    public int determinant(int[][] matrix) {
        int n = matrix.length;
        int det = 0;

        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        for (int i = 0; i < n; i++) {
            det += matrix[0][i] * cofactor(matrix, 0, i);
        }

        return det;
    }

    public int cofactor(int[][] matrix, int row, int column) {
        int n = matrix.length;
        int[][] comatrix = new int[n - 1][n - 1];
        int minorRow = 0;

        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            int minorCol = 0;
            for (int j = 0; j < n; j++) {
                if (j == column) continue;
                comatrix[minorRow][minorCol] = matrix[i][j];
                minorCol++;
            }
            minorRow++;
        }

        int minorDet = determinant(comatrix);
        return (int) pow(-1, row + column) * minorDet;
    }

    public  void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

class Define {
    public int[][] Arraya() {
        Scanner scn = new Scanner(System.in);
        int[][] array1 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element for matrix 1 at [" + i + "][" + j + "]: ");
                array1[i][j] = scn.nextInt();
            }
        }

        System.out.println("This is your matrix 1:");
        printMatrix(array1);

        return array1;
    }

    public int[][] Arrayb() {
        Scanner scn = new Scanner(System.in);
        int[][] array2 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element for matrix 2 at [" + i + "][" + j + "]: ");
                array2[i][j] = scn.nextInt();
            }
        }

        System.out.println("This is your matrix 2:");
        printMatrix(array2);

        return array2;
    }

    private void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the operation you intend to do: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiply");
        System.out.println("4. Division");
        System.out.println("5. Matrix addition (only 3x3 order)");
        System.out.println("6. Matrix subtraction (only 3x3 order)");
        System.out.println("7. Determinant of a 2x2 Matrix");
System.out.println("8.The root calculation of any numbner of provided");

        System.out.println("9.Determinant of any square matrix");
        System.out.println("10.Exponent of any given value ");
        System.out.println("11.Calculating trignometric function sin");
        System.out.println("12.Calculating trignometric function cosine");
        System.out.println("13.Calculating trignometric function tangent");



        int ch = scn.nextInt();

        Enter et = new Enter();
        Operations op = new Operations();
        SpecialCase spc = new SpecialCase();
        MatrixOperations matop = new MatrixOperations();
        trigo_function trigo=new trigo_function();


        switch (ch) {
            case 1:
                et.num();
                int a1 = scn.nextInt();
                int b1 = scn.nextInt();
                spc.maximumEffort(a1, b1);
                System.out.println("Result: " + op.add(a1, b1));
                break;
            case 2:
                et.num();
                int a2 = scn.nextInt();
                int b2 = scn.nextInt();
                spc.maximumEffort(a2, b2);
                System.out.println("Result: " + op.subtract(a2, b2));
                break;
            case 3:
                et.num();
                int a3 = scn.nextInt();
                int b3 = scn.nextInt();
                spc.maximumEffort(a3, b3);
                System.out.println("Result: " + op.multiply(a3, b3));
                break;
            case 4:
                et.num();
                int a4 = scn.nextInt();
                int b4 = scn.nextInt();
                spc.maximumEffort(a4, b4);
                System.out.println("Result: " + op.divide(a4, b4));
                break;
            case 5:
                try {
                    matop.matrixAdd(new Define().Arraya(), new Define().Arrayb());
                } catch (Exception e) {
                    System.out.println("You encountered an error.");
                }
                break;
            case 6:
                try {
                    matop.matrixSubtract(new Define().Arraya(), new Define().Arrayb());
                } catch (Exception e) {
                    System.out.println("You encountered an error.");
                }
                break;
            case 7:
                try {
                    matop.matrixDeterminant();
                } catch (Exception e) {
                    System.out.println("You encountered an error.");
                }
                break;
            case 8:
                try{
                    op.root_calculation();

                }
                catch(Exception e ){
                    System.out.println("We encountered an error");

                }
                break;


            case 9:
                try {
                    System.out.println(matop.determinant(new Define().Arraya()));
                }
                catch(Exception e){
                    System.out.println("We found an error ");
                }
                break;

            case 10:
                try{System.out.println(op.exponential_op());}
                    catch(Exception e){
                    System.out.println("You encountered an error ");
                }
                break;
            case 11:
                try{
                        System.out.println(trigo.sin());}
                catch(Exception e){
                System.out.println("You encountered an error ");

            }
                break;
            case 12:
                try{
                    System.out.println(trigo.cosine());
                }
                catch(Exception e ){
                    System.out.println("You encountered an error ");
                }
                break;
            case 13:
                try{
                    System.out.println(trigo.tangent());

                }
                catch(Exception e ){
                    System.out.println("You encountered an error ");}
                break;
                default:

                System.out.println("Invalid option.");

        }


        scn.close();
    }
}
