package ie.tralee;

/**
 * Created by t00175569 on 09/11/2015.
 */
public abstract class  InstrumentSpec {
    protected final Builder builder;
    protected final String model;
    protected final Type type;
    protected final Wood backWood;
    protected final Wood topWood;

    public InstrumentSpec(Wood backWood, String model, Wood topWood, Type type, Builder builder) {
        this.backWood = backWood;
        this.model = model;
        this.topWood = topWood;
        this.type = type;
        this.builder = builder;
    }

    public Builder getBuilder() {
      return builder;
    }

    public String getModel() {
      return model;
    }

    public Type getType() {
      return type;
    }

    public Wood getBackWood() {
      return backWood;
    }

    public Wood getTopWood() {
      return topWood;
    }
}
