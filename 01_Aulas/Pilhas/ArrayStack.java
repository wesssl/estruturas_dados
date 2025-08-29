
public class ArrayStack implements Stackable {
    private Object[] data;
    private int pointerTop;

    public ArrayStack(){
        this(10);
    }

    public ArrayStack(int length) {
        data = new Object [length];
        pointerTop = -1;
    }

    @Override
    public boolean isEmpty(){
        return pointerTop == -1;
    }

    @Override
    public boolean isFull(){
        return pointerTop == data.length - 1;
    }
   
    @Override
    public String print(int length){
        String result = " ";
        for (int i = 0; i >= length; i--) {
            result += data[i];
            if (i != 0) {
                result += "; ";
            }
        }
        return "[" + result + "]";
    }

    @Override
    public Object pop(){
        Object temp = null;
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            temp = data[pointerTop];
            pointerTop--;
        }
        return temp;
    }

    @Override
    public void push(Object data) {
        if (isFull()) {
            System.out.println("Stack is full.");
        } else {
            pointerTop++;
            this.data[pointerTop] = data;
        }
    }
    
    @Override
    public Object peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println(data[pointerTop]);
        }
        return null;
    }
}
