package Catalogo;

public class Camiseta extends Produto {

    double tamanho;
    String cor;
    String material;

    public Camiseta(String cor, String material, double tamanho, String descricao, String marca, String nome,
            double valor) {
        super(descricao, marca, nome, valor);
        this.cor = cor;
        this.material = material;
        this.tamanho = tamanho;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Camisetas{");
        sb.append("tamanho=").append(tamanho);
        sb.append(", cor=").append(cor);
        sb.append(", material=").append(material);
        sb.append('}');
        return sb.toString();
    }

}
