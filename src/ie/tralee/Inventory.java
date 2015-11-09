package ie.tralee;

import java.util.LinkedList;
import java.util.List;

class Inventory {
  private final List<Guitar> guitars;

  public Inventory() {
    guitars = new LinkedList<>();
  }

  public void addGuitar(String serialNumber, double price,
                        GuitarSpec spec) {
    Guitar guitar = new Guitar(serialNumber, price, spec);
    guitars.add(guitar);
  }

  public Guitar getGuitar(String serialNumber) {
    for (Object guitar1 : guitars) {
      Guitar guitar = (Guitar) guitar1;
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }

  public List search(GuitarSpec searchSpec) {
    List<Guitar> matchingGuitars = new LinkedList<>();
    for (Object guitar1 : guitars) {
      Guitar guitar = (Guitar) guitar1;
      if (guitar.getSpec().matches(searchSpec))
        matchingGuitars.add(guitar);
    }
    return matchingGuitars;
  }
}
