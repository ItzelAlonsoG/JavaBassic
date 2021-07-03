public class Functions {
    public static void main(String[] args) {
        double y = 3;
        //Área de un círculo
        //pi*2
        circleArea(y);


        //Área de una esfera
        //4*PI*r2
        sphereArea(y);

        //Volumen de una esfera
        //(4/3)*pi*r3
        sphereVolume(y);

        System.out.println("Pesos a dolares: " + converToDollar(1000,"COP"));
    }

    /**
     * Descripción: Función que retorna el área de un círculo.
     * @param r Radio del circulo que debe ser tipo double.
     * @return Regresa el área del círculo calculado.
     **/


    public static double circleArea(double r){
        return  Math.PI * Math.pow(r,2);

    }

    /**
     * Descripción: Función que retorna el área de una esféra.
     * @param r Radio del circulo que debe ser tipo double.
     * @return Regresa el área de una esféra calculado.
     **/

    public static double sphereArea (double r) {
        return 4 * Math.PI * Math.pow(r,2);
    }

    /**
     * Descripción: Función que retorna el volumén de una esféra.
     * @param r Radio del circulo que debe ser tipo double.
     * @return Regresa el volumén de una esféra calculado.
     **/
    public static double sphereVolume (double r) {
        return (4/3) * Math.PI * Math.pow(r,3);

    }



    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP.
     * @return quantity devuelve la cantidad actualizada con Dolares.
     * */

    public static double converToDollar (double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;

            case "COP":
                quantity = quantity * 0.00031;
                break;
        }

        return quantity;
    }
}
