
import java.util.EmptyStackException;

public class linkedStack {
    private class node {
        private Object data;
        private node next;

        public node(Object e, node n) {
            this.data = e;
            this.next = n;
        }
    }

    protected node top;
    private int size;

    public linkedStack() {
        this.top = null;
        this.size = 0;
    }
    public int size(){
        return this.size;
    }
    public void push(Object elem) {
        node v = new node(elem, top);
        this.top = v;
        this.size++;

    }//end push

    public Object pop()throws EmptyStackException{
        if(this.size==0)throw new EmptyStackException();
        Object temp = top.data;
        this.top = this.top.next;
        this.size--;
        return temp;
    }
    public Object peek(){
        return this.top.data;
    }


}
