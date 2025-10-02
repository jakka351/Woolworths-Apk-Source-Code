package au.com.woolworths.feature.shop.instore.navigation.map.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSCoordinate;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IpsCoordinateExtKt {
    public static final OriientMetersCoordinate a(IPSCoordinate iPSCoordinate) {
        Intrinsics.h(iPSCoordinate, "<this>");
        return new OriientMetersCoordinate(iPSCoordinate.getX(), iPSCoordinate.getY());
    }
}
