package Catalogo;

public class Relogios extends Produto {

    String cor;
    String materialDaPulseira;
    String resistenteAAgua;

    public Relogios(String cor, String materialDaPulseira, String resistenteAAgua, String descricao, String marca,
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

}
