package poupanca;

public class Main {

    public static void main(String[] args) {
        
        SimuladorDePoupanca s = new SimuladorDePoupanca();
        
        System.out.println("Serão necessários " + s.calcularSimulacao(0, 0) + " meses");
        
        
    }
    
}
