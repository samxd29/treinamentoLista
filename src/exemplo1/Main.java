package exemplo1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Maria", 9);
        Aluno aluno2 = new Aluno("Joao", 8);

        List<Aluno> listaAlunos = new ArrayList<>();

        // adicionando elementos na lista
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);

        //removendo um elemento da lista pelo nome do elemento
       // listaAlunos.remove(aluno1);

        boolean achouAluno;
        // pesquisanso um elemento na lista
        achouAluno = listaAlunos.contains(aluno1);

        //System.out.println(achouAluno);

        //System.out.println(listaAlunos);

        //imprimindo todos os elementos da lista
        for(int i = 0; i < listaAlunos.size();i++){
            System.out.println(listaAlunos.get(i));
        }

        //somando as notas dos alunos
        double notas = 0;
        for(int i = 0; i < listaAlunos.size();i++){
            notas = notas + listaAlunos.get(i).getNota();
        }


        System.out.println("=======================");
        //trabalhando com array

        // criando um array com atribuição de valores pelo indice
        int[] numeros = new int[4];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 9;
        numeros[3] = 8;

        //criando um array com atribuição de valores direto na inicialização
        int[] valores = {45, 90, 9, 4};


        int total = 0;
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
            total = total + numeros[i];
        }
        System.out.println(total);









    }
}
