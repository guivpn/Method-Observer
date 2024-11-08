import java.util.ArrayList;
import java.util.List;

public class EstoqueProduto implements Estoque {
    private List<Observer> observadores = new ArrayList<>();
    private boolean emEstoque;

    public void setEmEstoque(boolean emEstoque) {
        this.emEstoque = emEstoque;
        if (emEstoque) {
            notificarObservadores();
        }
    }

    @Override
    public void registrarObservador(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.update("Produto voltou ao estoque!");
        }
    }
}
