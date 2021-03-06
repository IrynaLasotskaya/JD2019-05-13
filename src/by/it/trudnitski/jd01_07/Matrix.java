package by.it.trudnitski.jd01_07;

import java.util.Arrays;

public class Matrix extends Var {
    private double[][] value;

    public Matrix(double[][] value) {
        this.value = value;
    }
    public Matrix(Matrix matrix){
        this.value=matrix.value;
    }
    public Matrix(String strMatrix){
        strMatrix = strMatrix.replaceAll("[^\\d.] ?"," ").trim();
        String[]line = strMatrix.split("[ ]{2,}");
        double[][] mas = new double[line.length][];
        for (int i = 0; i < mas.length; i++) {
            String[] count = line[i].split(" ");
            mas[i] = new double[count.length];
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = Double.parseDouble(count[j]);
            }
        }
        this.value = mas;
    }
    @Override
    public String toString() {
        StringBuilder str=new StringBuilder("{");
        String delimeter="{";
        String delimeter1="";
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j <value[0].length ; j++) {

                str.append(delimeter).append(value[i][j]).append(delimeter1);
                delimeter=", ";
            }
            delimeter="},{";
        }
        str.append("}}");
        Arrays.toString(value);
        return str.toString();
    }
}
