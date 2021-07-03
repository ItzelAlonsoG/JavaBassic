public class CastingExercise {
    public static void main(String[] args) {

        //de chat a int ¿estimación o exactitud?
        char c = 'z';
        int cI = (int) c;
        // es de tipo automático ya que int es mayor que char.
        System.out.println("De char a int:");
        System.out.println(cI);

        //De int a Long y de Long a Short
        int i = 250;
        long iL = i; // es automático ya que long es un tipo de dato mayor que int.
        short iS = (short) iL; //debemos castear a que long es un tipo de dato mayor que short "no cabe" y seria una estimación.
        System.out.println("De int a Long y de Long a Short: " + i + " , " +iL + " y " + iS);


        // ed Double a long.

        double d = 301.067;
        long dL =  (long) d;  //se debe de castear ya que long no acepta decimales y lo estaría afectando .

        System.out.println("De double a Long : " + d + " a " +dL);







    }
}
