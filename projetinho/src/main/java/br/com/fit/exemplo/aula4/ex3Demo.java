package br.com.fit.exemplo.aula4;

public class ex3Demo {
    public static void main(String[] args) {
        int num[] = {4,8,16,32,64,128,512,1024};
        int div[] = {2,0,4,4,0,8};

        for(int i=0; i<num.length; i++){
            try{
                System.out.println(num[i] + " / " + div[i] + " is " + num[i] / div[i]);
            } catch(ArithmeticException e){
                System.out.println("Can't divide by zero");
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("No matching element found");
            }
        }
    }
    
}
