
package actividad.pkg7;

public class Metodos {
    
        private int n;
        public Metodos(int n) {
        this.n = n;
    }
    
   
    
    //Números primos.
    public int[] calcularNumPrimos(int n) {
        int[] numPrimos = new int[n];
        int cantidad = 0;
        int contador = 1;
        int Divisores = 0; 
        int indice = 0;
        

        while(cantidad < n) {
     
           for(int i=1; i<=contador; i++) {
               if(contador % i == 0) {
                  Divisores++; 
               }
           }
           if(Divisores == 2) {
               numPrimos[indice] = contador; 
               cantidad++;
               indice++;
           }
           
           Divisores = 0;
           
           contador++;
        }
        
        return numPrimos;
    }
    
    //Fibonacci.
    public int[] calcularFibonacci(int n) {
        int[] Fibonacci = new int[n];
        int num1 = 0;
        int num2 = 1;
        int fibonacci;
       
        Fibonacci[0] = num1;
        Fibonacci[1] = num2;
        
       
        for(int i=2; i<n; i++) {
            fibonacci = num1 + num2; 
            Fibonacci[i] = fibonacci; 
            num1 = num2;
            num2 = fibonacci;
        }
        
        return Fibonacci;
    }
    
    //imprimir 
    public void imprimir(int[] imprimir) {
        for(int i=0; i<imprimir.length; i++) {
            System.out.print(imprimir[i] + "  ");
        }
    }
    
}
