public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "1";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Light mode selected");
                break;

            case "Night":
                System.out.println("Night mode selected");
                break;

            case "Blue dark":
                System.out.println("Blue dark mode selected");
                break;

            case "Dark":
                System.out.println("Dark mode selected");
            break;

            default:
                System.out.println("Select a correct option");
                break;
        }
    }
}
