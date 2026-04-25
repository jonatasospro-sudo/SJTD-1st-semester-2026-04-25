/* 
// PELOMENOS 3 TESTES PLANEJADOS COM RESULTADOS ESPERADOS PARA TESTAR, ANTES DE FAZER O CÓDIGO:

Teste 1: Entradas de notas: 10, 10 e 10 
Resultados esperados: 
Total de Alunos 3
Media geral 10.0
Alunos aprovados 3
Media aprovados 10.0
Porcentagem de aprovaçao 100%
Alunos reprovados 0
Media dos reprovados 0
Porcentagem de reprovaçao 0%

Teste 2: Entradas de notas: 10, 10, 10 e 5 
Resultados esperados: 
Total de Alunos 4
Media geral 8.75
Alunos aprovados 3
Media aprovados 10.0
Porcentagem de aprovaçao 75%
Alunos reprovados 1
Media dos reprovados 5
Porcentagem de reprovaçao 25%

Teste 3: Entradas de notas: 9, 7, 5 e 5 
Resultados esperados: 
Total de Alunos 4
Media geral 6.5
Alunos aprovados 2
Media aprovados 8.0
Porcentagem de aprovaçao 50%
Alunos reprovados 2
Media dos reprovados 5
Porcentagem de reprovaçao 25%

*/

// CÓDIGO
import java.util.Scanner;

public class calcularNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Modelo ensinado na ULIFE: Descrever oque o programa faz ao execultar
        System.out.println("===============Programa para calcular notas de alunos===============");

        //Modelo ensinado na ULIFE: Variaveis bem descritivas sem muitas abreviações e no modelo CamelCase primeira palavras devem ser em minusculo e as seguintes a primeira letra maiuscula exemplo: variralCerta
        int totalAlunos = 0;
        int totalAlunosAprovados = 0;
        double somaNotas = 0;
        double somaNotasAprovados = 0;
        double somaNotasReprovados = 0;
        //Variavel criada para iniciar o loop while e sair dele
        boolean acabou = false;

        while (!acabou) {
            System.out.println("Digite a nota dos alunos (-1.0 para encerrar) ");
            double nota = entrada.nextDouble();
            if(nota!=-1.0){
                totalAlunos++;
                somaNotas+=nota;
             if (nota >=7.0){
                totalAlunosAprovados++;
                somaNotasAprovados+=nota;              
            }else{
                 somaNotasReprovados+=nota;
            }
            }else {
                acabou = true;
            }
        }
         
        double media = somaNotas / totalAlunos;
        double mediaAprovados = somaNotasAprovados / totalAlunosAprovados;
        double mediaReprovados = somaNotasReprovados / (totalAlunos - totalAlunosAprovados);

       // Modelo ensinado na ULIFE: Processamento para encontrar porcentagem dividida em duas variáveis/etapas razão e conversão daporcentagem
       //razão 
        double razaoAprovados = (double)totalAlunosAprovados / totalAlunos; //Modelo ensinado na ULIFE: Casting (double) utilizado para converter pelomentos uma das variáveis tipo int em double no momento da divisão par evitar truncamento de dados
       //Conversão da porcentagem ( * 100)
        double porcentagemAprovados = razaoAprovados * 100;

       // Modelo ensinado na ULIFE: Processamento para encontrar porcentagem dividida em duas variáveis/etapas razão e conversão daporcentagem
       //razão        
        double razaoReprovados = (double)(totalAlunos-totalAlunosAprovados) / totalAlunos; //Modelo ensinado na ULIFE: Casting (double) utilizado para converter pelomentos uma das variáveis tipo int em double no momento da divisão par evitar truncamento de dados
       //Conversão da porcentagem ( * 100)
        double porcentagemReprovados = razaoReprovados * 100;

        System.out.println("Total de Alunos "+ totalAlunos);
        //Modelo ensinado na ULIFE: Imprimir saídas double com duas casas decimais 
        System.out.println("Media geral "+String.format("%.2f",media));
        System.out.println("Alunos aprovados "+totalAlunosAprovados);
        System.out.println("Media aprovados "+String.format("%.2f",mediaAprovados));
        System.out.println("Porcentagem de aprovaçao "+String.format("%.2f",porcentagemAprovados) +"%");
        System.out.println("Alunos reprovados "+(totalAlunos-totalAlunosAprovados));
        System.out.println("Media dos reprovados "+String.format("%.2f",mediaReprovados));
        System.out.println("Porcentagem de reprovaçao "+String.format("%.2f",porcentagemReprovados)+"%");

        entrada.close();        
            
        }

    }

