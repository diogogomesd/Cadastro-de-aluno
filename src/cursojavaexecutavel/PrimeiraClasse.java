package cursojavaexecutavel;

import cursoClasse.Aluno;
import cursoClasse.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class PrimeiraClasse {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<Aluno>();
        for(int qtd = 1; qtd >= 2; qtd++) {

            Aluno aluno = new Aluno();
            aluno.setNome(JOptionPane.showInputDialog("qual seu nome "+qtd+ "?"));
            /*aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("qual sua idade?")));
            aluno.setNomeMae(JOptionPane.showInputDialog("qual o nome da sua mãe?"));
            aluno.setNomePai(JOptionPane.showInputDialog("qual nome do seu pai?"));
            aluno.setDataNascimento(JOptionPane.showInputDialog("qual sua data de nascimento?"));
            aluno.setRegistroGeral(Integer.parseInt(JOptionPane.showInputDialog("qual o numero do seu RG?")));
            aluno.setNumeroCpf(Integer.parseInt(JOptionPane.showInputDialog("qual o numero do seu CPF?")));
            aluno.setNomeEscola(JOptionPane.showInputDialog("qual o nome da sua escola?"));
            aluno.setDataMatricula(JOptionPane.showInputDialog("qual a data data sua matricula?"));
            aluno.setSerieMatriculado(JOptionPane.showInputDialog("em que séria está matriculado?"));
*/
            //int x = Integer.parseInt(JOptionPane.showInputDialog("quantas matérias vai inserir?"));
            for (int i = 0; i <= 2; i++) {

                String n1 = JOptionPane.showInputDialog("Qual é a matéria " + i + "?");
                int n2 = Integer.parseInt(JOptionPane.showInputDialog("qual é a nota " + i + "?"));
                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplinas(n1);
                disciplina.setNotas(n2);
                aluno.getDisciplinas().add(disciplina);
            }
            int escolha = JOptionPane.showConfirmDialog(null, "Desejaremover alguma disciplina?");
            if (escolha == 0) {
                int continuarRemover = 0;
                int posicao = 1;
                while (continuarRemover == 0) {
                    int disciplinaRemover = Integer.parseInt(JOptionPane.showInputDialog("Qual disciplina deseja remover 1, 2, 3, 4 ?"));
                    aluno.getDisciplinas().remove(disciplinaRemover - posicao);
                    posicao++;
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar Remover");
                }
            }
            alunos.add(aluno);
        }
        /*
        for (Aluno aluno : alunos ) {
            if(aluno.getNome().equalsIgnoreCase("Diogo")) {
                alunos.remove(aluno);
                break;
            }else{
                System.out.println(aluno);
                System.out.println("Média do aluno = " + aluno.getMediaNota());
                System.out.println("Resultado = " + aluno.getAlunoAprovado2());
            }
        }
        for (Aluno aluno : alunos) {
            System.out.println("Alunos que sobraram na lista");
            System.out.println(aluno.getNome());
            System.out.println("Suas matérias são");

            for(Disciplina disciplina : aluno.getDisciplinas()){
                System.out.println(disciplina.getDisciplinas());
            }
        }*/
        for(int pos = 0; pos < alunos.size(); pos ++){
            Aluno aluno = alunos.get(pos);
            System.out.println("Aluno = " +aluno.getNome());
            System.out.println("Média do aluno = "+aluno.getMediaNota());
            System.out.println("Resultado = "+aluno.getAlunoAprovado2());

            for (Disciplina disc :aluno.getDisciplinas()) {
                System.out.println("Matéria = "+disc.getDisciplinas() + "Nota = "+ disc.getNotas());
            }
        }

    }
}
