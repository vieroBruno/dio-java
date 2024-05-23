package edu.bruno.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.print("Sei lá irmão\n");
        int ano = 2024;
        ano = 2025;
        final String BR = "Brasil";
         
        String meuNome="Gleyson";
        int anoFabricacao=2022;
        boolean verdadeira = true;

        anoFabricacao = 2018;
        String primeiroNome = "Bruno";
        String segundoNome="Gabriel Viero";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);        
    }

    public static String nomeCompleto(String primeiroNome , String segundoNome){

        return "Resultado do método "+ primeiroNome.concat(" ").concat(segundoNome);
    }
}
