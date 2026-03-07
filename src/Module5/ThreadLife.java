package Module5;
class ThreadLife extends Thread {
    public void run() {
        System.out.println("Thread running");
    }

    public static void main(String[] args) {
        ThreadLife t = new ThreadLife();

        System.out.println("Thread State: " + t.getState());
        t.start();
        System.out.println("Thread State after start: " + t.getState());
    }
}