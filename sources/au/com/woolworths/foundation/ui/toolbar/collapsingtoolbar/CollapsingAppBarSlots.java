package au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/ui/toolbar/collapsingtoolbar/CollapsingAppBarSlots;", "", "toolbar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CollapsingAppBarSlots {
    public static final CollapsingAppBarSlots d;
    public static final CollapsingAppBarSlots e;
    public static final CollapsingAppBarSlots f;
    public static final /* synthetic */ CollapsingAppBarSlots[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        CollapsingAppBarSlots collapsingAppBarSlots = new CollapsingAppBarSlots("Background", 0);
        d = collapsingAppBarSlots;
        CollapsingAppBarSlots collapsingAppBarSlots2 = new CollapsingAppBarSlots("AppBar", 1);
        e = collapsingAppBarSlots2;
        CollapsingAppBarSlots collapsingAppBarSlots3 = new CollapsingAppBarSlots("Overlay", 2);
        f = collapsingAppBarSlots3;
        CollapsingAppBarSlots[] collapsingAppBarSlotsArr = {collapsingAppBarSlots, collapsingAppBarSlots2, collapsingAppBarSlots3};
        g = collapsingAppBarSlotsArr;
        h = EnumEntriesKt.a(collapsingAppBarSlotsArr);
    }

    public static CollapsingAppBarSlots valueOf(String str) {
        return (CollapsingAppBarSlots) Enum.valueOf(CollapsingAppBarSlots.class, str);
    }

    public static CollapsingAppBarSlots[] values() {
        return (CollapsingAppBarSlots[]) g.clone();
    }
}
