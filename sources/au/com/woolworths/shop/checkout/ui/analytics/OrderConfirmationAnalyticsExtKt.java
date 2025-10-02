package au.com.woolworths.shop.checkout.ui.analytics;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValueKt;
import au.com.woolworths.shop.checkout.domain.model.ProductInfo;
import au.com.woolworths.shop.checkout.domain.model.ProductInfoKt;
import au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmation;
import au.com.woolworths.shop.checkout.domain.model.confirmation.OrderInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OrderConfirmationAnalyticsExtKt {
    public static final TrackingMetadata a(OrderConfirmation orderConfirmation) {
        OrderInfo orderInfo = orderConfirmation.c;
        ArrayList arrayList = orderInfo.f10653a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ProductInfoKt.a((ProductInfo) it.next()));
        }
        TrackingMetadata trackingMetadataA = ProductTrackingValueKt.a(arrayList2);
        trackingMetadataA.b(TrackableValue.b0, orderInfo.h);
        trackingMetadataA.b(TrackableValue.i0, orderInfo.n);
        trackingMetadataA.b(TrackableValue.t0, Boolean.valueOf(orderInfo.b));
        trackingMetadataA.b(TrackableValue.c1, orderInfo.j);
        trackingMetadataA.b(TrackableValue.h1, orderInfo.f);
        trackingMetadataA.b(TrackableValue.e1, Boolean.valueOf(orderInfo.k));
        trackingMetadataA.b(TrackableValue.R2, orderInfo.e);
        trackingMetadataA.b(TrackableValue.o1, orderInfo.p);
        trackingMetadataA.b(TrackableValue.w1, orderInfo.o);
        trackingMetadataA.b(TrackableValue.x1, orderInfo.g);
        trackingMetadataA.b(TrackableValue.y1, Integer.valueOf(arrayList.size()));
        trackingMetadataA.b(TrackableValue.A2, orderInfo.m ? "Y" : "N");
        trackingMetadataA.b(TrackableValue.x3, orderInfo.i);
        trackingMetadataA.b(TrackableValue.k1, orderInfo.l);
        trackingMetadataA.b(TrackableValue.g1, orderInfo.q);
        trackingMetadataA.b(TrackableValue.i1, Boolean.valueOf(orderInfo.r));
        trackingMetadataA.b(TrackableValue.n1, orderInfo.s);
        trackingMetadataA.b(TrackableValue.p1, orderInfo.t);
        trackingMetadataA.b(TrackableValue.t1, orderInfo.u);
        trackingMetadataA.b(TrackableValue.l1, orderInfo.v);
        trackingMetadataA.b(TrackableValue.f1, orderInfo.w);
        trackingMetadataA.b(TrackableValue.u1, orderInfo.x);
        trackingMetadataA.b(TrackableValue.m1, orderInfo.y);
        return trackingMetadataA;
    }
}
