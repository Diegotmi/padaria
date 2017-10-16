
package padaria;
import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    private float codProduto;
    private List<Observador> observadores = new ArrayList<>();
        
        public void setcodProduto(float codProduto){
            this.codProduto= codProduto;
            for(Observador observador: observadores){
            observador.notificar();
            }
           }
        
        public void addObservador (Observador observador){
        this.observadores.add(observador);
        }
        
     
}