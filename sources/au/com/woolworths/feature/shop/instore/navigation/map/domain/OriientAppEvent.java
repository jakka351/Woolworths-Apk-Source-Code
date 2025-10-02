package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientAppEvent;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OriientAppEvent {
    public static final OriientAppEvent e;
    public static final OriientAppEvent f;
    public static final OriientAppEvent g;
    public static final OriientAppEvent h;
    public static final OriientAppEvent i;
    public static final OriientAppEvent j;
    public static final OriientAppEvent k;
    public static final OriientAppEvent l;
    public static final /* synthetic */ OriientAppEvent[] m;
    public static final /* synthetic */ EnumEntries n;
    public final int d;

    static {
        OriientAppEvent oriientAppEvent = new OriientAppEvent("CalibrationDialogPresented", 0, 0);
        e = oriientAppEvent;
        OriientAppEvent oriientAppEvent2 = new OriientAppEvent("CalibrationDialogHidden", 1, 1);
        f = oriientAppEvent2;
        OriientAppEvent oriientAppEvent3 = new OriientAppEvent("MapPresented", 2, 2);
        g = oriientAppEvent3;
        OriientAppEvent oriientAppEvent4 = new OriientAppEvent("MapHidden", 3, 3);
        h = oriientAppEvent4;
        OriientAppEvent oriientAppEvent5 = new OriientAppEvent("UserPositionPresented", 4, 4);
        i = oriientAppEvent5;
        OriientAppEvent oriientAppEvent6 = new OriientAppEvent("UserPositionHidden", 5, 5);
        OriientAppEvent oriientAppEvent7 = new OriientAppEvent("NavigationPathPresented", 6, 6);
        j = oriientAppEvent7;
        OriientAppEvent oriientAppEvent8 = new OriientAppEvent("NavigationPathHidden", 7, 7);
        OriientAppEvent oriientAppEvent9 = new OriientAppEvent("WalkToLockPresented", 8, 8);
        k = oriientAppEvent9;
        OriientAppEvent oriientAppEvent10 = new OriientAppEvent("WalkToLockHidden", 9, 9);
        l = oriientAppEvent10;
        OriientAppEvent[] oriientAppEventArr = {oriientAppEvent, oriientAppEvent2, oriientAppEvent3, oriientAppEvent4, oriientAppEvent5, oriientAppEvent6, oriientAppEvent7, oriientAppEvent8, oriientAppEvent9, oriientAppEvent10};
        m = oriientAppEventArr;
        n = EnumEntriesKt.a(oriientAppEventArr);
    }

    public OriientAppEvent(String str, int i2, int i3) {
        this.d = i3;
    }

    public static OriientAppEvent valueOf(String str) {
        return (OriientAppEvent) Enum.valueOf(OriientAppEvent.class, str);
    }

    public static OriientAppEvent[] values() {
        return (OriientAppEvent[]) m.clone();
    }
}
