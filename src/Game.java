import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Messages.startMessage();

        int choice = 0;
        while (!(choice == 1)){
            Messages.messageAlternatives();
            choice = input.nextInt();

            if (choice == 1){
                Messages.successMessage();
                System.out.println("Fortsätt så!");
            } else if (choice == 2 || choice == 3){
                Messages.messageFailure();
            } else {
                System.out.println("Du måste välja en siffra mellan 1-3");
            }
        }
        while (!(choice == 3)){
            Messages.messageAlternatives();
            choice = input.nextInt();
            if (choice == 3){
                Messages.successMessage();
                System.out.println("Det här går ju hur bra som helst!");
            } else if (choice == 1 || choice == 2){
                Messages.messageFailure();
            } else {
                System.out.println("Du måste välja en siffra mellan 1-3");
            }
        }
        while (!(choice == 2)){
            Messages.messageAlternatives();
            choice = input.nextInt();
            if (choice == 2){
                Messages.successMessage();
            } else if (choice == 1 || choice == 3){
                Messages.messageFailure();
            } else {
                System.out.println("Du måste välja en siffra mellan 1-3");
            }
        }
        while (!(choice == 3)){
            Messages.messageAlternatives();
            choice = input.nextInt();
            if (choice == 3){
                Messages.successMessage();
                System.out.println("Fortsätter du så här så är du nästan framme.");
            } else if (choice == 1 || choice == 2){
                Messages.messageFailure();
            } else {
                System.out.println("Du måste välja en siffra mellan 1-3");
            }
        }
        while (!(choice == 2)){
            Messages.messageAlternatives();
            choice = input.nextInt();
            if (choice == 2){
                Messages.successMessage();
                System.out.println("Wihoo");
            } else if (choice == 1 || choice == 3){
                Messages.messageFailure();
            } else {
                System.out.println("Du måste välja en siffra mellan 1-3");
            }
        }
        while (!(choice == 2)) {
            Messages.messageAlternatives();
            choice = input.nextInt();
            if (choice == 2) {
                Messages.successMessage();
                System.out.println("YES, nu är det inte långt kvar");
            }else if (choice == 1 || choice == 3){
                Messages.messageFailure();
            } else {
                System.out.println("Du måste välja en siffra mellan 1-3");
            }
        }
        while (!(choice == 3)){
            Messages.messageAlternatives();
            choice = input.nextInt();
            if (choice == 3){
                Messages.successMessage();
                System.out.println("Grattis du kom ut ur labyrinten!");
            }else if (choice == 1 || choice == 2){
                Messages.messageFailure();
            } else {
                System.out.println("Du måste välja en siffra mellan 1-3");
            }
        }
    }
}
