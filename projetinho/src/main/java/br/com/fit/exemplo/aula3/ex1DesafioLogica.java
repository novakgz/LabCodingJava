package br.com.fit.exemplo.aula3;

public class ex1DesafioLogica {
    public static void main(String[] args) {
        int[] nums = {2,11,15,7};
        verificaArray(nums, 9);
    }

    public static void verificaArray(int[] numeros, int tar){        
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros.length; j++){
                if(numeros[i]+numeros[j]==tar&&i!=j){
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
        
    }
}
