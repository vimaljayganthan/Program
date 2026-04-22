public class StringException {
    public static void main(String[] args) {
        String name = null;
        try{
            System.out.println(name.charAt(0));
        }
        catch(NullPointerException a){
            System.out.println(a.getMessage());
        }
    }
    
}
