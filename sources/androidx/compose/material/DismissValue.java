package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DismissValue;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DismissValue {
    public static final DismissValue d;
    public static final DismissValue e;
    public static final DismissValue f;
    public static final /* synthetic */ DismissValue[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        DismissValue dismissValue = new DismissValue("Default", 0);
        d = dismissValue;
        DismissValue dismissValue2 = new DismissValue("DismissedToEnd", 1);
        e = dismissValue2;
        DismissValue dismissValue3 = new DismissValue("DismissedToStart", 2);
        f = dismissValue3;
        DismissValue[] dismissValueArr = {dismissValue, dismissValue2, dismissValue3};
        g = dismissValueArr;
        h = EnumEntriesKt.a(dismissValueArr);
    }

    public static DismissValue valueOf(String str) {
        return (DismissValue) Enum.valueOf(DismissValue.class, str);
    }

    public static DismissValue[] values() {
        return (DismissValue[]) g.clone();
    }
}
