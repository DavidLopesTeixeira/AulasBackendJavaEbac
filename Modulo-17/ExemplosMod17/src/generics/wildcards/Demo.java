package generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Fruta> fruta = new ArrayList<>();
        fruta.add(new Banana());
        fruta.add(new Uva());

        imprimeFrutas(fruta);
    }

    // Imprime qualquer tipo que extenda de Fruta
    public static void imprimeFrutas(List<? extends Fruta> lista){
        for (Fruta fruta : lista){
            if(fruta instanceof Banana){
                System.out.println("Banana");
            } else if(fruta instanceof Uva){
                System.out.println("Uva");
            }
        }
    }
}
