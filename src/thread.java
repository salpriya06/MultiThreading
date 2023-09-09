public class thread extends Thread{

    private int start;
    private int stop;
    private int delay;

    public thread(int start, int stop, int delay) {
        this.start = start;
        this.stop = stop;
        this.delay = delay;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 50; i++){
            System.out.println(i);

            try {
                thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
