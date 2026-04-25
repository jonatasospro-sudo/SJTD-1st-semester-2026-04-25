/*

// PELOMENOS 3 TESTES PLANEJADOS COM RESULTADOS ESPERADOS PARA TESTAR, ANTES DE FAZER O CÓDIGO (Modelo ensinado na ULIFE):
Entrada (idade) = 5 resposta esperada: "Entrada proibida"
Entrada (idade) = 12 resposta esperada: "Criança - Sala 01"
Entrada (idade) = 17 resposta esperada: "Adolecente Sala 02"
Entrada (idade) = 59 resposta esperada: "Adulto - Sala 03"
Entrada (idade) =  60 resposta esperada: "Idoso-  Sala 04"

*/
// CÓDIGO
import java.util.Scanner;

public class indicarSalaPorIdade {
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        // Modelo ensinado na ULIFE: Descrever oque o programa faz ao execultar
        System.out.println("=====================Programa para identificar a sala por idade iniciado=====================");
        System.out.println("Digite a idade");
        int idade = entrada.nextInt();
        if(idade <= 5){
            System.out.println("Entrada Proibida");
        } else if(idade <=12){
            System.out.println("Criança Sala 01");
        }else if(idade <=17){
            System.out.println("Adolecente Sala 02");
        }else if(idade <=59) {
            System.out.println("Adulto Sala 03");
        }else { 
            System.out.println(" Sala Idoso Sala 04");
        }
          entrada.close();
    }
}
