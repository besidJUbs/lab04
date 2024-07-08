import java.util.ArrayList;
import java.util.Random;

public class Piece  {
    private String color;
    private int position;
    private Player owner;
   
    //Constructor
    public Piece ( String Color , int Position, Player Owner) {

        this.color = Color;
        this.position = Position;
        this.owner=Owner;
   
    }
    //getters and setters:


    public String GetColor(){
        return color;

    }

    public void SetColor(String NewColor){
        this.color= NewColor;

    }
   

    public int GetPosition(){
        return position;
    }

    public void SetPosition(int NewPosition){
        this.position= NewPosition;

    }
    public Player GetOwner(){
        return owner;

    }

    public void SetOwner(Player NewOwner){
        this.owner= NewOwner;

    }

    public String RandomColor(String[] ColorList){
        
        Random random = new Random();  
        String randomElement = ColorList[random.nextInt(ColorList.length)];
        return randomElement;
        
        
    }
    
}