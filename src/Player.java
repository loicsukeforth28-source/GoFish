public class Player {
public int numCards;
public boolean canSee;
public Card [] hand;
    public Player(int pnumCards, boolean pcanSee){
        numCards=pnumCards;
        canSee=pcanSee;
        hand = new Card[51];

    }
    public void printHand(){
       // for(int i=0);
    }
    public void addCard(Card cardAdded){
        hand[numCards]=cardAdded;
        numCards++;

    }
}
