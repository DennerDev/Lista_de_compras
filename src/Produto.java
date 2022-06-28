import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Produto {
    private int codigo;
    private double preco;
    private String descricao;
    private String nome;


    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double CalcularFrete(int Km) {
        double valor = Km * 1.50;
        return valor;
    }



    public void InserirDados() {
        this.codigo =    Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
        this.nome =      JOptionPane.showInputDialog("Nome"); 
        this.descricao = (JOptionPane.showInputDialog("Descrição"));
        this.preco =     Double.parseDouble(JOptionPane.showInputDialog("Preco"));

    }

    @Override
    public String toString() {
        NumberFormat formatar = DecimalFormat.getCurrencyInstance();
        String texto = this.nome +  "Este produto é um " + this.descricao + "Possui o codigo " + this.codigo + "E custa " + formatar.format(this.preco);    
        return super.toString();
    }
   
}
