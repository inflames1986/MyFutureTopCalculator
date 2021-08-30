package com.inflames1986.myfuturetopcalculator.domain;

import com.inflames1986.myfuturetopcalculator.R;

public enum AppTheme {

    FIRST(R.style.MyCalcButtonStyle, "first"),
    SECOND(R.style.MyCalcButtonSecondStyle, "second");

    private final int theme;
    private final String key;

    AppTheme(int value, String key) {
        this.theme = value;
        this.key = key;
    }

    public int getTheme() {
        return theme;
    }

    public String getKey() {
        return key;
    }
}
