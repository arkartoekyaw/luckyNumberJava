import java.util.Scanner;
import java.util.Random;

public class luckyNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int userInput;

            while (true) {
                System.out.print("Enter your choice (1 to read rules, 2 to play game): ");
                userInput = scanner.nextInt();
                System.out.println(userInput);

                if (userInput == 1) {
                    System.out.println("Age must be over 18.");
                    System.out.println("Show money must be more than 5000.");
                    System.out.println("You must bet more than or equal to 1000 each time.");

                } else if (userInput == 2) {
                    System.out.print("Enter your name: ");
                    String userName = scanner.next();
                    System.out.print("Enter your age: ");
                    int userAge = scanner.nextInt();

                    if (userName.length() > 2 && userAge >= 18) {
                        System.out.println("You can play the game now!");
                        System.out.println("Your name is " + userName);

                        System.out.print("Enter your show money: ");
                        int showMoney = scanner.nextInt();

                        if (showMoney >= 5000) {
                            while (showMoney >= 1000) {
                                System.out.print("Enter your bet: ");
                                int userBet = scanner.nextInt();

                                if (userBet >= 1000  && userBet <= showMoney) {
                                    System.out.print("Enter your lucky number (1 to 10): ");
                                    int luckyNumber = scanner.nextInt();

                                    Random rand = new Random();
                                    int systemNumber = rand.nextInt(10) + 1;

                                    if (luckyNumber == systemNumber) {
                                        System.out.println("The lucky number is " + systemNumber);
                                        System.out.println("Congratulations, you win!");

                                        showMoney += userBet;
                                        System.out.println("Your show money is " + showMoney);

                                    } else {
                                        System.out.println("The lucky number is " + systemNumber);
                                        System.out.println("Sorry, you lose.");

                                        showMoney -= userBet;
                                        System.out.println("Your show money is " + showMoney);


                                    }

                                } else {
                                    System.out.println("Your bet must be greater than or equal to 1000 and less than or equal to your show money.");
                                }
                            }

                            System.out.println("You don't have enough money to continue. Game over!");
                            break;

                        } else {
                            System.out.println("Your show money must be greater than or equal to 5000.");

                        }

                    } else {
                        System.out.println("Your name length must be over 2 and age must be equal or over 18.");
                    }

                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}