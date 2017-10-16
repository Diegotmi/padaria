package padaria;

public abstract class GerarRelatorio {
    public void gerarRelatorio(){
        calcular();
        fechar();
        exportar();
    }
 public void calcular(){
     System.out.println("Calculando Vendas");
 }
 
 public void fechar(){
     System.out.println("Relatorio Finalizado");
 }
 
 protected abstract void exportar();
}
    