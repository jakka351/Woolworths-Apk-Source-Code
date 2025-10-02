package au.com.woolworths.feature.shop.myorders.details.models;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/StarCount;", "", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StarCount {
    public static final Companion e;
    public static final LinkedHashMap f;
    public static final StarCount g;
    public static final StarCount h;
    public static final StarCount i;
    public static final StarCount j;
    public static final StarCount k;
    public static final StarCount l;
    public static final /* synthetic */ StarCount[] m;
    public static final /* synthetic */ EnumEntries n;
    public final int d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/StarCount$Companion;", "", "", "", "Lau/com/woolworths/feature/shop/myorders/details/models/StarCount;", "map", "Ljava/util/Map;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static StarCount a(int i) {
            StarCount starCount = (StarCount) StarCount.f.get(Integer.valueOf(i));
            return starCount == null ? StarCount.g : starCount;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        StarCount starCount = new StarCount("NONE", 0, 0);
        g = starCount;
        StarCount starCount2 = new StarCount("ONE", 1, 1);
        h = starCount2;
        StarCount starCount3 = new StarCount("TWO", 2, 2);
        i = starCount3;
        StarCount starCount4 = new StarCount("THREE", 3, 3);
        j = starCount4;
        StarCount starCount5 = new StarCount("FOUR", 4, 4);
        k = starCount5;
        StarCount starCount6 = new StarCount("FIVE", 5, 5);
        l = starCount6;
        StarCount[] starCountArr = {starCount, starCount2, starCount3, starCount4, starCount5, starCount6};
        m = starCountArr;
        EnumEntries enumEntriesA = EnumEntriesKt.a(starCountArr);
        n = enumEntriesA;
        e = new Companion();
        int iH = MapsKt.h(CollectionsKt.s(enumEntriesA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        Iterator it = ((AbstractList) enumEntriesA).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(Integer.valueOf(((StarCount) next).d), next);
        }
        f = linkedHashMap;
    }

    public StarCount(String str, int i2, int i3) {
        this.d = i3;
    }

    public static StarCount valueOf(String str) {
        return (StarCount) Enum.valueOf(StarCount.class, str);
    }

    public static StarCount[] values() {
        return (StarCount[]) m.clone();
    }
}
