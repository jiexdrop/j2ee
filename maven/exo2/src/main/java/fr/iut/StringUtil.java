package fr.iut;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * This class groups utilities to print good strings
 * Created on 03/02/17.
 */
public class StringUtil {
    /**
     * Bonjour, ceci fait partie de la javaDoc
     * This function is berry usefull because is needed to convert the way currencies are printed miam
     * @param amount the amount of money
     * @param locale the Locale.FRANCE like :) French no good
     * @return converted value
     */
    public static String prettyCurrencyPrint(final double amount, final Locale locale) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(amount);
    }
}
