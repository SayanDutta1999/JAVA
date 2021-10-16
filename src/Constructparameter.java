public class Constructparameter {
    int x, Year;
    String Name;
    public Constructparameter (int y, int year, String name){
         this.x = y;
         this.Year = year;
         this.Name = name;
    }
    public static void main(String[] args) {
        Constructparameter myobj = new Constructparameter (5, 1999, "Sayan");
        System.out.println(myobj.x + " " + myobj.Year + " " + myobj.Name);
    }
    
}
