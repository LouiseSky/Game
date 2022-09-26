public class Messages {
    static void startMessage(){
        System.out.println("Välkommen, ta dig ut ur min labyrint!");
    }
    static void successMessage(){
        System.out.println("Grymt, du gick rätt väg!");
    }
    static void messageFailure(){
        System.out.println("Ajdå, det där gick inte så bra. Du får försöka igen!");
    }
    static void messageAlternatives(){
        System.out.println("Vilken väg vill du gå?");
        System.out.println("1. Rakt fram ");
        System.out.println("2. Höger");
        System.out.println("3. Vänster");
    }

}
