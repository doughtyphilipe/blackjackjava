import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();
        int firstNumber = drawRandomCard();
        int secondNumber = drawRandomCard();
        
        String firstCard = cardString(firstNumber);
        String secondCard = cardString(secondNumber);

        System.out.println("\n You get a \n" + firstCard + "\n and a \n" + secondCard);

        int firstScore = scoreCard(firstNumber);
        int secondScore = scoreCard(secondNumber);
        int total = firstScore + secondScore;

        System.out.println("Your total is : "+ total);

        int firstDealerNumber = drawRandomCard();        
        String firstDealerCard = cardString(firstDealerNumber);
        
        int secondDealerNumber = drawRandomCard();        
        String secondDealerCard = cardString(secondDealerNumber); 



        System.out.println("The dealer shows \n" + firstDealerCard + "\nand has a card facing down \n" + faceDown());

       

        while(true) {
            String answer = hitOrStay();
            if (answer.equals("hit")) {
                System.out.println("\n You get a \n");
                int newNumber = drawRandomCard();
                String newCard = cardString(newNumber);
                System.out.println(newCard);
                total = total + scoreCard(newNumber);

                
                System.out.println("your total is: "+total);
                if (total>21) {
                    System.out.println("Bust! Player loses");
                    System.exit(0);
                }
                
            } else if (answer.equals("stay")) {
                break;
            }

        }

        System.out.println("\n Dealer's turn");
        System.out.println("\n The dealer's cards are \n"+firstDealerCard);            
        System.out.println("\n and a \n"+secondDealerCard);

        int dealerTotal = scoreCard(firstDealerNumber)+scoreCard(secondDealerNumber);

        while(dealerTotal<17){
            int newDealerNumber = drawRandomCard();            
            String newDealerCard = cardString(newDealerNumber);              
            System.out.println("\nDealer gets a \n"+newDealerCard);
            dealerTotal = dealerTotal+ scoreCard(newDealerNumber);

            if (dealerTotal>21){
                System.out.println("Bust! Dealer loses.");
                System.out.println("Dealer's total is : "+ dealerTotal);
                System.exit(0);
                
            }
            System.out.println("Your total is : "+ total);
            System.out.println("Dealer's total is : "+ dealerTotal);

        }


   
        if (dealerTotal > total) {
            System.out.println("Dealer wins!");
        } else if (total > dealerTotal) {
            System.out.println("Player wins!");
        } else if (total == dealerTotal) {
            System.out.println("It's a tie!");
        }

        scan.close();

    }


    public static int drawRandomCard(){
        int randomNumber = (int)(Math.random()*13);
        randomNumber +=1;
        return randomNumber;
    }


    public static String cardString(int cardNumber) {
        switch (cardNumber){
            case 1:
            return  "   _____\n"+
                    "  |A _  |\n"+ 
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n";

            case 2:
            return  "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
            
            case 3:
            return  "   _____\n" +
                    "  |3    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____E|\n";
            case 4:
            return  "   _____\n" +
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n";

            case 5:
            return  "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

            case 6:
            return "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

            case 7:
            return  "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";

            case 8:
            return  "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
        
            case 9:
            return  "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10:
            return  "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
        
            case 11:
            return  "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
        
            case 12:
            return  "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
        
            case 13:
            return  "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
            default:
            return("");

        }



    }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    

    public static String hitOrStay(){
        String input ="";
        while (!input.equals("hit") & !input.equals("stay")){
            System.out.println("Please write 'hit' or 'stay'");
            input = scan.nextLine();            
        } 
        return input;           
        }
    
    public static int scoreCard(int cardNumber){
        int scoreCard = 0;
        if (cardNumber > 10){
            scoreCard = 10;
            return scoreCard;
        } else {
            scoreCard = cardNumber;
            return scoreCard;
        }

    }
        

    }
    

