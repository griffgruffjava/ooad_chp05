package ie.tralee;

/**
 * Created by t00175569 on 09/11/2015.
 */
public class MandolinSpec extends InstrumentSpec {

    private final Style style;

    public MandolinSpec(Wood backWood, String model, Wood topWood, Type type, Builder builder, Style style) {
        super(backWood, model, topWood, type, builder);
        this.style = style;
    }
}
