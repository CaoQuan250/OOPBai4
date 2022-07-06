package OOP.Bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {
    private List<Office> offices;

    public Manager(){
        this.offices = new ArrayList<>();
    }

    public void add(Office office){
        this.offices.add(office);
    }

    public List<Office> search(String name){
        return this.offices.stream().filter(o->o.getName().contains(name)).collect(Collectors.toList());
    }

    public void show(){
        this.offices.forEach(o -> System.out.println(o.toString()));
    }
}
