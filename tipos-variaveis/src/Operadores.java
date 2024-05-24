public class Operadores {
   public static void main(String[] args) {
    int numero = 5;
    numero = - numero;
    System.out.println(numero);
    numero =  numero * -1;
    System.out.println(numero);

    numero++;
    System.out.println(numero);

    boolean variavel = true;
    System.out.println(!variavel);
    int a = 5, b=6;
    String resultadp = a==b ?"verdadeiro":"falso";
    System.out.println(resultadp);
    
    if (a==b)
        resultadp="vdd";
    else
        resultadp = "false";
        
        System.out.println(resultadp);
        


   boolean condicao1 = true;
   boolean condicao2 = true;

   if(condicao1 && (7>4)){
    System.out.println("As duas são verdadeiras");
   }
   if (condicao1 || condicao2) {
        System.out.println("Uma das é vdd");
   }

   System.out.println("fim");



   } 

   
}
