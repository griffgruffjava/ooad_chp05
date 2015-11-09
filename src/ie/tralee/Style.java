package ie.tralee;

/**
 * Created by t00175569 on 09/11/2015.
 */
public enum Style {
    A, F;

    public String toString() {
        switch(this) {
            case A: return "A";
            case F: return "F";
            default:       return "unspecified";
        }
    }
}
