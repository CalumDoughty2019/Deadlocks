public class Gotham {

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void bat(){
        synchronized (lock1){
            synchronized (lock2){
                System.out.println("Bat");
            }
        }
    }

    public void man(){
        synchronized (lock2){
            synchronized (lock1){
                System.out.println("man");
            }
        }
    }
}
