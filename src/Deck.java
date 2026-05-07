public class Deck {
    Card [] cards=new Card[52];
    int count;
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card requestedCard;
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
        for(int i=0;i<7;i++) {
            System.out.println("you have the " + cards[i].value + " of " + cards[i].suit);
            player.addCard(cards[i]);
        }
        for(int i=0;i<7;i++) {
         //   if (requestedCard == player.hand[i]);
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
}

