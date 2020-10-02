import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class testecalculadora {

    //Criação de variáveis locais com seus tipos específicos
    private Calc calculadora;
    private double firstNumber;
    private double secondNumber;
    private double result;

    //Método que será executado antes dos testes
    @Before
    public void initTest() {


        //Valor 1 Mockado
        firstNumber = 10;
        //Valor 2 Mockado
        secondNumber = 2;
        //Instância de Objeto
        calculadora = new Calc(firstNumber, secondNumber);
    }


    //Método de soma testado de forma unitária
    @Test
    public void testAddittion() {
        // chamada do método de adição do objeto calculadora, com valores mockados sendo passados como parâmetro
        result = calculadora.Soma();
        //verificação do valor esperado com o valor retornado arredondado
        assertEquals(12, result, 0.0001);
    }

    @Test
    public void testSubtraction() {
        // chamada do método de subtração do objeto calculadora, com valores mockados sendo passados como parâmetro
        result = calculadora.Subtracao();
        //verificação do valor esperado com o valor retornado arredondado
        assertEquals(8, result, 0.0001);
    }

    @Test
    public void testMultiplication() {
        // chamada do método de multiplicação do objeto calculadora, com valores mockados sendo passados como parâmetro
        result = calculadora.Multiplicacao();
        //verificação do valor esperado com o valor retornado arredondado
        assertEquals(20, result, 0.0001);
    }

    @Test
    public void testDivition() {
        // chamada do método de divisão do objeto calculadora, com valores mockados sendo passados como parâmetro
        result = calculadora.Divisao();
        //verificação do valor esperado com o valor retornado arredondado
        assertEquals(5, result, 0.0001);
    }

    //Método que será executado após os testes unitários
    @After
    public void afterTest(){
        // Deixar o objeto vazio
        calculadora = null;
    }

}