import java.util.ArrayList;
import java.util.Random;



public class CardList {
    


    public CardList (){
   
    }

    //selects a random card for a player
    public static Card RandomCard(ArrayList<Card> cardList){
        if ((cardList.size())>0){
            Random random = new Random();  
            Card randomElement = cardList.get(random.nextInt(cardList.size()));

            cardList.remove(random.nextInt(cardList.size()));

            return randomElement;
        }
        else{
            System.out.println("Sorry, there`s no cards left to pick!");
            Card blankCard= new Card(0,"",null);
            return blankCard;
        }
    }
    
    

}
