class TesteIgualdade{
    public static void main(String[] args){
        String frase1;
        String frase2;
        frase1 = new String("Testando igualdade!");
        frase2 = new String("Testando igualdade!");
        System.out.println("Frase 1: " + frase1);
        System.out.println("Frase 2: " + frase2);
        System.out.println("Frase 1 e Frase 2 são iguais? R: " + (frase1==frase2));
    }
}
//As variáveis frase1 e frase2 não são iguais, pois mesmo que possuam o mesmo conteúdo, seus espaços de alocação na memória são diferentes.