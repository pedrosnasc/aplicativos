import java.io.IOException;
import java.util.Scanner;
import CLASSES.Pessoa;
import CLASSES.Piloto;
import CLASSES.Aeronave;


public class AppPilotos {
    public static void main(String[] args) throws InterruptedException, IOException {
        final int MAX_ELEMENTOS = 10;
        int opcao, qtdCadastrados = 0;
        String cpf;
        Pessoa[] pilotos = new Pessoa[MAX_ELEMENTOS];
        Scanner sc = new Scanner(System.in);
        Pessoa pss = new Pessoa();
        Piloto plt = new Piloto();
        Aeronave arn = new Aeronave();

        /*limpa o terminal 
         System.out.println("\033[H\033[23");
         System.out.flush();
        Limpa o terminal*/ 

        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Cadastrar piloto");
            System.out.println("2 - Listar pilotos cadastrados");
            System.out.println("3 - Localizar piloto pelo CPF");
            System.out.println("4 - Cadastrar aeronave");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // Tira o ENTER que ficou na entrada na instrução anterior

            if (opcao == 1) {
                // Se não tem mais espaço no vetor, saio do cadastro
                if (qtdCadastrados == MAX_ELEMENTOS) {
                    System.out.println("\nNão há espaço para cadastrar novos pilotos.");
                    voltarMenu(sc);
                    continue;
                }

                System.out.println("Digite o Nome do Piloto: ");
                pss.setNome(sc.next());
                System.out.println("Digite o CPF do Piloto");
                pss.setCpf(sc.next());
                System.out.println("Digite o Brevê do Piloto:");
                plt.setBreve(sc.next());
                pilotos [qtdCadastrados] = plt;
                qtdCadastrados++;

                voltarMenu(sc);
                System.out.println("\nPiloto cadastrado com sucesso.");
                
            } else if (opcao == 2) {
                // Se não tem ninguém cadastrado no vetor, caio fora
                if (qtdCadastrados == 0) {
                    System.out.println("\nNão há pilotos cadastrados para exibir.");
                    voltarMenu(sc);
                    continue;
                }
                if(pilotos[0] != null){
                    for (Pessoa pessoa : pilotos) {
                        
                    }{
                        if(plt != null){
                            System.out.println(plt);
                        }
                    }
                }

                voltarMenu(sc);
            } else if (opcao == 3) {
            boolean localizado = false;

            System.out.println("Informe o CPF do Piloto: ");
            cpf = sc.next();
                for(Pessoa pessoa : pilotos) {
                    if(pessoa!= null && cpf .equals(pss.getCpf()));
                    System.out.println("CPF Não Encontrado.");
                }
                sc.next();


            } else if (opcao == 4) {
                 // Se não tem ninguém cadastrado no vetor, caio fora
                 if (qtdCadastrados == 0) {
                    System.out.println("\nSem pilotos, não há como cadastrar uma aeronave");
                    voltarMenu(sc);
                    continue;
                }
                System.out.println("Digite o CPF do Piloto que deseja cadastrar na aeronave: ");
                
                System.out.println("Digite o Modelo a Aeronave: ");
                arn.setModelo(sc.next());
                System.out.println("Digite o Nùmero e Série da Aeronave: ");
                arn.setNumeroSerie(sc.next());


                voltarMenu(sc);

                System.out.println("\nAeronave cadastrada com sucesso.");
                System.out.println("Modelo da Aeronave: "+ arn.getModelo());
                System.out.println("NUmero de Série da Aeronave: " + arn.getNumeroSerie());
            }
            else if (opcao != 0) {
                System.out.println("\nOpção inválida!");

            }
        } while (opcao != 0);

        System.out.println("Fim do programa!");

        sc.close();
    }

    private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        in.nextLine();

        // Limpa toda a tela, deixando novamente apenas o menu
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        
        System.out.flush();
    }
}