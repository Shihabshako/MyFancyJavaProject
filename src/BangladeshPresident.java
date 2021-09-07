public class BangladeshPresident {
    public String presidentName;
    public static final BangladeshPresident theBangladeshPresident = new BangladeshPresident();
 
    private BangladeshPresident(){
 
    } 
 
    public static BangladeshPresident getPresident(String presidentName){
        theBangladeshPresident.presidentName = presidentName;
        return theBangladeshPresident;
    }
 
    public String getPresidentName(){
         return presidentName;
    }
 }