public class InfStatement {
    public static void main(String[] args) {

        boolean isBluetoothEnable = false;
        int fileSended = 3;

        if (isBluetoothEnable){
            //Send file
            fileSended++;
            System.out.println("Archivo enviado");
            int i = 0;
            i++;
        }else{
            fileSended--;
            System.out.println("por favor enciende tu bluetooth, para iniciar la transferencia");
        }

        System.out.println(isBluetoothEnable);
        System.out.println(fileSended);


    }
}
