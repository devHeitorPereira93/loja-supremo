package Catalogo;

public class Relogio extends Produto {

    String cor;
    String materialDaPulseira;
    String resistenteAAgua;

    public Relogio(String cor, String materialDaPulseira, String resistenteAAgua, String descricao, String marca,
            String nome, double valor) {
        super(descricao, marca, nome, valor);
        this.cor = cor;
        this.materialDaPulseira = materialDaPulseira;
        this.resistenteAAgua = resistenteAAgua;
    }

    public String getCor() {
        return cor;
    }

    

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterialDaPulseira() {
        return materialDaPulseira;
    }

    public void setMaterialDaPulseira(String materialDaPulseira) {
        this.materialDaPulseira = materialDaPulseira;
    }

    public String getResistenteAAgua() {
        return resistenteAAgua;
    }

    public void setResistenteAAgua(String resistenteAAgua) {
        this.resistenteAAgua = resistenteAAgua;
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
        sb.append("Relogios{");
        sb.append("cor=").append(cor);
        sb.append(", materialDaPulseira=").append(materialDaPulseira);
        sb.append(", resistenteAAgua=").append(resistenteAAgua);
        sb.append('}');
        return sb.toString();
    }

}
