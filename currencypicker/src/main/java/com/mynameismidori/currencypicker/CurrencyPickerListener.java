package com.mynameismidori.currencypicker;

/**
 * Created by midorikocak on 30/09/2017.
 */

public interface CurrencyPickerListener {
    void onSelectCurrency(String name, String code, String symbol, int flagDrawableResID);
}
