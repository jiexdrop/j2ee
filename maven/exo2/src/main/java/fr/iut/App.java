package fr.iut;

import java.util.Locale;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(StringUtil.prettyCurrencyPrint(22.1, Locale.FRANCE));
        System.out.println(StringUtil.prettyCurrencyPrint(382.98, Locale.US));
    }
}
