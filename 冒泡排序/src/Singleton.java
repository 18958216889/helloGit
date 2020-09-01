public class Singleton {
   private static Singleton sinleton=new Singleton();
   private  Singleton(){};
   public static Singleton getsingleton(){
       return sinleton;
   }



}


