public class DecimalToOctal {

    public static int DecimaltoOctal(int Decimal) {
        int i = 0;
        int Octal = 0;
        while (Decimal != 0) {
            int rem = Decimal % 8;
            Octal += rem * Math.pow(10, i);
            i++;
            Decimal /= 8;
        }
        return Octal;
    }

    public static void main(String[] args) {
        int Decimal = 210;
        System.out.println(DecimaltoOctal(Decimal));

    }
}
