package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/TabSlots;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TabSlots {
    public static final TabSlots d;
    public static final TabSlots e;
    public static final TabSlots f;
    public static final /* synthetic */ TabSlots[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        TabSlots tabSlots = new TabSlots("Tabs", 0);
        d = tabSlots;
        TabSlots tabSlots2 = new TabSlots("Divider", 1);
        e = tabSlots2;
        TabSlots tabSlots3 = new TabSlots("Indicator", 2);
        f = tabSlots3;
        TabSlots[] tabSlotsArr = {tabSlots, tabSlots2, tabSlots3};
        g = tabSlotsArr;
        h = EnumEntriesKt.a(tabSlotsArr);
    }

    public static TabSlots valueOf(String str) {
        return (TabSlots) Enum.valueOf(TabSlots.class, str);
    }

    public static TabSlots[] values() {
        return (TabSlots[]) g.clone();
    }
}
