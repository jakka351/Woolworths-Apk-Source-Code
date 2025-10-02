package au.com.woolworths.feature.shop.instore.navigation.map.content;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/content/PinContent;", "Lau/com/woolworths/feature/shop/instore/navigation/map/content/OriientMapContent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PinContent implements OriientMapContent {

    /* renamed from: a, reason: collision with root package name */
    public final int f7330a;
    public final OriientMetersCoordinate b;

    public PinContent(int i, OriientMetersCoordinate coordinate) {
        Intrinsics.h(coordinate, "coordinate");
        this.f7330a = i;
        this.b = coordinate;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.content.OriientMapContent
    /* renamed from: getCoordinate, reason: from getter */
    public final OriientMetersCoordinate getB() {
        return this.b;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.content.OriientMapContent
    /* renamed from: getFloorOrder, reason: from getter */
    public final int getF7330a() {
        return this.f7330a;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.content.OriientMapContent
    public final String getId() {
        return "ROUTE_PIN_ID";
    }

    public final String toString() {
        return "PinContent(id='ROUTE_PIN_ID', coordinate=" + this.b + ")";
    }
}
