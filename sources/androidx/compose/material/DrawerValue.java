package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DrawerValue;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerValue {
    public static final DrawerValue d;
    public static final DrawerValue e;
    public static final /* synthetic */ DrawerValue[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        DrawerValue drawerValue = new DrawerValue("Closed", 0);
        d = drawerValue;
        DrawerValue drawerValue2 = new DrawerValue("Open", 1);
        e = drawerValue2;
        DrawerValue[] drawerValueArr = {drawerValue, drawerValue2};
        f = drawerValueArr;
        g = EnumEntriesKt.a(drawerValueArr);
    }

    public static DrawerValue valueOf(String str) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, str);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) f.clone();
    }
}
