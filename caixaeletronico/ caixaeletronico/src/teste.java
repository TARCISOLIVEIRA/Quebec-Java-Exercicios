public class teste {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 17;
        if(valorSolicitado < saldo){
           saldo = saldo - valorSolicitado;
           System.out.println("Saldo Insuficiente");
        }else
        System.out.println(saldo);
        
    }
    
}
