import java.util.Scanner;
public class Deck {
    Card [] cards=new Card[52];
    int count;
    int count2;
    public boolean hasCard;
    public boolean replacingCard;
    public boolean oneCard=false;
    public boolean goFish=true;
    public static void main(String[] args) {
        Deck deck = new Deck();
    }
    public Deck(){
            for(int x=1;x<cards.length/13+1;x++){
                for(int y=1;y<cards.length/4+1;y++){
                    cards[count]=new Card (y,count,x);
                    count++;
                }
            }
            Player player = new Player(0,true);
            Player bot = new Player(0,false);
        printDeck();
        System.out.println("shuffling");
            shuffle();
            printDeck();
        for(int i=count2;i<7;i++) {
            System.out.println("you have the " + cards[i].value + " of " + cards[i].suit);
            player.addCard(cards[i]);
            count2++;
        }
        System.out.println("other hand" );
        for(int i=count2;i<14;i++) {
            System.out.println("you have the " + cards[i].value + " of " + cards[i].suit);
            bot.addCard(cards[i]);
            count2++;
        }
        while(player.numCards>0&&bot.numCards>0){
        requestCard(bot,player);
        requestCard(player,bot);
        }
    }
    public void printDeck(){
        for(int i=0;i<cards.length; i++){
            cards[i].printCard();
        }
    }
    public void shuffle(){
        for (int i=0;i<cards.length;i++){
            int num =(int)(Math.random()*52);
            Card cardholder = cards[num];
            cards[num]= cards[i];
            cards[i]=cardholder;

        }
    }
    public void play(){
        for(int i=0;i<7;i++) {
            System.out.println("you have the " + cards[i].value + " of " + cards[i].suit);

        }
    }
    public void requestCard(Player player, Player other){
        Scanner sc=new Scanner(System.in);
        String requestedCard = sc.nextLine();
        for(int i=0;i<player.numCards;i++) {
           // System.out.println(requestedCard.equals(player.hand[i].makeString()));
            if (requestedCard.equals(player.hand[i].makeString())&&!oneCard){
                hasCard=true;
                oneCard=true;
            } else{
                hasCard=false;
                oneCard=false;

            }
            if (hasCard){
                other.printHand();
                System.out.println(other.numCards);
                other.addCard(player.hand[i]);
                other.printHand();
                replacingCard=true;
                hasCard=false;
                goFish=false;
            }
            if (replacingCard) {
                if(i<player.numCards){
                    player.hand[i]=player.hand[i+1];
                }
                if(i==player.numCards){
                    player.hand[i]=null;
                }
            }
        }
        if(goFish){
            System.out.println("Go Fish");
      //      cards[player.numCards+1]=player.hand[player.numCards+1]
        }
        replacingCard=false;
        oneCard=false;
        goFish=true;
    }
}

