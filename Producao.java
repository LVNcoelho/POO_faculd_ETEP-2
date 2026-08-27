public class Producao {

    /* =================================================================
     * CÓDIGO ORIGINAL (ANTES) - COM ERRO DE COMPILAÇÃO
     * =================================================================
     * O código abaixo falha porque tenta acessar variáveis de instância 
     * (não estáticas) dentro de um método estático (main) sem criar um objeto.
     *
     * int previsaoDemanda = 200;
     * int producaoNormal = 250;
     * int estoqueInicial = 50;
     * int estoqueFinal;
     *
     * public static void main(String [] args){
     *     estoqueFinal = (estoqueInicial + producaoNormal) - previsaoDemanda;
     *     System.out.print("O estoque final previsto para o mês é de: " + estoqueFinal + " Unidades");
     * }
     * =================================================================
     */


    // =================================================================
    // CÓDIGO CORRIGIDO (DEPOIS)
    // =================================================================
    // Adicionamos o modificador 'static' aos atributos para que pertençam 
    // à classe e possam ser manipulados diretamente pelo método estático main.

    static int previsaoDemanda = 200;
    static int producaoNormal = 250;
    static int estoqueInicial = 50;
    static int estoqueFinal;

    public static void main(String[] args) {

        estoqueFinal = (estoqueInicial + producaoNormal) - previsaoDemanda;

        System.out.println("O estoque final previsto para o mês é de: " + estoqueFinal + " Unidades");
    }
}

       
