package au.com.woolworths.shop.aem.components.model.button;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/button/ButtonStyle;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonStyle {
    public static final ButtonStyle d;
    public static final ButtonStyle e;
    public static final ButtonStyle f;
    public static final ButtonStyle g;
    public static final ButtonStyle h;
    public static final ButtonStyle i;
    public static final ButtonStyle j;
    public static final /* synthetic */ ButtonStyle[] k;
    public static final /* synthetic */ EnumEntries l;

    static {
        ButtonStyle buttonStyle = new ButtonStyle("PRIMARY", 0);
        d = buttonStyle;
        ButtonStyle buttonStyle2 = new ButtonStyle("SECONDARY", 1);
        e = buttonStyle2;
        ButtonStyle buttonStyle3 = new ButtonStyle("TERTIARY", 2);
        f = buttonStyle3;
        ButtonStyle buttonStyle4 = new ButtonStyle("DESTRUCTIVE", 3);
        g = buttonStyle4;
        ButtonStyle buttonStyle5 = new ButtonStyle("INFO", 4);
        h = buttonStyle5;
        ButtonStyle buttonStyle6 = new ButtonStyle("INSTOCK", 5);
        i = buttonStyle6;
        ButtonStyle buttonStyle7 = new ButtonStyle("UNKNOWN", 6);
        j = buttonStyle7;
        ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2, buttonStyle3, buttonStyle4, buttonStyle5, buttonStyle6, buttonStyle7};
        k = buttonStyleArr;
        l = EnumEntriesKt.a(buttonStyleArr);
    }

    public static ButtonStyle valueOf(String str) {
        return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
    }

    public static ButtonStyle[] values() {
        return (ButtonStyle[]) k.clone();
    }
}
