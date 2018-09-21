package poupanca;
import java.util.*;
public class SimuladorDePoupanca {
    
    private final double percentualDeRendimento;
    
    public SimuladorDePoupanca(){
        this.percentualDeRendimento = 1.06;
    }    
    
    @SuppressWarnings("empty-statement")
    public int calcularSimulacao(double deposito, double saldoDesejado){
        Scanner sc = new Scanner(System.in);
        
        double deposito1;
        double saldoDesejado1;
        
        System.out.println("Digite o valor do deposito: ");
        do{            
            deposito1 = sc.nextDouble();
            if(deposito1 <= 0 ){
                System.out.println("Digite um valor maior que R$0:");
            }else{
                System.out.println("Sucesso!");
            }
        }while(deposito1 <= 0);        
        deposito = deposito1;
        
        System.out.println("Digite o saldo desejado: ");
        do{            
            saldoDesejado1 = sc.nextDouble();
            if(saldoDesejado1 <= deposito1){
                System.out.println("Digite um valor maior que o deposito de R$ " + deposito + ":");
            }else{
                System.out.println("Sucesso!");
            }
        }while(saldoDesejado1 <= deposito1);
        saldoDesejado = saldoDesejado1;
        
        int i=0;
        while(saldoDesejado > deposito){
            deposito = deposito * this.percentualDeRendimento;
            i = i+1;
        }
        
        return i;
        
    }    
}
