
package thread;

        import java.util.concurrent.atomic.AtomicInteger;

public class Sum {

    private AtomicInteger i = new AtomicInteger();

    public void inc() {
        i.getAndIncrement();
    }

    public int get() {
        return i.get();
    }
}o