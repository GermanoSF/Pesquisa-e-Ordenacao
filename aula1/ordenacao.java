import classes.Util;
import java.util.ArrayList;


public class GermanoSF_Ordenacao {

    public static void main(String[] args) {
        
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<String> palavras = new ArrayList<>();
        
        Util.popularAleatorioNumeros(listaNumeros,10,100,500);
        Util.exibirListaNumeros(listaNumeros);
        
        Util.popularAleatorioPalavras(palavras,10,7);
        Util.exibirListaPalavras(palavras);
        
    }
    
}
