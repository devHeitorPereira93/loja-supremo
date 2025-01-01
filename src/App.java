
import Catalogo.Bone;
import Catalogo.Calcas;
import Catalogo.Camiseta;
import Catalogo.Produto;
import Catalogo.Relogio;
import Catalogo.Sapato;
import Ferramentas.Calculadora;

import java.util.ArrayList;

public class App {

  public static void main(String[] args) {

    ArrayList<Produto> carrinho = new ArrayList<>() {
      {
        add(new Calcas("Azul", "Casual Moderno", "Jeans", 46, "Super Skinny", "Tempo hábil ",
            "Calças Super Skinny PremiumII Street", 169.20));

        add(new Bone("Rosa", "Sarja", 'U', "O clássico dad hat é fabricado com a mais alta tecnologia", "New Era",
            "Boné 9TWENTY Branded All Picnic", 309.90));

        add(new Relogio("Azul", "Pulseira de Silicone", "Sim", " Caixa Aço Dourado Quartzo", "Bulova",
            "Relógio Bulova Marine", 4790.00));

        add(new Sapato("Marrom", "Couro", 44, "Social", "Sapato de couro social", "Pegada",
            "Sapato social de couro Pegada", 489.78));

        add(new Camiseta("Branca", "Algodão", 5, "Camisa casual de algodão", "POLLO", "Camiseta Casual POLLO", 189.90));
      }
    };

    Calculadora.calcularPromocao(carrinho);

  }
}
