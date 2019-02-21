package weldingCalculator.calculation;

//21.02.19 add strictfp
public final strictfp class Mass {

    public static String massCalculate(double F, double y, double l, double kWeldProcedure, double kpol) {

        double W = (F * y * l * kWeldProcedure * kpol) / 1000;
        System.out.println(F);
        return String.format("%.3f", W);

    }
}
