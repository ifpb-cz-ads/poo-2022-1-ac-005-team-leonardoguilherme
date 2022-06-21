package Oito;

public class Teste2 {
    int num1,num2;
    int maior() // no lugar de int é boolean, pelo fato do método retornar valores boolean.
    {
        if(num1 > num2)
            return true;
        else return false;
    }
    void menor() // no lugar de void é o valor que está sendo retornado, no caso int.
    {
        if(num1 > num2)
            return num1;
        else return num2; 
    }
}
