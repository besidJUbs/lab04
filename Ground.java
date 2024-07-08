
public class Ground extends Property {
    
    private int numberHouses;
    private int numberHotels;
    private int houseValue;
    private int hotelValue;
    private boolean hotel;


    //Constructor
    public Ground (String nameProp , int price , float rent,int id, Player owner, CardType type, String description,int NumberHouses, int HouseValue, int HotelValue, boolean Hotel) {
        super(nameProp ,  price ,  rent, owner, id,description, type);
        this.numberHouses= NumberHouses;
        this.houseValue = HouseValue;
        this.hotelValue = HotelValue;
        this.hotel = Hotel;

    }

    //getters and setters

    //Number of Houses
    public int GetNumberHouses(){
        return numberHouses;

    }

    public void SetNumberHouses(int NewNumberHouses){
        this.numberHouses= NewNumberHouses;

    }

    //Value of a House
    public int GetHouseValue(){
        return houseValue;

    }

    public void SetHouseValue(int NewHouseValue){
        this.houseValue= NewHouseValue;

    }

    //Value of a Hotel
    public int GetHotelValue(){
        return hotelValue;

    }

    public void SetHotelValue(int NewHotelValue){
        this.hotelValue= NewHotelValue;

    }

    //boolen of Hotel 
    public boolean GetHotel(){
        return hotel;

    }

    public void SetHotel(boolean NewHotel){
        this.hotel= NewHotel;

    }
    //this function does this operation:
    //base value of the rent necessary to play+(price of a house)*(number of houses)+(price of a hotel)*(number of hotels)
    public float Calculate_Rent(){
        return (super.GetRent()+ (numberHouses*houseValue)+ (numberHotels*hotelValue));
    
    }
    //buy a house
    public boolean BuyHouse(){
        return true;

    }
    //buy a hotel
    public boolean BuyHotel(){
        //if there`s at least 4 houses, you can trade these 4 for 1 hotel!
        if (numberHouses>=4){
            //uptading number of houses
            SetNumberHouses(numberHouses-4);
            return true;
        }
        return false;
    }
    
}