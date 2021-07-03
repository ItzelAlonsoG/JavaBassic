public class Arrays {
    public static void main(String[] args) {
        String [] androidVersions = new String [17];
        String days[] = new String [7];

        String [][] cities = new String[4][2]; // 4 * 2 = 8 elementos;

        int [][][] numbers = new int [2][2][2];
        int [][][][] numbers4 = new int [2][2][2][2];

        androidVersions[0] = "Apple pie";
        androidVersions[1] = "Bannana bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

     /*   for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]);
        }
*/
        for (String androidVersion :androidVersions) {
            System.out.println(androidVersion);

        }

        System.out.println();
        System.out.println();

            // fila, columna
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Colombia";
        cities[2][0] = "México";
        cities[2][1] = "CDMX";
        cities[3][0] = "México";
        cities[3][1] = "Guadalajara";

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length ; j++) {
                System.out.println(cities[i][j]);

            }
        }

        System.out.println();
        System.out.println();

        for (String [] pair : cities) {
            for (String name : pair) {
                System.out.println(name);

            }
        }

  /*      System.out.println("País " + cities[0][0] + " ciudad: " + cities[0][1]);
        System.out.println("País " + cities[1][0] + " ciudad: " + cities[1][1]);
        System.out.println("País " + cities[2][0] + " ciudad: " + cities[2][1]);
        System.out.println("País " + cities[3][0] + " ciudad: " + cities[3][1]);
*/
                                  // filas, columnas, elementos,elementos
        String [][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1]  = "monkey";
        System.out.println();
        System.out.println();
        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k <= 0 ; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(animals[i][j][k][l]);

                    }
                }
            }
        }


    }
}
