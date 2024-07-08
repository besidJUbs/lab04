
public class Estation extends Property{

    //Constructor
    public Estation ( String nameProp , int price , int rent,Player owner, int id, String description,CardType type  ) {
        super(nameProp ,  price ,  rent, owner, id,description, type);
       
    }
    //return the rent
    public float CalculateRent(){
        
        return super.GetRent();
    }
    
}