public class CardRunner {
    public static void main(String args[]){
        // ☕
        TerrapinCard maya = new TerrapinCard(5);
        TerrapinCard cardBilly = new TerrapinCard(20);
        TerrapinCard cardBrian = new TerrapinCard(30);

      cardBilly.payGourmet();
      cardBrian.payEconomical();
      System.out.println("Billy: " + cardBilly);
      System.out.println("Brian: " + cardBrian);
      cardBilly.loadMoney(20);
      cardBrian.payGourmet();
      System.out.println("Billy: " + cardBilly);
      System.out.println("Brian: " + cardBrian);
      cardBilly.payEconomical();
      cardBrian.payEconomical();
      cardBrian.loadMoney(50);
      System.out.println("Billy: " + cardBilly);
      System.out.println("Brian: " + cardBrian);




        System.out.println(maya);
        maya.payEconomical();
        System.out.println(maya);
        maya.payGourmet();
        System.out.println(maya);
        maya.loadMoney(100);
        System.out.println(maya);
        System.out.println(maya.getBalance());
    }
}
