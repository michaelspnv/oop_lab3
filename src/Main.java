public class Main
{
    public static void main(String[] args)
    {
        double[] I = {1.5, 2.25, 3.0, 5.5, 17.12};
        double[] U = {0.2, 1.0, 3.0, 4.15, 10.05};

        double R = calcRes(I, U);
        System.out.printf("Приближённое число R = %.3f.", R);
    }

    public static double calcRes(double[] I, double[] U)
    {
        int N = I.length;
        double sumI = 0, sumU = 0, sumIU = 0, sumI2 = 0;

        for (int i = 0; i < N; i++)
        {
            sumI += I[i];
            sumU += U[i];
            sumIU += I[i] * U[i];
            sumI2 += I[i] * I[i];
        }

        double R = (N * sumIU - sumI * sumU) / (N * sumI2 - sumI * sumI);
        return R;
    }
}