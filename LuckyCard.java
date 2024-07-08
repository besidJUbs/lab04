

public class LuckyCard extends Card {
    private int moviment;
    private int effect;
    private Float value;
    private String action;
    private int time;
    private String restrition;
    private int luckyCash;

    //Constructor
    public LuckyCard (int Moviment, int Effect, Float Value, String Action, int Time, String Restrition,int id, String description,CardType type) {
        super(id, description,type);
        this.moviment = Moviment;
        this.effect = Effect;
        this.value = Value;
        this.action = Action;
        this.time = Time;
        this.restrition = Restrition;
    }
    //getters and setters:


    public int GetMoviment(){
        return moviment;

    }

    public void SetMoviment(int NewMoviment){
        this.moviment= NewMoviment;

    }

    public int GetEffect(){
        return effect;

    }

    public void SetEffect(int NewEffect){
        this.effect= NewEffect;

    }

    public Float GetValue(){
        return value;

    }

    public void SetValue(Float NewValue){
        this.value= NewValue;

    }

    public String GetAction(){
        return action;
    }

    public void SetAction(String NewAction){
        this.action= NewAction;

    }
    
    public int GetTime(){
        return time;

    }

    public void SetTime(int NewTime){
        this.time= NewTime;

    }
    public String GetRestrition(){
        return restrition;
    }

    public void SetRestrition(String NewRestrition){
        this.restrition= NewRestrition;

    }

    public void executeAction(Player player){
        float playermoney=player.GetCash();
        playermoney= player.GetCash()-GetValue();
        player.SetCash((int)playermoney);
    }

    
    
}