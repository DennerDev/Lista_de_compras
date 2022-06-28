import java.util.List;
import javax.swing.JOptionPane;

public class Comprar {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Filme filme = new Filme();
        Caneta caneta = new Caneta();
        Caderno caderno = new Caderno();

        JOptionPane.showMessageDialog(null, "Inserir o Livro");
        livro.InserirDados();

        JOptionPane.showMessageDialog(null, "Inserir o Filme");
        filme.InserirDados();

        JOptionPane.showMessageDialog(null, "Inserir o Caneta");
        caneta.InserirDados();

        JOptionPane.showMessageDialog(null, "Inserir o Caderno");
        caderno.InserirDados();

        // livro.InserirDados();
        // filme.InserirDados();
        // caneta.InserirDados();
        // caderno.InserirDados();

        CarinhoDeCompras meuCarrinho = new CarinhoDeCompras();
        meuCarrinho.adicionar(livro);
        meuCarrinho.adicionar(filme);
        meuCarrinho.adicionar(caneta);
        meuCarrinho.adicionar(caderno);

        List<Produto> minhaLista = meuCarrinho.gerarLista();
        // Frete
        double toatalFrete = 0;
        int Km = Integer.parseInt(JOptionPane.showInputDialog("Distancia para entrega"));

        for(Produto produto : minhaLista) {
            toatalFrete = toatalFrete + produto.CalcularFrete(Km);
            System.out.println(produto.toString());
            JOptionPane.showInternalMessageDialog(null, produto.toString());
           
        }
        JOptionPane.showInternalMessageDialog(null, "Total frete é " + toatalFrete);
        // System.out.println("Total do frete é" + toatalFrete);
    }
}
