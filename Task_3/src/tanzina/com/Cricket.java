package tanzina.com;

public class Cricket extends Sports {
    Players pl;
    String matchType;
    int over;

    public Cricket(Players pl, String matchType, int over) {
        this.pl = pl;
        this.matchType = matchType;
        this.over = over;
    }
    void display(){
        System.out.println(matchType+" "+over+" "+pl.playerName+" "+pl.jerseyNumber);
    }


}
/*Name: Tanzina Akther
  ID: 2012020158
  Section: D
  Email: cse_2012020158@lus.ac.bd
  Date: 12th september 2021
 */
