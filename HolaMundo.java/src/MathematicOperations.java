public class MathematicOperations {
    public static void main(String[] args) {

        double x = 2;
        double y = 3;

        //Devuelve un entero hacia arriba
        System.out.println("Devuelve un entero hacia arriba: " + Math.ceil(x));
        //Devuelve un entero hacia abajo
        System.out.println("Devuelve un entero hacia abajo: " + Math.floor(x));
        //Devuelve un número elevado a otro
        System.out.println( "Devuelve un número elevado a otro: " + Math.pow(x,y));
        //Devuelve el número mayor
        System.out.println( "Devuelve el número mayor: " + Math.max(x,y));
        //Devuelve la raíz cuadrada
        System.out.println( "Devuelve la raíz cuadrada: " + Math.sqrt(y));
        //Área de un círculo
        //pi*2
        System.out.println( "Área de un círculo: " + Math.PI * Math.pow(y,2));

        //Área de una esfera
        //4*PI*r2
        System.out.println("Área de una esfera: " + 4 * Math.PI * Math.pow(y,2));

        //Volumen de una esfera
        //(4/3)*pi*r3
        System.out.println( "Volumen de una esfera: " + (4/3) * Math.PI * Math.pow(y,3));

    }
}
