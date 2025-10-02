package au.com.woolworths.feature.shop.instore.navigation.map.utils;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/utils/Meters;", "", "value", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: classes3.dex */
public final class Meters implements Comparable<Meters> {
    public static String a(double d) {
        return "Meters(value=" + d + ")";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Meters meters) {
        meters.getClass();
        return Double.compare(0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Meters) && Double.compare(0.0d, 0.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(0.0d);
    }

    public final String toString() {
        return a(0.0d);
    }
}
