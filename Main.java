

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        Scanner scanner =new Scanner(System.in);
        Board board= new Board(  );
        CardList cardList= new CardList();
        

        //data insertion:
        
        System.out.println("Hi! Who are you?");
        System.out.println("Please insert your data!");

            //PLAYER
        System.out.println("PLAYER\n");
        
        //cash
        System.out.println("Cash:");
        int cash = scanner.nextInt();
        
        //name
        System.out.println("Name:");
        scanner.nextLine();
        String namePlayer=scanner.nextLine();
        
        //CPF
        System.out.println("CPF:");
        String CPF=scanner.nextLine();
        
        //photo
        System.out.println("Photo:");
        String photo=scanner.nextLine();
        
        //emails
        System.out.println("Email:");
        String email=scanner.nextLine();

        String[] colorList= {"roxo","amarelo", "verde", "vermelho", "azul"};
        Piece piece= new Piece(RandomColor(colorList), 0, null);
        Player player=new Player(cash, namePlayer ,  CPF , photo ,email,piece);
        board.addPlayer(player);

        Property property= new Property("casa amarela" , 100 , 599, player, 1, "description",null );
        PublicService publicService=new PublicService("property name" ,100 , 10.5f,player, 0, "description",null);
        Ground ground= new Ground("nameProp", 2, 3.14f, 0,player,null, "description", 2, 3, 5, true);
        
        board.addPropriety(property);



        
     
        
        LuckyCard LuckyCard=new LuckyCard( 1, 1, 10.5f, "action",  0, "restrition",0, "description",null);
          
        CardList cardBoard = new CardList();
        Card card1= new Card(100, "lucky day! recieve 100 reais", CardType.SORTE);
        Card card2= new Card(-200, "actions droped, you lost 200 reais!", CardType.REVES);
        Card card3= new Card(0, "you just lost your property!",  CardType.REVES);
        Card card4= new Card(40, "actions rised!", CardType.SORTE);
        Card card5= new Card(-400, "actions droped!",  CardType.REVES);
        Card card6= new Card(80, "actions rised!", CardType.SORTE);
        Card card7= new Card(40, "actions rised!", CardType.SORTE);
        Card card8= new Card(60, "actions rised!", CardType.SORTE);
        Card card9= new Card(-90, "you were robbed!",  CardType.REVES);
        Card card10= new Card(-240, "you lost your wallet",  CardType.REVES);
        Card card11= new Card(-800, "your house burned out, pay the repairment!",  CardType.REVES);


        ArrayList<Card> cardArray = new ArrayList<Card>(11);  
        cardArray.add(card1);cardArray.add(card2);cardArray.add(card3);cardArray.add(card4);cardArray.add(card5);cardArray.add(card6);cardArray.add(card7);cardArray.add(card8);cardArray.add(card9);cardArray.add(card10);cardArray.add(card11);

    
       
        }

    private static String RandomColor(String[] colorList) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'RandomColor'");
    }

   
    }
    