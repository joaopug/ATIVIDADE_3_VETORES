public class Atividade_3_Troca_de_Valores_entre_Elementos_do_Vetor {
    public static void main(String[] args) {

        int[] taMuitoFacilAsAtividadesCleiton = new int[2];

        taMuitoFacilAsAtividadesCleiton[0] = 5;
        taMuitoFacilAsAtividadesCleiton[1] = 10;

        System.out.println("Os valores são: \n" + taMuitoFacilAsAtividadesCleiton[0] + " e " + taMuitoFacilAsAtividadesCleiton[1]);

        taMuitoFacilAsAtividadesCleiton[0] = 10;
        taMuitoFacilAsAtividadesCleiton[1] = 5;

        System.out.println("Com a troca feita, os resultados ficam assim: \n" + taMuitoFacilAsAtividadesCleiton[0] + " e " + taMuitoFacilAsAtividadesCleiton[1]);

    }
}
