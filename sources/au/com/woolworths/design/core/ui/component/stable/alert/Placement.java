package au.com.woolworths.design.core.ui.component.stable.alert;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/alert/Placement;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Placement {
    public static final Placement d;
    public static final /* synthetic */ Placement[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        Placement placement = new Placement("Inset", 0);
        d = placement;
        Placement[] placementArr = {placement, new Placement("Page", 1)};
        e = placementArr;
        f = EnumEntriesKt.a(placementArr);
    }

    public static Placement valueOf(String str) {
        return (Placement) Enum.valueOf(Placement.class, str);
    }

    public static Placement[] values() {
        return (Placement[]) e.clone();
    }
}
