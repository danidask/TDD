package dask.pruebacalc;

/**
 * Created by dask on 13/04/17.
 */
public class Calculadora {
    private int num1;
    private int num2;
    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int suma() {
        return num1 + num2;
    }

    public int resta() {
        return num1 - num2;
    }

    public int mult() {
        return num1 * num2;
    }

    public int div() {
        return num1 / num2;
    }
}
