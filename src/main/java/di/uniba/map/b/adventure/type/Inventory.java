/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.uniba.map.b.adventure.type;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pierpaolo
 */
public class Inventory {

    private List<PickableObject> list = new ArrayList<>();

    public List<PickableObject> getList() {
        return list;
    }

    public void setList(List<PickableObject> list) {
        this.list = list;
    }

    public void add(PickableObject o) {
        list.add(o);
    }

    public void remove(PickableObject o) {
        list.remove(o);
    }
}
