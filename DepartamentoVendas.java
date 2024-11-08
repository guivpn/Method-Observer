public class DepartamentoVendas implements Observer {
    @Override
    public void update(String mensagem) {
        System.out.println("Departamento de Vendas: " + mensagem + " Atualizando disponibilidade no site.");
    }
}


public class DepartamentoMarketing implements Observer {
    @Override
    public void update(String mensagem) {
        System.out.println("Departamento de Marketing: " + mensagem + " Preparando campanha nas redes sociais.");
    }
}

public class DepartamentoCompras implements Observer {
    @Override
    public void update(String mensagem) {
        System.out.println("Departamento de Compras: " + mensagem + " Avaliando necessidade de novos pedidos.");
    }
}
