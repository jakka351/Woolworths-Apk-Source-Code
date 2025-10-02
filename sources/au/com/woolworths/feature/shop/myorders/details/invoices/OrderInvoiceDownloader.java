package au.com.woolworths.feature.shop.myorders.details.invoices;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.feature.shop.bundles.ui.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/invoices/OrderInvoiceDownloader;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderInvoiceDownloader {

    /* renamed from: a, reason: collision with root package name */
    public final OrderInvoiceRepository f7740a;
    public final DispatcherProvider b;
    public final Lazy c;

    public OrderInvoiceDownloader(OrderInvoiceRepository orderInvoiceRepository, DispatcherProvider dispatchers) {
        Intrinsics.h(dispatchers, "dispatchers");
        this.f7740a = orderInvoiceRepository;
        this.b = dispatchers;
        this.c = LazyKt.b(new a(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.io.File r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r10 instanceof au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceDownloader$getOrderInvoice$1
            if (r0 == 0) goto L13
            r0 = r10
            au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceDownloader$getOrderInvoice$1 r0 = (au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceDownloader$getOrderInvoice$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceDownloader$getOrderInvoice$1 r0 = new au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceDownloader$getOrderInvoice$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3a
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            kotlin.ResultKt.b(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.String r9 = r0.q
            java.io.File r8 = r0.p
            kotlin.ResultKt.b(r10)
            goto L4c
        L3a:
            kotlin.ResultKt.b(r10)
            r0.p = r8
            r0.q = r9
            r0.t = r3
            au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceRepository r10 = r7.f7740a
            java.lang.Object r10 = r10.a(r9, r0)
            if (r10 != r1) goto L4c
            goto La9
        L4c:
            au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoice r10 = (au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoice) r10
            boolean r2 = r10 instanceof au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceDetail
            if (r2 == 0) goto Lab
            au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceDetail r10 = (au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceDetail) r10
            java.io.File r2 = new java.io.File
            java.lang.String r3 = ".pdf"
            java.lang.String r9 = YU.a.g(r9, r3)
            r2.<init>(r8, r9)
            boolean r8 = r2.exists()
            if (r8 == 0) goto L70
            long r8 = r2.length()
            r5 = 0
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 <= 0) goto L70
            return r2
        L70:
            java.lang.String r8 = r10.f7739a
            r9 = 0
            r0.p = r9
            r0.q = r9
            r0.t = r4
            kotlin.coroutines.SafeContinuation r9 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
            r9.<init>(r10)
            kotlin.Lazy r10 = r7.c
            java.lang.Object r10 = r10.getD()
            okhttp3.OkHttpClient r10 = (okhttp3.OkHttpClient) r10
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            r0.h(r8)
            okhttp3.Request r8 = new okhttp3.Request
            r8.<init>(r0)
            okhttp3.internal.connection.RealCall r8 = r10.a(r8)
            au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceDownloader$downloadFile$2$1 r10 = new au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceDownloader$downloadFile$2$1
            r10.<init>()
            com.google.firebase.perf.network.FirebasePerfOkHttpClient.enqueue(r8, r10)
            java.lang.Object r8 = r9.a()
            if (r8 != r1) goto Laa
        La9:
            return r1
        Laa:
            return r8
        Lab:
            boolean r8 = r10 instanceof au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceError
            if (r8 == 0) goto Lbe
            au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceFailureException r8 = new au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceFailureException
            au.com.woolworths.android.onesite.models.text.PlainText r9 = new au.com.woolworths.android.onesite.models.text.PlainText
            au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceError r10 = (au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceError) r10
            java.lang.String r10 = r10.f7741a
            r9.<init>(r10)
            r8.<init>(r9)
            throw r8
        Lbe:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.invoices.OrderInvoiceDownloader.a(java.io.File, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
