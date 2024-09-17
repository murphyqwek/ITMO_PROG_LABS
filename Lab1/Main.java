import java.util.Random;
import java.lang.Math;

public class Main {
    static final int PRECISION = 1_000_000;

    private static float Calculate1(float x){
        float temp = (float) Math.pow(x/2, x);
        temp = (float) Math.pow((Math.exp(x) + 1) / 2, temp);
        temp = (float) Math.exp(temp);

        return temp;
    }

    private static float Calculate2(float x){
        float temp = (float)((Math.sqrt(Math.abs(x)) + 1) / 5);
        temp = (float) Math.pow(temp, 2);
        temp = (float) Math.log(temp);

        return temp;
    }

    private static float Calculate3(float x){
        float temp = (float) ( ((Math.log(Math.abs(x))) - 0.5 ) / Math.cos(x));

        temp = (float) Math.pow(temp, 2);
        temp = (float) Math.pow(temp, 3);

        temp = temp / 4;

        float temp1 = (float) Math.sin(Math.atan(1 / Math.exp(Math.abs(x))));

        temp = (float) Math.pow(temp, temp1);

        return temp;
    }

    private static float[][] GenerateZArray(short[]z, float[] x){
        float[][] z1 = new float[7][18];

        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 18; j++){
                if(z[i] == 16)
                    z1[i][j] = Calculate1(x[j]);
                else if (z[i] == 8 || z[i] == 12 || z[i] == 18)
                    z1[i][j] = Calculate2(x[j]);
                else
                    z1[i][j] = Calculate3(x[j]);
            }
        }

        return z1;
    }

    private static void PrintMatrix(float[][] z1){
        for(float[] row : z1){
            for(float number: row){
                if(!Float.isInfinite(number))
                    System.out.printf("%13.3f ", number);
                else
                    System.out.printf("%13s ", "Inf");
            }
            System.out.println();
        }
    }

    private static float GenerateRandomFloat(){
        Random rnd = new Random();

        return (float)(rnd.nextInt(-8 * PRECISION, 10 * PRECISION + 1)) / PRECISION;
    }

    public static void main(String[] args) {
        short[] z = {18, 16, 14, 12, 10, 8, 6};

        //Generate massive x
        float[] x = new float[18];
        for(int i = 0; i < 18; i++)
            x[i] = GenerateRandomFloat();

        float[][] z1 = GenerateZArray(z, x);

        PrintMatrix(z1);
    }
}
