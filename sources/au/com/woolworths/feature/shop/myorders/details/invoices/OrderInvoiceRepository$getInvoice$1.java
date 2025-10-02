package au.com.woolworths.feature.shop.myorders.details.invoices;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceRepository", f = "OrderInvoiceRepository.kt", l = {21}, m = "getInvoice")
/* loaded from: classes3.dex */
final class OrderInvoiceRepository$getInvoice$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ OrderInvoiceRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderInvoiceRepository$getInvoice$1(OrderInvoiceRepository orderInvoiceRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = orderInvoiceRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
