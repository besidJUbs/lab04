

public class Property extends Card {

    private String nameProp;
    private int price;
    private float rent;
    private Player owner;

    //Constructor
    public Property ( String nameProp , int price , float rent, Player owner ,int id, String description, CardType type ) {
        super(id, description, type);
        this.nameProp=nameProp;
        this.price = price;
        this.rent= rent;
        this.owner=owner;
    }

    //getters and setters

    //Name of the property
    public String GetNameprop(){
        return nameProp;

    }

    public void SetNameprop(String NewName){
        this.nameProp= NewName;

    }



    //Price
    public int GetPrice(){
        return price;

    }

    public void SetPrice(int NewPrice){
        this.price= NewPrice;

    }

    //Rent
    public float GetRent(){
        return rent;

    }

    public void SetRent(float NewRent){
        this.rent= NewRent;
    }

    public Player GetOwner(){
        return owner;

    }

    public void SetOwner(Player NewOwner){
        this.owner= NewOwner;

    }
   

}