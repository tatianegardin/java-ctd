import com.potatoschool.Aluno;
import com.potatoschool.Professor; // Import da Class Professor
import java.util.ArrayList; // Import's do pacote java.util
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Professor> listaProfessor = new ArrayList<Professor>(); // Criando uma lista de Professores
        Scanner scanner = new Scanner(System.in); // inicializando o Scanner

        boolean inicializador = true; // Criamos esta variavel para que quando for false ele encerre a "tela" dos cadastros

        while(inicializador){ // Criando um loop, para interacao do usuario, aonde caso for true ele continua registrando novos prof/aluno
            System.out.println("Digite a opção que vc deseja: \n1- Cadastrar Professor \n2- Cadastrar Aluno \n3- Sair ");
            int opcao = scanner.nextInt(); // Scanner para selecionar uma das opções de cadastro
            switch (opcao){ // inicializando um switch para os casos possiveis
                case 1: // destinado ao cadastro do professor
                    System.out.println("Cadastro Professor:\nNome: ");
                    String nomeProfessor = scanner.next();
                    System.out.println("Email: ");
                    String emailProfessor = scanner.next();
                    System.out.println("Registro: ");
                    int registroProfessor = scanner.nextInt();
                    listaProfessor.add(new Professor(nomeProfessor, emailProfessor, registroProfessor));
                    break;
                case 2: // destinado ao cadastro do aluno
                    System.out.println("Cadastro Aluno:\nNome: ");
                    String nomeAluno = scanner.next();
                    System.out.println("Email: ");
                    String emailAluno = scanner.next();
                    System.out.println("Registro: ");
                    int registroAluno = scanner.nextInt();
                    System.out.println("Selecione o professor responsavel:");
                    for(int i = 0 ; i < listaProfessor.size() ; i++){ // realizando um for para designar o aluno a um professor
                        System.out.println(i + "- " + listaProfessor.get(i).getNome());
                    }
                    int professorSelecionado = scanner.nextInt(); //111
                    Aluno aluno = new Aluno(nomeAluno, emailAluno, registroAluno); //
                    aluno.cadastrarAluno(listaProfessor.get(professorSelecionado));
                    break;
                case 3 : // destinado a encerrar a "tela" de cadastro
                    inicializador =  false; // valor false para encerrar o switch
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        }

        System.out.println("Lista de professores e seus alunos: \n");
        for (Professor professor:listaProfessor){
            System.out.println("Professor: " + professor.getNome() +" Registro: " + professor.getRegistro());
            for (Aluno aluno : professor.getListaAluno()){
                System.out.println(" Aluno: " + aluno.getNome() + " Registro: " + aluno.getRegistro());
            }
            System.out.println();
        }

    }
}