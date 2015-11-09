package ie.tralee;

public class GuitarSpec extends InstrumentSpec{

  private final int numStrings;

  public GuitarSpec(Builder builder, String model, Type type,
                    int numStrings, Wood backWood, Wood topWood) {
    super(backWood, model, topWood, type, builder);
    this.numStrings = numStrings;
  }

  public int getNumStrings() {
    return numStrings;
  }

  public boolean matches(GuitarSpec otherSpec) {
    if (getBuilder() != otherSpec.getBuilder())
      return false;
    if ((getModel() != null) && (!getModel().equals("")) &&
            (!getModel().toLowerCase().equals(otherSpec.getModel().toLowerCase())))
      return false;
    if (getType() != otherSpec.getType())
      return false;
    return numStrings == otherSpec.numStrings && getBackWood() == otherSpec.getBackWood() && getTopWood() == otherSpec.getTopWood();
  }
}
