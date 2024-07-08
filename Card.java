

public class Card {


    private int id;
    private String description;
    private CardType type;


    public Card ( int id, String description, CardType type){
        this.id=id;
        this.description=description;
        this.type=type;
      
    }



    //getters and setters


    //ID
    public int Getid(){
        return id;

    }

    public void Setid(int NewID){
        this.id= NewID;

    }
    //description

    public String GetDescription(){
        return description;

    }

    public void SetDescription(String NewDescription){
        this.description= NewDescription;

    }

    //owner

    public CardType GetCardType(){
        return type;

    }

    public void SetPlayer(CardType NewCard){
        this.type= NewCard;

    }


    

}