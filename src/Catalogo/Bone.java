package Catalogo;

public class Bone extends Produto {

    String cor;
    double tamanho;
    String material;

    public Bone(String cor, String material, double tamanho, String descricao, String marca, String nome, double valor) {
        super(descricao, marca, nome, valor);
        this.cor = cor;
        this.material = material;
        this.tamanho = tamanho;
    }

    
    

    
    

    @Override
    public String toString() {
        return "Bones [nome=" + nome + ", cor=" + cor + ", valor=" + valor + ", tamanho=" + tamanho + ", descricao="
                + descricao + ", material=" + material + ", marca=" + marca + "]";
    }







    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    
    }

   


