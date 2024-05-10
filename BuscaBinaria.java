
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class BuscaBinaria
{
   public static String pesquisaBinaria(int valorChute, int[] lista){
        
        int posicaoMenorArray = 0;
        int posicaoMaiorArray = lista.length - 1;
        int meioArray = posicaoMaiorArray / 2;
        
        System.out.println("Menor: " + posicaoMenorArray);
        System.out.println("Maior: " + posicaoMaiorArray);
        System.out.println("Tamanho inicial array: " + posicaoMaiorArray);
        System.out.println("Meio array = " + "[" + meioArray + "]=" + lista[meioArray]);

        
        
        for(int i = 0; i < lista.length; i++){
             System.out.print("[" + i + "]=" + lista[i] + " ");
        }
        
        while (posicaoMenorArray < meioArray) {

            if(valorChute > lista[meioArray]) {
                posicaoMenorArray = meioArray;
                meioArray = (posicaoMenorArray + posicaoMaiorArray) / 2;
                
                System.out.println("");
                System.out.println("");
                
                System.out.println(valorChute + " > " + lista[meioArray]);
                System.out.println("Menor: " + posicaoMenorArray);
                System.out.println("Maior: " + posicaoMaiorArray);
                System.out.println("Meio array = " + "[" + meioArray + "]=" + lista[meioArray]);
                for(int i = posicaoMenorArray; i < posicaoMaiorArray + 1; i++){
                     System.out.print("[" + i + "]=" + lista[i] + " ");
                }
            }
            
            if(valorChute < lista[meioArray]){
                posicaoMaiorArray = meioArray;
                meioArray = (posicaoMenorArray + posicaoMaiorArray) / 2;
                
                System.out.println("");
                System.out.println("");
                
                System.out.println(valorChute + " < " + lista[meioArray] );
                System.out.println("Menor: " + posicaoMenorArray);
                System.out.println("Maior: " + posicaoMaiorArray);
                System.out.println("Meio array = " + "[" + meioArray + "]=" + lista[meioArray]);
                for(int i = posicaoMenorArray; i < posicaoMaiorArray + 1; i++){
                     System.out.print("[" + i + "]=" + lista[i] + " ");
                }
            }
            
            if(lista[meioArray] == valorChute){
                return "\n \nAchou na posicao: " + meioArray;
            }
        }
        
        return "\n \nValor não encontrado! :(";
    }
    
    
    public static void main(String[] args) {
        
        int[] lista = {5,10,66,88,95,120,133, 257, 268, 289, 300, 304, 305, 340, 350, 378, 874, 980, 981};
        int valorChute = 980;
        
        System.out.println(pesquisaBinaria(valorChute, lista));
    }
}
