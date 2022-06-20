class Lampada{
    public static void main(String[] args){
        // Deve-se representar o tipo, a temperatura de cor, a vida útil, o preço e o estado atual da lâmpada
        String tipo = "LED";
        String tempCor = "5000 K";
        String vidaUtil = "50000 horas";
        float preco = 21.50f;
        mostraDados(tipo,tempCor,vidaUtil,preco);
    }
    public static void mostraDados(String tipo, String tempCor, String vidaUtil, float preco){
            System.out.printf("Tipo de lâmpada: %s\nTemperatura de cor: %s\nVida útil: %s\nPreço: %.2f\n", tipo, tempCor, vidaUtil, preco);
        };
}