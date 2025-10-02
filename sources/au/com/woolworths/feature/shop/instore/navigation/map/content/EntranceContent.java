package au.com.woolworths.feature.shop.instore.navigation.map.content;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/content/EntranceContent;", "Lau/com/woolworths/feature/shop/instore/navigation/map/content/OriientMapContent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EntranceContent implements OriientMapContent {

    /* renamed from: a, reason: collision with root package name */
    public final String f7329a;
    public final int b;
    public final OriientMetersCoordinate c;

    public EntranceContent(String str, int i, OriientMetersCoordinate oriientMetersCoordinate) {
        this.f7329a = str;
        this.b = i;
        this.c = oriientMetersCoordinate;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.content.OriientMapContent
    /* renamed from: getCoordinate, reason: from getter */
    public final OriientMetersCoordinate getC() {
        return this.c;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.content.OriientMapContent
    /* renamed from: getFloorOrder, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.content.OriientMapContent
    /* renamed from: getId, reason: from getter */
    public final String getF7329a() {
        return this.f7329a;
    }

    public final String toString() {
        return "EntranceContent(id='" + this.f7329a + "', coordinate=" + this.c + ", contentIds=" + EmptyList.d + ")";
    }
}
