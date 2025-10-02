package au.com.woolworths.feature.shop.myorders.details.models;

import au.com.woolworths.feature.shop.myorders.details.models.CancelOrderReasonExtKt;
import com.woolworths.feature.shop.myorders.CancelOrderMutation;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CancelOrderMutationCancelOrderExtKt {
    public static final CancelOrderResponse a(CancelOrderMutation.CancelOrder cancelOrder) {
        boolean z = cancelOrder.f19853a;
        String str = cancelOrder.b;
        au.com.woolworths.shop.graphql.type.CancelOrderReason cancelOrderReason = cancelOrder.c;
        return new CancelOrderResponse(z, str, cancelOrderReason != null ? CancelOrderReasonExtKt.WhenMappings.f7744a[cancelOrderReason.ordinal()] == 1 ? CancelOrderReason.d : CancelOrderReason.e : null);
    }
}
