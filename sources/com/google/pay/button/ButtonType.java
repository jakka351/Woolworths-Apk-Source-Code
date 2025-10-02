package com.google.pay.button;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/pay/button/ButtonType;", "", "compose-pay-button_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonType {
    public static final ButtonType e;
    public static final /* synthetic */ ButtonType[] f;
    public static final /* synthetic */ EnumEntries g;
    public final int d;

    static {
        ButtonType buttonType = new ButtonType("Book", 0, 2);
        ButtonType buttonType2 = new ButtonType("Buy", 1, 1);
        ButtonType buttonType3 = new ButtonType("Checkout", 2, 3);
        ButtonType buttonType4 = new ButtonType("Donate", 3, 4);
        ButtonType buttonType5 = new ButtonType("Order", 4, 5);
        ButtonType buttonType6 = new ButtonType("Pay", 5, 6);
        ButtonType buttonType7 = new ButtonType("Plain", 6, 8);
        e = buttonType7;
        ButtonType[] buttonTypeArr = {buttonType, buttonType2, buttonType3, buttonType4, buttonType5, buttonType6, buttonType7, new ButtonType("Subscribe", 7, 7)};
        f = buttonTypeArr;
        g = EnumEntriesKt.a(buttonTypeArr);
    }

    public ButtonType(String str, int i, int i2) {
        this.d = i2;
    }

    public static ButtonType valueOf(String str) {
        return (ButtonType) Enum.valueOf(ButtonType.class, str);
    }

    public static ButtonType[] values() {
        return (ButtonType[]) f.clone();
    }
}
