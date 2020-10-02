public class Calc {
    public double n1;
    public double n2;

    public Calc(double num1, double num2){
        n1 = num1;
        n2 = num2;
    }

    public double Soma(){
        return n1 + n2;
    }

    public double Subtracao(){
        return n1 - n2;
    }

    public double Divisao(){
        return n1 / n2;
    }

    public double Multiplicacao(){
        return n1 * n2;
    }
}
