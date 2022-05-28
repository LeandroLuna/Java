package Classes.Aula2.Player.src;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Player play1 = new Player("Juninho");
        Player play2 = new Player();
        play2.setName("Enzo");
        Boolean continuar = true;
        Scanner scan = new Scanner(System.in);
        int option;
        int damage;

        System.out.println("\n\tIniciando novo jogo!!!!");
        while (continuar) {
            System.out.println("\n\nEscolha uma açao a seguir: ");
            System.out.println(
                    "0 - Modificar nome dos jogadores \n1 - Status dos jogadores \n2 - Atacar \n3 - Curar \n4 - Usar items \n5 - Subir de nivel \n6 - Parar jogo");
            System.out.print("Opcao desejada: ");
            option = scan.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.flush();

            switch (option) {
                case 0:
                    System.out.println("Qual o jogador que voce quer alterar o nome?");
                    System.out.println("1 - " + play1.getName());
                    System.out.println("2 - " + play2.getName());
                    System.out.print("Opcao desejada: ");
                    option = scan.nextInt();
                    switch (option) {
                        case 1:
                            System.out.print("Informe o novo nome: ");
                            play1.setName(scan.next());
                            System.out.println("Nome modificado com sucesso!");
                            break;
                        case 2:
                            System.out.print("Informe o novo nome: ");
                            play2.setName(scan.next());
                            System.out.println("Nome modificado com sucesso!");
                            break;
                        default:
                            System.out.println("Opcao invalida! Retornando ao menu principal");
                            break;
                    }
                    break;
                case 1:
                    System.out.printf("[Jogador 1]\nNome: %s | XP: %d | HP: %d | Envenenado: %b\n", play1.getName(),
                            play1.getXp(), play1.getHp(), play1.isPoisoned());
                    System.out.println("----------------------------------------------------------");
                    System.out.printf("[Jogador 2]\nNome: %s | XP: %d | HP: %d | Envenenado: %b\n", play2.getName(),
                            play2.getXp(), play2.getHp(), play2.isPoisoned());
                    break;
                case 2:
                    System.out.println("Qual jogador voce quer atacar?");
                    System.out.println("1 - " + play1.getName());
                    System.out.println("2 - " + play2.getName());
                    System.out.print("Opcao desejada: ");
                    option = scan.nextInt();
                    switch (option) {
                        case 1:
                            damage = (int) (Math.random() * 10 + 1);
                            play1.setDamage(damage);
                            System.out.printf("Voce causou %d de dano ao jogador '%s'!", damage, play1.getName());
                            if (damage % 2 == 0 && !play1.isPoisoned()) {
                                play1.setPoison();
                                System.out.printf("\nQue sorte! Voce tambem envenenou seu adversario!! ");
                            }
                            if (play1.getHp() <= 0) {
                                System.out.printf("\nTEMOS UM VENCEDOR! PARABENS, JOGADOR 2: %s!!!!",
                                        play2.getName().toUpperCase());
                                continuar = false;
                            }
                            break;
                        case 2:
                            damage = (int) (Math.random() * 10 + 1);
                            play2.setDamage(damage);
                            System.out.printf("Voce causou %d de dano ao jogador '%s'!", damage, play2.getName());
                            if (damage % 2 == 0 && !play2.isPoisoned()) {
                                play2.setPoison();
                                System.out.printf("\nQue sorte! Voce tambem envenenou seu adversario!! ");
                            }
                            if (play2.getHp() <= 0) {
                                System.out.printf("\nTEMOS UM VENCEDOR! PARABENS, JOGADOR 1: %s!!!!",
                                        play1.getName().toUpperCase());
                                continuar = false;
                            }
                            break;
                        default:
                            System.out.println("Opcao invalida! Retornando ao menu principal");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Qual jogador voce quer curar?");
                    System.out.println("1 - " + play1.getName());
                    System.out.println("2 - " + play2.getName());
                    System.out.print("Opcao desejada: ");
                    option = scan.nextInt();
                    switch (option) {
                        case 1:
                            play1.setHeal(5);
                            System.out.printf("Voce curou +5pts de HP, totalizando uma nova saude de %dpts.",
                                    play1.getHp());
                            break;
                        case 2:
                            play2.setHeal(5);
                            System.out.printf("Voce curou +5pts de HP, totalizando uma nova saude de %dpts.",
                                    play2.getHp());
                            break;
                        default:
                            System.out.println("Opcao invalida! Retornando ao menu principal.");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Qual jogador voce quer usar o antidoto?");
                    System.out.println("1 - " + play1.getName());
                    System.out.println("2 - " + play2.getName());
                    System.out.print("Opcao desejada: ");
                    option = scan.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println(play1.antidote());
                            break;
                        case 2:
                            System.out.println(play2.antidote());
                            break;
                        default:
                            System.out.println("Opcao invalida! Retornando ao menu principal.");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Aumentar nivel de qual jogador?");
                    System.out.println("1 - " + play1.getName());
                    System.out.println("2 - " + play2.getName());
                    System.out.print("Opcao desejada: ");
                    option = scan.nextInt();
                    switch (option) {
                        case 1:
                            play1.setXp(1);
                            System.out.printf("Jogador '%s' subiu de nivel!! (%d)", play1.getName(),
                                    play1.getXp());
                            break;
                        case 2:
                            play2.setXp(1);
                            System.out.printf("Jogador '%s' subiu de nivel!! (%d)", play2.getName(),
                                    play2.getXp());
                            break;
                        default:
                            System.out.println("Opcao invalida! Retornando ao menu principal.");
                            break;
                    }
                    break;
                case 6:
                    if (play1.getHp() > play2.getHp()) {
                        System.out.println("O jogador vencedor foi o " + play1.getName() + "!!!!!");
                    } else if (play1.getHp() < play2.getHp()) {
                        System.out.println("O jogador vencedor foi o " + play2.getName() + "!!!!!");
                    } else {
                        System.out.println(
                                "Empate!! Ambos os jogadores terminaram com o mesmo HP (" + play1.getHp() + ").");
                    }
                    System.out.println("Obrigado por jogar! Finalizando sessao..");
                    continuar = false;
                    scan.close();
                    break;

                default:
                    System.out.println("Opcao desejada nao disponivel! Digite um valor conforme o menu inicial.");
                    break;
            }
        }
    }
}
