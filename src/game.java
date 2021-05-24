import java.util.Locale;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = System.getProperty("user.name");
        System.out.println("Bem vindo " + name + "!");
        System.out.println("Escolha seu nome");
        String character = in.nextLine();
        System.out.println("Bem vindo " + character + "!");
        int game = chooseDifficulty();
        int confirma = confirm();
        System.out.println("Ok, vamos começar, " + character + "!");
        int characterLife = 100;
        String lifecharacter = "+".repeat(characterLife);
        System.out.println(character + ", você possui " + characterLife + "de HP.\nHP: " + lifecharacter);
        System.out.println("Um monstro apareceu, ele tem 50 de vida!");
        String monster = "Furry";
        int monsterLife = 50;
        String life = "+".repeat(monsterLife);
        System.out.println(monster + "\nHP: " + monsterLife + " " + life);
        int gamestart = game;

    }

    public static int confirm() {
        Scanner di = new Scanner(System.in);
        String confirm = di.nextLine();
        switch (confirm) {
            case "Sim":
            case "sim":
                break;
            case "nao":
            case "Nao":
            case "Não":
            case "não":
                System.out.println("Ta tchau");
                System.exit(0);
            default:
                System.out.println("Escolhe os bagulho certo");
                System.exit(0);
        }
        return 0;
    }

    public static int chooseDifficulty() {
        System.out.println("Selecione a dificuldade:\nFacil\nMedio\nDificil");
        Scanner di = new Scanner(System.in);
        String Difficulty = di.nextLine();
        switch (Difficulty) {
            case "Facil":
            case "facil":
                System.out.println("Você escolheu a dificuldade " + Difficulty + ", Você tem certeza? (Responda com sim ou nao)");
                confirm();
                easy();
                break;
            case "Medio":
            case "medio":
                System.out.println("Você escolheu a dificuldade " + Difficulty + ", Você tem certeza? (Responda com sim ou nao)");
                confirm();
                medium();
                break;
            case "dificil":
            case "Dificil":
                System.out.println("Você escolheu a dificuldade " + Difficulty + ", Você tem certeza? (Responda com sim ou nao)");
                confirm();
                hard();
                break;
            default:
                System.out.println("Burrao, ja que tu n colocou nenhuma das opcoes, vou botar no very hard, que nem existe");
                veryhard();
        }
        return 0;
    }

    public static int easy() {
        Scanner in = new Scanner(System.in);
        System.out.println("Você deu 10 de dano em Furry, ele tem 40 de vida.\nAgora é a vez dele!");
        System.out.println("Furry te deu 5 de dano!");
        System.out.println("Você deseja atacar ou poupar?");
        String alternative = in.nextLine();
        if (alternative.equals("atacar"))
            System.out.println("Você ataca furry novamente, o tira 10 de vida, porem ele ficou furioso e te matou, GAME OVER!");
        else if (alternative.equals("poupar")) {
            System.out.println("Você poupou furry, ele está feliz por você! Você ganhou 32324xp.");
            System.out.println("Oba! Você upou de nivel! Agora, você esta nivel 493!");
            System.out.println("Porem... como você esta jogando no facil, acaba o jogo aqui :) ");
            System.out.println("GAME OVER");
        }
        System.exit(0);
        return 0;
    }

    public static void medium() {
        int mylife = 100;
        Scanner in = new Scanner(System.in);
        System.out.println("Você deseja ATACAR, ou POUPAR?\n");
        String alternative = in.nextLine();
        if (alternative.equals("atacar")) {
            System.out.println("Você o tirou 20 de vida. Agora, furry tem 30hp");
            System.out.println("Furry o tirou 30 de vida. Agora, você tem" + (mylife - 30) + "hp\nVoce deseja ATACAR ou POUPAR?");
            String alternative2 = in.nextLine();
            switch (alternative2) {
                case "atacar":
                    System.out.println("Você o atacou, tirou 30hp!\nAgora, furry tem 0hp");
                    System.out.println("Parabens, você zerou! Até a proxima!");
                    System.exit(0);
                    break;
                case "poupar":
                    System.out.println("Você o poupou.\nVocê recebeu 40 de xp!\n\nVocê upou de nivel! Agora, você esta nivel 5!\nVocê zerou! Até a proxima.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Burrao, volta pro começo do jogo ai kk");
                    System.exit(0);
            }
        } else if (alternative.equals("poupar")) {
            System.out.println("Você tentou poupar, porem furry nao aceitou.");
            System.out.println("Furry o tirou 30 de vida. Agora, você tem " + (mylife - 30) + "hp");
            System.out.println("O que voce deseja fazer? ATACAR ou POUPAR?");
            poupo();
        }
        System.out.println("O que voce deseja fazer? ATACAR ou POUPAR?");
    }
    public static void hard(){
        System.out.println("Furry te ve e te da um tapa na orelha e foi tao forte que voce morreu.\n\nFIM.");
        System.exit(0);
    }
    public static void veryhard(){
        System.out.println("Furry te ve e te da um tapa na orelha e foi tao forte que voce morreu.\n\nFIM.");
        System.exit(0);
    }
    public static void poupo(){
        Scanner in = new Scanner(System.in);
        String alternative = in.nextLine();
        switch (alternative) {
            case "atacar":
                System.out.println("Você o atacou, tirou 100hp!\nAgora, furry tem 0hp\nVocê zerou! Parabens!");
                System.exit(0);
                break;
            case "poupar":
                System.out.println("Você o poupou.\nVocê recebeu 40 de xp!\n\nVocê upou de nivel! Agora, você esta nivel 5!\nVocê zerou! Até a proxima.");
                System.exit(0);
                break;
            default:
                System.out.println("Burrao, volta pro começo do jogo ai kk");
                System.exit(0);
        }
    }
}