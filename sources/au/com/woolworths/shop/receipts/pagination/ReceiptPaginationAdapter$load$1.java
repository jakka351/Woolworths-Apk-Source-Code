package au.com.woolworths.shop.receipts.pagination;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.receipts.pagination.ReceiptPaginationAdapter", f = "ReceiptPaginationAdapter.kt", l = {37}, m = "load")
/* loaded from: classes4.dex */
final class ReceiptPaginationAdapter$load$1 extends ContinuationImpl {
    public Integer p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ReceiptPaginationAdapter r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptPaginationAdapter$load$1(ReceiptPaginationAdapter receiptPaginationAdapter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = receiptPaginationAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(null, this);
    }
}
