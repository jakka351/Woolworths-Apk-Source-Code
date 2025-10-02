package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.feature.shop.homepage.data.OrderCardData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/OrdersClickListener;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OrdersClickListener {
    void B3(OrderCardData orderCardData);

    default void N4(OrderCardData data) {
        Intrinsics.h(data, "data");
    }
}
