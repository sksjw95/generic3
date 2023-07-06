package generic3;

public class Basket<T extends Plant>{
    private T item;
    public T getItem(){
        return  item;
    }
    public void setItem(T item){
        this.item = item;
    }
}
