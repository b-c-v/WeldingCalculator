package weldingCalculator.calculation;

/*21.02.19 add strictfp is a keyword in java used for restricting floating-point calculations and
ensuring same result on every platform while performing operations in the floating-point variable*/

public final strictfp class FlatArea {
    public static double c1_c2_c3_c5_c6_y1(double S, double b, double e, double g) {
        return S * b + 0.75 * e * g;
    }

    public static double c4(double S, double b, double e, double g, double e1, double g1) {
        return S * b + 0.75 * (e * g + e1 * g1);
    }

    public static double c7(double S, double b, double e, double g) {
        return S * b + 1.5 * e * g;
    }

    public static double c8_c10_y6_t6(double S, double b, double e, double g, double c, int alpha) {
        return S * b + 0.5 * Math.pow(S - c, 2) * Math.tan(Math.toRadians(alpha)) + 0.75 * e * g;
    }

    public static double c9_c12(double S, double b, double e, double g, double e1, double g1, double c, int alpha) {
        return S * b + 0.5 * Math.pow(S - c, 2) * Math.tan(Math.toRadians(alpha)) + 0.75 * (e * g + e1 * g1);
    }

    public static double c11(double S, double b, double e, double g, int alpha) {
        return S * b + 0.5 * Math.pow(S, 2) * Math.tan(Math.toRadians(alpha)) + 0.75 * e * g;
    }

    public static double c13(double S, double b, double e, double g, double e1, double g1, double c, double R, int alpha) {
        return S * b + 0.785 * Math.pow(R, 2) + R * (S - c - R) + 0.5 * Math.pow(S - c, 2) * Math.tan(Math.toRadians(alpha)) + 0.75 * (e * g + e1 * g1);
    }

    public static double c14(double S, double b, double e, double g, double g1, double e1, double c, double h, int beta, int alpha) {
        return S * b + 0.5 * (Math.pow(h - c, 2) * Math.tan(Math.toRadians(alpha)) + Math.pow(S - h, 2) * Math.tan(Math.toRadians(beta))) + (S - h) * (h - c) * Math.tan(Math.toRadians(alpha)) + 0.75 * (e * g + e1 * g1);

    }

    public static double c15_t8_t9(double S, double b, double e, double g, double c, int alpha) {
        return S * b + 0.25 * Math.pow(S - c, 2) * Math.tan(Math.toRadians(alpha)) + 1.5 * e * g;
    }

    public static double c16_t5(double S, double b, double e, double g, double c, double R, int alpha) {
        return S * b + 1.57 * Math.pow(R, 2) + R * (S - c - 2 * R) + 0.25 * Math.pow(S - c - 2 * R, 2) * Math.tan(Math.toRadians(alpha)) + 1.5 * e * g;
    }

    public static double c17_c19_y9(double S, double b, double e, double g, double c, int alpha) {
        return S * b + Math.pow(S - c, 2) * Math.tan(Math.toRadians(alpha)) + 0.75 * e * g;
    }

    public static double c18_c21(double S, double b, double e, double g, double e1, double g1, double c, int alpha) {
        return S * b + Math.pow(S - c, 2) * Math.tan(Math.toRadians(alpha)) + 0.75 * (e * g + e1 * g1);
    }

    public static double c20(double S, double b, double e, double g, double e1, double g1, double c, double K, int alpha) {
        return (S + K) * b + Math.pow(S - c, 2) * Math.tan(Math.toRadians(alpha)) + 0.75 * (e * g + e1 * g1);
    }

    public static double c23(double S, double b, double e, double g, double e1, double g1, double c, double R, int alpha) {
        return S * b + 1.57 * Math.pow(R, 2) + 2 * R * (S - c - R) + Math.pow(S - c - R, 2) * Math.tan(Math.toRadians(alpha)) + 0.75 * (e * g + e1 * g1);
    }

    // peresmotret ety formulu
    public static double c24(double S, double b, double e, double g, double g1, double e1, double c, double h, int beta, int alpha) {
        return S * b + Math.pow(S - h, 2) * Math.tan(Math.toRadians(alpha)) + Math.pow(h - c, 2) * Math.tan(Math.toRadians(beta)) + 2 * (h - c) * (S - h) * Math.tan(Math.toRadians(beta)) + 0.75 * (e * g + e1 * g1);
    }

    public static double c25(double S, double b, double e, double g, double e1, double g1, double c, double h, double R, int beta, int alpha) {
        return S * b + 0.5 * Math.pow(S - c, 2) * Math.tan(Math.toRadians(alpha)) + 1.5 * e * g;
    }

    public static double c26(double S, double b, double e, double g, double c, double R, int alpha) {
        return S * b + Math.PI * Math.pow(R, 2) + Math.pow(S - c - 2 * R, 2) * R + 0.5 * Math.pow(S - c - 2 * R, 2) * Math.tan(Math.toRadians(alpha)) + 1.5 * e * g;
    }

    public static double c27(double S, double b, double e, double g, double c, double h, int beta, int alpha) {
        return S * b + 2 * Math.pow(h, 2) * Math.tan(Math.toRadians(alpha)) + 0.5 * Math.pow(S - c - 2 * h, 2) * Math.tan(Math.toRadians(beta)) + 2 * h * (S - c - 2 * h) * Math.tan(Math.toRadians(beta)) + 1.5 * e * g;
    }

    public static double c28(double S, double b, double e, double g, double R) {
        return (S + R) * b + 0.43 * Math.pow(S + R, 2) + 0.75 * e * g;
    }

    public static double c39(double S, double b, double e, double g, double e1, double g1, double c, double h, int beta, int alpha) {
        return S * b + Math.pow(h, 2) * Math.tan(Math.toRadians(alpha)) + Math.pow(S - c - h, 2) * Math.tan(Math.toRadians(beta)) + 0.75 * (e * g + e1 * g1);
    }

    public static double c40(double S, double b, double e, double g, double e1, double g1, double c, double h, double R, int beta, int alpha) {
        return S * b + 1.57 * Math.pow(R, 2) + 2 * R * (h - R) + Math.pow(h - R, 2) * Math.tan(Math.toRadians(alpha)) + Math.pow(S - c - h, 2) * Math.tan(Math.toRadians(beta)) + 0.75 * (e * g + e1 * g1);
    }

    public static double c42(double S, double b, double e, double g, double e1, double g1, double h, double K) {
        return S * b + Math.PI * Math.pow(K, 2) / 8 + K * (h - 0.5 * K) + 0.75 * (e * g + e1 * g1);
    }

    public static double c43(double S, double b, double e, double g, double e1, double g1, double c, double h, int beta, int alpha) {
        return S * b + 0.5 * Math.pow(h, 2) * Math.tan(Math.toRadians(alpha)) + Math.pow(S - c - h, 2) * Math.tan(Math.toRadians(beta)) + 0.75 * (e * g + e1 * g1);
    }

    public static double c45(double S, double b, double e, double g, double e1, double g1, double c, double h, double K, int alpha) {
        return S * b + Math.pow(S - c, 2) * Math.tan(Math.toRadians(alpha)) + 0.5 * K * (2 * h - K) + Math.PI * Math.pow(K, 2) / 8 + 0.75 * (e * g + e1 * g1);
    }

    public static double y2(double S, double b, double e, double g, double R) {
        return (S + R) * b + 0.215 * Math.pow(S + R, 2) + 0.75 * e * g;
    }


    public static double y4(double S, double b, double c, double K) {
        return S * b + 0.5 * Math.pow(c, 2) + 1.05 * K;
    }

    public static double y4(double S, double b, double e, double g, double c) {
        return S * b + 0.5 * Math.pow(c, 2) + c * (S - c) + 0.75 * g * (e - c);
    }

    public static double y5(double S, double b, double c, double K1) {
        return S * b + 0.5 * Math.pow(c, 2) + 1.05 * c + 0.5 * Math.pow(K1, 2) + 1.05 * K1;
    }

    public static double y5(double S, double b, double e, double g, double c, double K) {
        return S * b + 0.5 * Math.pow(c, 2) + c * (S - c) + 0.75 * (e + c) * g + 0.5 * K;
    }

    public static double y7_t7(double S, double b, double e, double g, double K, double c, int alpha) {
        return S * b + 0.5 * Math.pow(S - c, 2) * Math.tan(Math.toRadians(alpha)) + 0.75 * e * g + 0.5 * Math.pow(K, 2) + 1.05 * K;
    }

    public static double y8(double S, double b, double e, double g, double e1, double g1, double c, int alpha) {
        return S * b + 0.25 * Math.pow(S - c, 2) * Math.tan(Math.toRadians(alpha)) + 0.75 * (e * g + e1 * g1);
    }

    public static double y10(double S, double b, double e, double g, double K, double c, int alpha) {
        return S * b + Math.pow(S - c, 2) * Math.tan(Math.toRadians(alpha)) + 0.75 * e * g + 0.5 * Math.pow(K, 2) + 1.05 * K;
    }

    public static double t1_h1(double K) {
        return 0.5 * Math.pow(K, 2) + 1.05 * K;
    }

    public static double t2(double S, double b, double e, double g, double c, double K, double R, int alpha) {
        return S * b + 0.785 * Math.pow(R, 2) + R * (S - c - R) + 0.5 * Math.pow(S - c - R, 2) * Math.tan(Math.toRadians(alpha)) + 0.75 * e * g + 0.5 * Math.pow(K, 2) + 1.05 * K;
    }

    public static double t3_h2(double K) {
        return Math.pow(K, 2) + 2.1 * K;
    }
}
