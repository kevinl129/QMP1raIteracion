import java.util.Optional;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}

class Atuendo{

}

enum Categoria{PARTE_SUPERIOR, CALZADO, PARTE_INFERIOR, ACCESORIOS};
enum Material{ALGODON, POLIESTER};
enum NombreTipoPrenda{ZAPATOS, CAMISA_DE_MANGAS_CORTAS, PANTALON};
class TipoPrenda{
    NombreTipoPrenda nombreTipoPrenda;
    Categoria categoria;
    public TipoPrenda(NombreTipoPrenda nombreTipoPrenda, Categoria categoria){
    if(categoria==null || nombreTipoPrenda==null)
        throw new NullPointerException();
    this.categoria=categoria;
}
}
class Prenda{
    TipoPrenda tipoPrenda;
    Material material;
    Integer color;
    Integer colorSecundario;
    public Prenda(TipoPrenda tipoPrenda, Material material, Integer color) {
        if(tipoPrenda==null || material==null || color==null)
            throw new NullPointerException();
        this.tipoPrenda=tipoPrenda;
        this.material=material;
        this.color=color;
    }

    public Prenda(TipoPrenda tipoPrenda, Material material, Integer color, Integer colorSecundario) {
        this(tipoPrenda, material, color);
        this.colorSecundario=colorSecundario;
    }
}