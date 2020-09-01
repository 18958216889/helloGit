public class lhan {
    private static lhan a=null;
    private lhan(){};
    public static lhan newa(){
        if(a==null){
            a=new  lhan();
        }
        return a;
    }

}
