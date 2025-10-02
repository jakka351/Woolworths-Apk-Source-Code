package au.com.woolworths.feature.shop.myorders.details.invoices;

import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceDownloader", f = "OrderInvoiceDownloader.kt", l = {34, 44}, m = "getOrderInvoice")
/* loaded from: classes3.dex */
final class OrderInvoiceDownloader$getOrderInvoice$1 extends ContinuationImpl {
    public File p;
    public String q;
    public /* synthetic */ Object r;
    public final /* synthetic */ OrderInvoiceDownloader s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderInvoiceDownloader$getOrderInvoice$1(OrderInvoiceDownloader orderInvoiceDownloader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = orderInvoiceDownloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(null, null, this);
    }
}
