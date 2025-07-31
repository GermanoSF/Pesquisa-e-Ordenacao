import java.util.ArrayList;
import java.util.Random;


/***
 * Classe responsavel pelos metodos de gestao de numeros e palavras
 * @author GermanoSF
 */
public class Util {
    /***
     * metodo estatico que popula numeros inteiros com valores aleatorios
     * @param lista estrutura de armazenamento dos numeros
     * @param quantidade quantidade de numeros a serem gerados
     * @param inicio valor inicilal da extencao do numero gerado
     * @param fim valor final da extensao do numero gerado
     */
    public static void popularAleatorioNumeros(ArrayList<Integer> lista, long quantidade, int inicio, int fim){
        
        Random gerador = new Random();
        
        for (;quantidade>0;quantidade--){
            
            lista.add(gerador.nextInt(inicio,fim));
            
        }
        
    }
    
    public static void exibirListaNumeros(ArrayList<Integer> lista){
        
        for (Integer item : lista){
            
            System.out.println(item);
            
        }
        
    }
    /***
     * metodo estatico que gera palavras aleatorias
     * @param lista armazena as palavras geradas
     * @param quantidade de palavras a serem geradas
     * @param tamanho  das palavras a serem geradas
     */
    public static void popularAleatorioPalavras(ArrayList<String> lista, long quantidade, int tamanho){
        
        String letras = "abcdefghijklmnopqrstuvwxyz";
        
        Random gerador = new Random();
        
        String palavra;
        
        int tamanhoA;
        
        while (quantidade>0){
            
            palavra = "";
            
            tamanhoA = tamanho;
            
            while(tamanhoA>0){
                
                palavra = palavra + letras.charAt(gerador.nextInt(letras.length()));
                
                tamanhoA--;
            }
            
            lista.add(palavra);
            
            quantidade--;
            
        }
        
    }
    
    public static void exibirListaPalavras(ArrayList<String> lista){
        
        for (String item : lista){
            
            System.out.println(item);
            
        }
        
    }
    
}
