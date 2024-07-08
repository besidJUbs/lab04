
public class PublicService extends Property {

    

    public PublicService ( String nameProp , int price , float rent,Player owner, int id, String description,CardType type  ) {
        super(nameProp ,  price ,  rent,owner, id,description, type);
        
    }

    //calculate the new rent by multiplying the value of the past rent by the number that comes out when playing the dice!
    public float CalculateRent(int dices){
        return super.GetRent() * dices;
        
    }
    
}