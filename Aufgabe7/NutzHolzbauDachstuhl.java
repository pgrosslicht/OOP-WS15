/**
 * @author Patrick Grosslicht <e1227085@student.tuwien.ac.at>
 */
public class NutzHolzbauDachstuhl extends Dachstuhl {
    public NutzHolzbauDachstuhl(String name, double length) {
        super(name, length);
    }

    @Override
    protected boolean isValidWood(RundholzGehobelt wood) {
        return wood.getLength() >= this.getLength();
    }

    @Override
    protected boolean isValidWood(RundholzSaegerauh wood) {
        return wood.getLength() >= this.getLength();
    }
}
