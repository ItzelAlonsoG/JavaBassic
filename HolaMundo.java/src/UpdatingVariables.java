public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //bono $200
        salary += 200;
        System.out.println(salary);

        //pensiones: $50 descuento
        salary -= 50;
        System.out.println(salary);

        // 2 horas extra $30 c/u
        //cupon de comida $45

        salary += (30*2);
        salary -=45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Itzel Alonso";
        employeeName += " Alonso";
        System.out.println(employeeName);

        employeeName = "Anahí " +employeeName;
        System.out.println("Tu nombre es: " + employeeName);


    }
}
