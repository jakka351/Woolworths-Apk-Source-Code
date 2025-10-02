package au.com.woolworths.design.core.ui.component.experimental.quantitystepper;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/quantitystepper/Side;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class Side {
    public static final Side d;
    public static final Side e;
    public static final /* synthetic */ Side[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        Side side = new Side("Start", 0);
        d = side;
        Side side2 = new Side("End", 1);
        e = side2;
        Side[] sideArr = {side, side2};
        f = sideArr;
        g = EnumEntriesKt.a(sideArr);
    }

    public static Side valueOf(String str) {
        return (Side) Enum.valueOf(Side.class, str);
    }

    public static Side[] values() {
        return (Side[]) f.clone();
    }
}
