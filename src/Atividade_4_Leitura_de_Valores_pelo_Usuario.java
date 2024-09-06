import java.util.Scanner;

public class Atividade_4_Leitura_de_Valores_pelo_Usuario {
    public static void main(String[] args) {
        int[] fazPeloMenos10AtividadesEUmasDuasMaisDificeisCleiton = new int[3];

        Scanner cheirador = new Scanner(System.in);

        System.out.println("Irei precisar de três números\n" + "Me dê o primeiro número: ");
        fazPeloMenos10AtividadesEUmasDuasMaisDificeisCleiton[0] = cheirador.nextInt();
        System.out.println("Me dê o segundo número: ");
        fazPeloMenos10AtividadesEUmasDuasMaisDificeisCleiton[1] = cheirador.nextInt();
        System.out.println("Me dê o terceiro número: ");
        fazPeloMenos10AtividadesEUmasDuasMaisDificeisCleiton[2] = cheirador.nextInt();

        int seVoceFizerMaisAtividadesCleitonDaPraEstudarMelhor = (fazPeloMenos10AtividadesEUmasDuasMaisDificeisCleiton[0] + fazPeloMenos10AtividadesEUmasDuasMaisDificeisCleiton[1] + fazPeloMenos10AtividadesEUmasDuasMaisDificeisCleiton[2]) / 3;

        System.out.println("O primeiro número que você digitou: " + fazPeloMenos10AtividadesEUmasDuasMaisDificeisCleiton[0] + "\n" + "O segudo número que você digitou: " + fazPeloMenos10AtividadesEUmasDuasMaisDificeisCleiton[1] + "\n" + "O terceiro número que você digitou: " + fazPeloMenos10AtividadesEUmasDuasMaisDificeisCleiton[2] + "\n" + "Se juntarmos e fizermos uma média com eles, este será o resultado: " + seVoceFizerMaisAtividadesCleitonDaPraEstudarMelhor);

    }
}
