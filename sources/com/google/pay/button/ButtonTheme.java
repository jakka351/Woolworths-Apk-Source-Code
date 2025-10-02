package com.google.pay.button;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/pay/button/ButtonTheme;", "", "compose-pay-button_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonTheme {
    public static final ButtonTheme d;
    public static final /* synthetic */ ButtonTheme[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        ButtonTheme buttonTheme = new ButtonTheme("Dark", 0, 1);
        d = buttonTheme;
        ButtonTheme[] buttonThemeArr = {buttonTheme, new ButtonTheme("Light", 1, 2)};
        e = buttonThemeArr;
        f = EnumEntriesKt.a(buttonThemeArr);
    }

    public ButtonTheme(String str, int i, int i2) {
    }

    public static ButtonTheme valueOf(String str) {
        return (ButtonTheme) Enum.valueOf(ButtonTheme.class, str);
    }

    public static ButtonTheme[] values() {
        return (ButtonTheme[]) e.clone();
    }
}
