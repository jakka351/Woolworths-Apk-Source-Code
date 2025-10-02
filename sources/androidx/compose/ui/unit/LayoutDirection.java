package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/LayoutDirection;", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutDirection {
    public static final LayoutDirection d;
    public static final LayoutDirection e;
    public static final /* synthetic */ LayoutDirection[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        LayoutDirection layoutDirection = new LayoutDirection("Ltr", 0);
        d = layoutDirection;
        LayoutDirection layoutDirection2 = new LayoutDirection("Rtl", 1);
        e = layoutDirection2;
        LayoutDirection[] layoutDirectionArr = {layoutDirection, layoutDirection2};
        f = layoutDirectionArr;
        g = EnumEntriesKt.a(layoutDirectionArr);
    }

    public static LayoutDirection valueOf(String str) {
        return (LayoutDirection) Enum.valueOf(LayoutDirection.class, str);
    }

    public static LayoutDirection[] values() {
        return (LayoutDirection[]) f.clone();
    }
}
