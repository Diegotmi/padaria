package padaria;

public class Padaria {

    public static void main(String[] args) {

         System.out.println("--------------------OBSERVER--------------------");
        Pedidos pedido = new Pedidos();
        pedido.addObservador(new TelaPedidos());
        pedido.setcodProduto(204);
        System.out.println("--------------------COMPOSITE--------------------");

        Produto pao = new ProdutoUnitario("PÃO DE QUEIJO", 1d);
        Produto suco = new ProdutoUnitario("SUCO DE MORANGO", 2d);
        Produto misto = new ProdutoUnitario("MISTO QUENTE", 5d);
        Produto kit = new Combo(pao, suco);
        System.out.println(pao.getNome() + " por" + pao.getPreco());
        System.out.println(kit.getNome() + " por " + kit.getPreco());
        Produto varios = new Combo(kit, misto);
        System.out.println(varios.getNome() + " por " + varios.getPreco());

        System.out.println("--------------------STRATEGY--------------------");
        Pagamento pag = new Pagamento();
        pag.setTipoPagamento(new Cartao());
        pag.TipoPagamento();
        pag.setTipoPagamento(new Dinheiro());
        pag.TipoPagamento();

         System.out.println("--------------------TEMPLATE--------------------");
        GerarRelatorio r = new RelatorioPDF();
        r.gerarRelatorio();
    }
}
