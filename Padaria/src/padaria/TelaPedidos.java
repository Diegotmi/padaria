package padaria;

public class TelaPedidos implements Observador {
    @Override 
    public void notificar(){
        System.out.println("NOVO PEDIDO");
    }
      
    
}
