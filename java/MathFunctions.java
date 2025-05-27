public class MathFunctions {

    // Add method: ikki sonni yig'indisini qaytaradi
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Sub method: ikki sonni ayirmasini qaytaradi
    public int sub(int a, int b) {
        return a - b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    // Multiply method: ikki sonni ko'paytmasini qaytaradi
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // Div method: ikki sonni bo'linmasini qaytaradi
    public double div(int a, int b) {
        if (b == 0) {
            System.out.println("Xatolik: Nolga bo'lish mumkin emas.");
            return Double.NaN;  // NaN (Not-a-Number) qiymatini qaytaradi
        } else {
            return (double) a / b;
        }
    }

    public double div(double a, double b) {
        if (b == 0) {
            System.out.println("Xatolik: Nolga bo'lish mumkin emas.");
            return Double.NaN;  // NaN (Not-a-Number) qiymatini qaytaradi
        } else {
            return a / b;
        }
    }

    // Absolute value method: bitta sonning absolyut qiymatini qaytaradi
    public int abs(int a) {
        return Math.abs(a);
    }

    public double abs(double a) {
        return Math.abs(a);
    }

    // Power method: bitta sonning kvadratini qaytaradi
    public int pow(int a) {
        return a * a;
    }

    public double pow(double a) {
        return a * a;
    }

    public static void main(String[] args) {
        MathFunctions math = new MathFunctions();

        // Test integer operations
        System.out.println("Integer add: " + math.add(10, 5));  // 15
        System.out.println("Integer sub: " + math.sub(10, 5));  // 5
        System.out.println("Integer multiply: " + math.multiply(10, 5));  // 50
        System.out.println("Integer div: " + math.div(10, 5));  // 2.0
        System.out.println("Integer abs: " + math.abs(-10));  // 10
        System.out.println("Integer pow: " + math.pow(4));  // 16

        // Test double operations
        System.out.println("Double add: " + math.add(10.5, 5.5));  // 16.0
        System.out.println("Double sub: " + math.sub(10.5, 5.5));  // 5.0
        System.out.println("Double multiply: " + math.multiply(10.5, 5.5));  // 57.75
        System.out.println("Double div: " + math.div(10.5, 5.5));  // 1.909090909090909
        System.out.println("Double abs: " + math.abs(-10.5));  // 10.5
        System.out.println("Double pow: " + math.pow(4.5));  // 20.25

        // Test division by zero
        System.out.println("Integer div by zero: " + math.div(10, 0));  // Xatolik, NaN qaytaradi
        System.out.println("Double div by zero: " + math.div(10.5, 0));  // Xatolik, NaN qaytaradi
    }
}
