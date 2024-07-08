

import java.util.ArrayList;


public class Player  {

    private static int id=0;
    private int cash;
    private String name;
    private String cpf;
    private String photo;
    private String email;
    private Piece piece;
    ArrayList<Card> cardList =new ArrayList<Card>();

  
  

   

    public int GetIDplayer(){
        return id;
    }
    
    //calculating the ID of the player
    public void setIDplayer(){
        id=id++;
       
    }

    //Constructor
    public Player (int Cash, String Name , String CPF , String Email , String Photo,Piece piece) {
     
        this.cash= Cash;
        this.name = Name;
        this.cpf = CPF;
        this.email = Email;
        this.photo = Photo;
        
        setIDplayer();
    }


    //getters and setters:


    //Cash
    public int GetCash(){
        return cash;

    }

    public void SetCash(int NewCash){
        this.cash= NewCash;

    }

    //Piece
    public Piece GetPiece(){
        return piece;

    }

    public void SetPiece(Piece NewPiece){
        this.piece= NewPiece;

    }

    //Name
    public String GetName(){
        return name;

    }

    public void SetName(String NewName){
        this.name= NewName;

    }
   
    //CPF
    public String GetCPF(){

        boolean valid = ValidateCPF.ValidatingCPF(cpf);
        if (valid==true){
        return cpf;
        }
        else{
            return "Invalid CPF!";
        }
    }

    public void SetCPF(String NewCPF){
       
        this.cpf= NewCPF;
    
    }

    //Photo
    public String GetPhoto(){
        return photo;
    }
    public void SetPhoto(String NewPhoto){
        this.photo= NewPhoto;

    }
    //Email
    public String GetEmail(){
       
        boolean valid =ValidateEmail.ValidatingEmail(email);
        if (valid==true){
        return email;
        }
        else{
            return "Invalid Email!";
        }
    }

    

    public void SetEmail(String NewEmail){
       
        this.email= NewEmail;
        
    }


    public ArrayList<Card> GetCardsArray(){
        return cardList;
    }
    public void SetCardsArray(ArrayList<Card> NewCardList){
        this.cardList=NewCardList;
    }

    //this player has a card?

    public void AddCardstoList (Card card){
        
        cardList.add(card);
    }

    public void RemoveCard(Card card){
        for (int i=0; i< cardList.size();i++){
            if (cardList.get(i)==card){
                cardList.remove(i);
                
            }

        }
        
    }
    public void PrintCard(){
        for (int i=0; i< cardList.size();i++){
            Card cardPrint= cardList.get(i);
            System.out.println("Card "+cardPrint.Getid()+ ". "+ "Card Description: "+ cardPrint.GetDescription()+ "." );    
            }

        }
        
    }
    
    

    

    