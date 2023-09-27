import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dishwasher {
    private int water;
    private List<washable> loadedObjects;

    public void load(washable washable) {
        loadedObjects.add(washable);
    }

    public Set<washable> wash() throws Exception{
        if(water< loadedObjects.size() * 10){
            throw new Exception("not enough water");
        }

        Set<washable> clearObject = new HashSet<>();
        for(washable washable : loadedObjects){
            washable.onWash();
        }

        water -= loadedObjects.size() * 10;

        loadedObjects.clear();

        return clearObject;

    }
}




