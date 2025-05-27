
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * 
 * @modifier KomalpreetKaur
 * @studentNumber 991797098
 * @dateModified May 26, 2025
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
            c.setValue(rand.nextInt(13) + 1); // value between 1 and 13
            c.setSuit(Card.SUITS[rand.nextInt(4)]); // random suit from 0 to 3
            magicHand[i] = c;
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
        Scanner input = new Scanner(System.in);

// Ask user for card value
        System.out.print("Enter card value (1-13): ");
        int userValue = input.nextInt();
        input.nextLine();  // consume leftover newline

// Ask user for card suit
        System.out.print("Enter card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = input.nextLine();

// Create user card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

// Search magicHand for user's card
        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == userCard.getValue() && c.getSuit().equalsIgnoreCase(userCard.getSuit())) {
            found = true;
            break;
    }
}

// Print result
        if (found) {
        System.out.println("Your card is in the magic hand!");
        } else {
        System.out.println("Your card is NOT in the magic hand.");
}

    }
    
}

