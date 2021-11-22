public class GothamTest {
    public static void main(String[] args) {
        Gotham city = new Gotham();

        for(int i = 0; i < 1000; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    city.bat();
                }
            }).start();
        }

        for (int i = 0; i < 1000; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    city.man();
                }
            }).start();
        }
    }
}
