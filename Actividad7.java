
package actividad.pkg7;

public class Actividad7 {

    public static void main(String[] args) {
        // TODO code application logic here
        
       
        int n = 100;
        int[] Primos;
        int[] Fibonacci;
        Metodos obj1 = new Metodos(n);
        Metodos obj2 = new Metodos(n);
        
        Primos = obj1.calcularNumPrimos(n);
        Fibonacci = obj2.calcularFibonacci(n);
        
        System.out.println("los primeros "+n+" Números primos son:");
        obj1.imprimir(Primos);
        
         System.out.println("\n");
         
        System.out.println("Sucesión de Fibonacci de los primeros "+n+" terminos es: " );
        obj2.imprimir(Fibonacci);
    }
    
    
}


    