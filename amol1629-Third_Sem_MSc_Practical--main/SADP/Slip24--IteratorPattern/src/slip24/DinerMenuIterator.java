package slip24;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem>{
    MenuItem[] items;
    int position=0;
    public DinerMenuIterator(MenuItem[] items)
    {
        this.items=items;
    }
    public MenuItem next()
    {
        return items[position++];
    }
    public boolean hasNext()
    {
        if(position>=items.length || items[position]==null)
        return false;
        return true;
    }
    public void remove()
    {
        if(position<=0)
        throw new IllegalStateException("Illegal remove atleast 1 next() necessary");
        for(int i=position-1;i<items.length-1 && items[i]!=null;++i)
            items[i]=items[i+1];
        items[items.length-1]=null;
    }
}
