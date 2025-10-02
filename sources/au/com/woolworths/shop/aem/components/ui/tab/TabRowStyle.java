package au.com.woolworths.shop.aem.components.ui.tab;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/ui/tab/TabRowStyle;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TabRowStyle {
    public static final TabRowStyle d;
    public static final TabRowStyle e;
    public static final /* synthetic */ TabRowStyle[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        TabRowStyle tabRowStyle = new TabRowStyle("Fixed", 0);
        d = tabRowStyle;
        TabRowStyle tabRowStyle2 = new TabRowStyle("Scrollable", 1);
        e = tabRowStyle2;
        TabRowStyle[] tabRowStyleArr = {tabRowStyle, tabRowStyle2};
        f = tabRowStyleArr;
        g = EnumEntriesKt.a(tabRowStyleArr);
    }

    public static TabRowStyle valueOf(String str) {
        return (TabRowStyle) Enum.valueOf(TabRowStyle.class, str);
    }

    public static TabRowStyle[] values() {
        return (TabRowStyle[]) f.clone();
    }
}
