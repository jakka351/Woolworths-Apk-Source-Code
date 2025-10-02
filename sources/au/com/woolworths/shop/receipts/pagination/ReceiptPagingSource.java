package au.com.woolworths.shop.receipts.pagination;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/receipts/pagination/ReceiptPagingSource;", "Landroidx/paging/PagingSource;", "", "Lau/com/woolworths/shop/receipts/pagination/ReceiptRowEntry;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReceiptPagingSource extends PagingSource<Integer, ReceiptRowEntry> {
    public final ReceiptPaginationAdapter b;

    public ReceiptPagingSource(ReceiptPaginationAdapter adapter) {
        Intrinsics.h(adapter, "adapter");
        this.b = adapter;
    }

    @Override // androidx.paging.PagingSource
    public final Object b(PagingState pagingState) {
        ReceiptPaginationAdapter receiptPaginationAdapter = this.b;
        receiptPaginationAdapter.c = null;
        receiptPaginationAdapter.d.clear();
        receiptPaginationAdapter.b = null;
        return null;
    }

    @Override // androidx.paging.PagingSource
    public final Object d(PagingSource.LoadParams loadParams, ContinuationImpl continuationImpl) {
        return this.b.b((Integer) loadParams.getC(), continuationImpl);
    }
}
