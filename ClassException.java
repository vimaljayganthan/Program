public class ClassException {
    public static void main(String[] args) {
        try{
            Class.forName("C");
            System.out.println("Class Founded");
        }
        catch(ClassNotFoundException a){
            System.out.println("Class Not Found Error");
        }
    }
    
}
