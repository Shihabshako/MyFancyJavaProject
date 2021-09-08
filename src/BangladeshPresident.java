public class BangladeshPresident {
    public String presidentName;
    public static  BangladeshPresident theBangladeshPresident ;
 
    private BangladeshPresident(){
 
    } 
 
    public static BangladeshPresident getPresident(String presidentName){
        if(theBangladeshPresident == null){
           theBangladeshPresident = new BangladeshPresident();
           theBangladeshPresident.presidentName = presidentName;
        }
        return theBangladeshPresident;
    }
 
    public String getPresidentName(){
         return presidentName;
    }
 }