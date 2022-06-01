/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Student ID:-991659548

*/
package cardtrickice1;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author Isha Devi
 */
import java.util.Scanner;
public class CardTrickICE1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sb = new Scanner(System.in);
        Card[] magicHand = new Card[7]; //Array of object
         Card  luckyCard = new Card();
        luckyCard.setValue(6);
        luckyCard.setSuits("diamonds");
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(Card.RandomValue());
            c1.setSuits(Card.RandomSuit());
            magicHand[i]= c1;
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuits());
            
        }
        
        System.out.println("Enter the card number (1 to 12)");
        int num = sb.nextInt();
        System.out.println("Choose the card suits: ");
        System.out.println("1:heart\n2:diamond\n3:spade\n4:club");
        int suitnum = sb.nextInt();
        String suit;
        suit = CallSuit(suitnum);
        
        boolean match = true ;
        for(int i =0; i < magicHand.length;i++)
        {
            match = true;
            if((magicHand[i].getValue() == num) && (magicHand[i].getSuits().equals(suit)))
            {
                System.out.println("card is found");
                break;
            }

            else
            {
                match = false;
            }
        }
        
        if(match == false)
        {
            System.out.println("Card not found");
        }
    }
    public static String CallSuit(int a)
    {
        String suit= "";
        int b =a;
        switch(b)
        {
            case 1:
            suit= "hearts";
            break;
            
            case 2:
            suit = "diamonds";
            break ;
            
            case 3:
            suit ="spades";
            break;
            
            case 4:
            suit = "clubs";
            break;
        
        }
        return suit;
    
    }
}

