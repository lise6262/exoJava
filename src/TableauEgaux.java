public class TableauEgaux {
    public static void main(String[] args) {
        int[] tableauUn = new int[]{5, 23, 4, 7};
        int[] tableauDeux = new int[]{1, 2, 35, 4};

        for (int i = 0; i < tableauUn.length; i++) {
            boolean present = false;
            for (int j = 0; j < tableauDeux.length; j++) {
                if (tableauUn[i] == (tableauDeux[j])) {
                    present = true;
                    break;
                }
            }
            if (present) {
                System.out.println("egal");
            } else {
                System.out.println("non egal");
            }
        }
    }
}
