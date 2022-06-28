import java.util.ArrayList;
import java.util.List;

public class CarinhoDeCompras {
    private List<Produto> listadeProdutos = new ArrayList<Produto>();

    public void adicionar(Produto produto) {
        this.listadeProdutos.add(produto);
    }

    public List<Produto> gerarLista() {
        return this.listadeProdutos;
    }
}
