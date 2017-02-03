package fr.iut;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

/**
 * Created on 03/02/17.
 */
public class StringUtilTest {
    @Test
    public void prettyCurrencyPrint() throws Exception {
        assertEquals("72,67 €",StringUtil.prettyCurrencyPrint(72.67, Locale.FRANCE));
        assertEquals("$55.23",StringUtil.prettyCurrencyPrint(55.23, Locale.US));
    }

}