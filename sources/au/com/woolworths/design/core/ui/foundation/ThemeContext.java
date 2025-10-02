package au.com.woolworths.design.core.ui.foundation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/ThemeContext;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThemeContext {
    public static final ThemeContext d;
    public static final ThemeContext e;
    public static final /* synthetic */ ThemeContext[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ThemeContext themeContext = new ThemeContext("Woolworths", 0);
        d = themeContext;
        ThemeContext themeContext2 = new ThemeContext("Everyday", 1);
        e = themeContext2;
        ThemeContext[] themeContextArr = {themeContext, themeContext2};
        f = themeContextArr;
        g = EnumEntriesKt.a(themeContextArr);
    }

    public static ThemeContext valueOf(String str) {
        return (ThemeContext) Enum.valueOf(ThemeContext.class, str);
    }

    public static ThemeContext[] values() {
        return (ThemeContext[]) f.clone();
    }
}
