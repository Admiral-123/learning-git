public class add {


    public static int addition(int... a){
        int result=0;
        for(int i=0; i<a.length; i++){
            result=result+a[i];
        }
        return result;
    }
    
}
