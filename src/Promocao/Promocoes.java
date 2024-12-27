import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Promocoes {

    public static void main(String[] args) {

        int qtdItens = 5;
        double valorAdicional = 200.0;
        List<Double> precos = Arrays.asList(50.0, 100.0, 150.0, 200.0, 250.0);

        Collections.sort(precos);

        double desconto = 0.0;
        if (qtdItens == 4 && valorAdicional >= 100.0) {
            desconto = precos.get(0) * 0.25;
        } else if (qtdItens == 5 && valorAdicional >= 200.0) {
            desconto = precos.get(0) * 0.50;
        } else if (qtdItens >= 6 && valorAdicional >= 300.0) {
            desconto = precos.get(0);
        }

        double total = 0.0;
        for (double preco : precos) {
            total += preco;
        }
        total -= desconto;

        System.out.println("Desconto aplicado: " + desconto);
        System.out.println("Total atualizado: " + total);
    }
}
