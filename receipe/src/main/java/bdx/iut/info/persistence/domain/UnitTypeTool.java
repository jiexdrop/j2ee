package bdx.iut.info.persistence.domain;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rgiot on 07/02/17.
 *
 * The aime of this class is to provide helpers to fill quantities
 */
public class UnitTypeTool {

    public static List<java.lang.String> getUnitDescription(UnitType type) {
        if( UnitType.volume == type) {
                return Arrays.asList("l", "dl", "cl", "mm", "cuil. soupe", "cuil. café");
        }

        else if( UnitType.weight == type) {
            return Arrays.asList("g", "dg", "cg", "mg", "cuil. soupe", "cuil. café");
        }
        else if( UnitType.number == type) {
            return Arrays.asList("", "feuille" );
        }

        else {
            return Arrays.asList("");
        }
    }
}
