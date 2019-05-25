
public class BatsmanInfo {

private String name;
private int match;
private int runs;
private double strikeRate;
private double average;

  public BatsmanInfo(){
      name = "";
      match=0;
      runs=0;
     strikeRate = 0;
     average = 0;
  }

   public BatsmanInfo(String name,int match,int runs,double sr,double avg) {
   this.name = name;
   this.match = match;
   this.runs = runs;
   strikeRate = sr;
   average = avg;
   }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }



}
