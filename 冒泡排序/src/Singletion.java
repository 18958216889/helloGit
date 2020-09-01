public class Singletion {
    private static Singletion singletion=null;
    private Singletion(){};
    public static Singletion getsingletion(){
        if(singletion==null){
            singletion=new Singletion();
        }
        return singletion;
    }

}
