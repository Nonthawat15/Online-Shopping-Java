package shopping.ui;

import java.awt.event.ActionListener;

public class ArrayList implements ListADT {

    private int total;

    private Object cart[];

    int current,size;

    public ArrayList(){
        list();
    }
    public void list() {
        current = -1;
        total = 100;
        size = 0;
        cart = new Object[total];
    }

    @Override
    public void insert(Object e) throws Exception{
        if(full()){
            throw new Exception("Cart is full");
        }else{
            size++;
            if (size==1){
                current++;
                cart[current] = e;
            }else{
                for(int i=size-1; i>current+1; i--){
                    cart[i] = cart[i-1];
                }
                current++;
                cart[current] = e;
            }
        }
    }


    @Override
    public Object retrieve() throws Exception {
        return cart[current];
    }

    @Override
    public void delete() throws Exception {
        if (size == 1){
            current = -1;
        } else if (current == size-1) {
            current = 0;
        }else{
            for(int i=current; i<size-1; i++){
                cart[i] = cart[i-1];
                current = 0;
            }
        }
        size--;
    }

    @Override
    public void update(Object e) throws Exception {
        cart[current] = e;
    }

    @Override
    public boolean findkey(Object tkey) {
        current = 0;
        boolean found = false;
        int i = 0;
        while (!found && i<total){
            if(cart[i] == tkey){
                found = true;
                current = i;
            }else{
                i++;
            }
        }
        if (found){
            current = i;
            return true;
        }else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean full() {
        if (size == total)
            return true;
        else
            return false;
    }
}
