
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Board implements Salvavel {

    //array of all players in the game
    ArrayList<Player> players =new ArrayList<Player>();


    public Board (){
   
    }
    


    public ArrayList<Player> GetListPlayer(){
        return players;
    }
   

    //add the id of a player ID a array
    public void addPlayer(Player player) {
        players.add(player);
    }
    
    //remove the player of the array, byt the ID
    public boolean RemovePlayer(Player player){
        for (int i=0; i< players.size();i++){
            if (player.equals(players.get(i))){
                players.remove(i);
                return true;
            }

        }
        return false;
    }
    //print the data of a choosen player whith a certain "Name"
    public void PrintPlayer(String Name){
        for (int i=0; i< players.size();i++){
            if(Name.equals(players.get(i).GetName())){
                System.out.println("Name: " +players.get(i).GetName()+ ", "+ "ID: "+  players.get(i).GetIDplayer()+ ", "+ "Cash: "+ players.get(i).GetCash()+ ", "+ "CPF: "+ players.get(i).GetCPF()+", "+ "Photo: "+ players.get(i).GetPhoto()+ ", "+ "Email: "+players.get(i).GetEmail()+".\n");
                System.out.println("cards: \n");
                players.get(i).PrintCard();
               
            }
        
            


        }

    }

    public void PrintBoardPlayer(){
        for (int i=0; i< players.size();i++){
            
                System.out.println( players.get(i).GetName());

        }

    }
        //array of properties in the games
        ArrayList<Property> properties =new ArrayList<Property>();


        
        
    
    
        public ArrayList<Property> GetListPropieties(){
            return properties;
        }
    
         //add the property of a player ID a array
         public boolean addPropriety(Property property) {
            return properties.add(property);
        }
    
        //remove the property of the array, byt the ID
        public boolean RemovePropriety(Property property){
            for (int i=0; i< properties.size();i++){
                if (property.equals(properties.get(i))){
                    properties.remove(i);
                    return true;
                }
    
            }
            return false;
        }
        //prints info about a choosen property with a "Name"
        public void PrintPropiety(String Name, Ground ground){
            for (int i=0; i< properties.size();i++){
                if(properties.get(i).GetNameprop().equals(Name)){
                    System.out.println( "Name of the Property: "+ properties.get(i).GetNameprop()+ ", "+ "Price of the Property: "+properties.get(i).GetPrice()+ ", "+ "Rent of the Property: "+ properties.get(i).GetRent()+ ", "+"Number of Houses: "+ground.GetNumberHouses()+ ", "+ "House Value: "+ ground.GetHouseValue()+", "+"Hotel Value: "+ ground.GetHotelValue() + ".");
                }
            }
        }
        //print an array with all properties names that are used in the game
        public void PrintBoardProperty(){
            for (int i=0; i< properties.size();i++){
                
                    System.out.println( properties.get(i).GetNameprop());
    
            }
    
        }
        @Override
    public void salvaLog() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("monopoly_log.txt", true))) {
            writer.write(toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     
        
 
    

}