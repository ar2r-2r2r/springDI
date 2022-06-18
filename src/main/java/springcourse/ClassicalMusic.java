package springcourse;

public class ClassicalMusic implements Music{
    public void myInit(){
        System.out.println("Initialization is correct!");
    }

    public void myDestroy() {
        System.out.println("Destroy is correct!");
    }

    @Override
    public  String getSong(){
        return "Hungarian Rhapsody";
    }
}
