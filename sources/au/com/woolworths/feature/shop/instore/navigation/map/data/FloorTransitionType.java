package au.com.woolworths.feature.shop.instore.navigation.map.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/FloorTransitionType;", "", "Companion", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FloorTransitionType {
    public static final Companion d;
    public static final FloorTransitionType e;
    public static final FloorTransitionType f;
    public static final FloorTransitionType g;
    public static final FloorTransitionType h;
    public static final /* synthetic */ FloorTransitionType[] i;
    public static final /* synthetic */ EnumEntries j;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/FloorTransitionType$Companion;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        FloorTransitionType floorTransitionType = new FloorTransitionType("STAIRS", 0);
        e = floorTransitionType;
        FloorTransitionType floorTransitionType2 = new FloorTransitionType("ELEVATOR", 1);
        f = floorTransitionType2;
        FloorTransitionType floorTransitionType3 = new FloorTransitionType("ESCALATOR", 2);
        g = floorTransitionType3;
        FloorTransitionType floorTransitionType4 = new FloorTransitionType("RAMP", 3);
        h = floorTransitionType4;
        FloorTransitionType[] floorTransitionTypeArr = {floorTransitionType, floorTransitionType2, floorTransitionType3, floorTransitionType4};
        i = floorTransitionTypeArr;
        j = EnumEntriesKt.a(floorTransitionTypeArr);
        d = new Companion();
    }

    public static FloorTransitionType valueOf(String str) {
        return (FloorTransitionType) Enum.valueOf(FloorTransitionType.class, str);
    }

    public static FloorTransitionType[] values() {
        return (FloorTransitionType[]) i.clone();
    }
}
