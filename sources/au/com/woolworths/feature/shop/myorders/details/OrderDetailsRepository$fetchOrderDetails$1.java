package au.com.woolworths.feature.shop.myorders.details;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository", f = "OrderDetailsRepository.kt", l = {102}, m = "fetchOrderDetails")
/* loaded from: classes3.dex */
final class OrderDetailsRepository$fetchOrderDetails$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ OrderDetailsRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailsRepository$fetchOrderDetails$1(OrderDetailsRepository orderDetailsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = orderDetailsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(0, null, this);
    }
}
