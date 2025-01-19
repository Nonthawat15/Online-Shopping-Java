package shopping.ui;

import java.awt.event.ActionListener;

public interface ListADT {

    public void list();

    public void insert(Object e) throws Exception;
    public Object retrieve() throws Exception;

    public void delete() throws Exception;

    public void update(Object e) throws Exception;

    public boolean full();

    public int getSize();

    public boolean findkey(Object tkey);


}
