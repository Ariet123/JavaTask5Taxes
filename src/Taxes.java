import java.math.BigDecimal;

public class Taxes {
    public static void main(String[] args) {
        System.out.println("Using double:");
        double netCostDouble = 9.99;
        double vatDouble = 0.23;
        double grossValueDouble = (vatDouble + 1) * netCostDouble;
        System.out.println("Gross value (double): " + grossValueDouble);

        double totalGrossDouble = grossValueDouble * 10000;
        System.out.println("Total gross value (double): " + totalGrossDouble);

        double totalNetDouble = totalGrossDouble - (totalGrossDouble * vatDouble);
        System.out.println("Total net value (double): " + totalNetDouble);

        System.out.println("Using BigDecimal:");
        BigDecimal netCostBigDecimal = BigDecimal.valueOf(9.99);
        BigDecimal vatBigDecimal = BigDecimal.valueOf(0.23);
        BigDecimal grossValueBigDecimal = (vatBigDecimal.add(BigDecimal.ONE)).multiply(netCostBigDecimal);
        System.out.println("Gross value (BigDecimal): " + grossValueBigDecimal);

        BigDecimal totalGrossBigDecimal = grossValueBigDecimal.multiply(BigDecimal.valueOf(10000));
        System.out.println("Total gross value (BigDecimal): " + totalGrossBigDecimal);

        BigDecimal totalNetBigDecimal = totalGrossBigDecimal.subtract(totalGrossBigDecimal.multiply(vatBigDecimal));
        System.out.println("Total net value (BigDecimal): " + totalNetBigDecimal);

        // For such smaller values, there may be a small difference in the result due to rounding.
    }
}
