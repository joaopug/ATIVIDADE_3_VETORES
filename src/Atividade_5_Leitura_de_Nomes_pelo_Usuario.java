import java.util.Scanner;

public class Atividade_5_Leitura_de_Nomes_pelo_Usuario {
    public static void main(String[] args) {
        String [] aAtividade4SoQueComString = new String [3];

        Scanner cheirador2 = new Scanner(System.in);

        System.out.println("Ei, você! Você mesmo! Preciso de três nomes!\n" + "Me diga o primeiro: ");
        aAtividade4SoQueComString [0] = cheirador2.next();
        System.out.println("Agora o segundo:");
        aAtividade4SoQueComString [1] = cheirador2.next();
        System.out.println("O terceiro:");
        aAtividade4SoQueComString [2] = cheirador2.next();

        System.out.println("Perfeito. Os nomes que você me disse são estes:\n" + aAtividade4SoQueComString[0] + "\n" + aAtividade4SoQueComString[1] + "\n" + aAtividade4SoQueComString[2] + "\n" + "Os nomes estão certos? 1 - Sim || 2 - Não");
        char brincadeira = cheirador2.next().charAt(0);

        if (brincadeira == '1') {
            System.out.println("Épico");
        } else {
            System.out.println("Bah, daí ferrou.");
        }
    }
}
