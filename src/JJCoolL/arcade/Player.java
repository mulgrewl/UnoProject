package JJCoolL.arcade;

public class Player {

    private Hand hand;
    private String name;



    public Player(String name) {
      this.name =  name;
       this.hand = new Hand();

    }
    public String getName(){
        return this.name;
    }

    public Hand addHand(){
        return this.hand;

    }
}
  // public static void createPlayer() {




  /* void CatchUno() {
    }

    void CallsUno() {
    }



*/
