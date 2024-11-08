// Principal.java
public class Principal {
    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        // Criando departamentos
        DepartamentoVendas vendas = new DepartamentoVendas();
        DepartamentoMarketing marketing = new DepartamentoMarketing();
        DepartamentoCompras compras = new DepartamentoCompras();

        // Registrando os observadores
        estoqueProduto.registrarObservador(vendas);
        estoqueProduto.registrarObservador(marketing);
        estoqueProduto.registrarObservador(compras);

        // Simulando reabastecimento
        System.out.println("Produto reabastecido no estoque.");
        estoqueProduto.setEmEstoque(true);
    }
}
