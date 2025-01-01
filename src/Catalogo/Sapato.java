
package Catalogo;

public class Sapato extends Produto {

    double tamanho;
    String cor;
    String material;
    String tipo;

    public Sapato(String cor, String material, double tamanho, String tipo, String descricao, String marca,
            String nome, double valor) {
        super(descricao, marca, nome, valor);
        this.cor = cor;
        this.material = material;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Sapatos [nome=" + nome + ", tamanho=" + tamanho + ", valor=" + valor + ", descricao=" + descricao
                + ", cor=" + cor + ", material=" + material + ", marca=" + marca + ", tipo=" + tipo + "]";
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;

    }
}
