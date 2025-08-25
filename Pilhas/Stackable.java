public interface Stackable{
    Object pop();
    void push(Object data);
    Object peek();

    boolean isEmpty();
    boolean isFull();
    String print(int length);
}