public class Card {
   public int value;
    public int order;
    public String suit;
    public Card(int pvalue, int porder,int psuit){
        value=pvalue;
        order=porder;
        if(psuit==1){
            suit = "Spades";
        }
        else if (psuit==2){
            suit = "Clubs";
        }
        else if (psuit==3){
            suit = "Hearts";
        }
        else{
            suit = "Diamonds";
        }
    }
    public void printCard(){
        System.out.println("order = "+order+" & value = "+value+" & is the suit of "+suit);
    }
    public String makeString(){
        String mystring =value+"";
        return mystring;
    }

}
