package au.com.woolworths.feature.shop.homepage.data;

import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValue;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValueKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderCardDataKt {
    public static final TrackingMetadata a(OrderCardData orderCardData) {
        Intrinsics.h(orderCardData, "<this>");
        return ProductTrackingValueKt.a(CollectionsKt.Q(new ProductTrackingValue(orderCardData.d, null, null, null, null, null, null, null, null, null, null, null, 16382)));
    }
}
