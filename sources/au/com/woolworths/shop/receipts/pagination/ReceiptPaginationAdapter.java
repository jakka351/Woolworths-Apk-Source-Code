package au.com.woolworths.shop.receipts.pagination;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.receipts.GetReceiptListInteractor;
import au.com.woolworths.shop.receipts.data.ReceiptListGroupHeader;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/pagination/ReceiptPaginationAdapter;", "", "Companion", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ReceiptPaginationAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final GetReceiptListInteractor f12872a;
    public ReceiptListGroupHeader b;
    public Integer c;
    public final LinkedHashMap d = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/receipts/pagination/ReceiptPaginationAdapter$Companion;", "", "", "LAST_PAGE_KEY", "I", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ReceiptPaginationAdapter(GetReceiptListInteractor getReceiptListInteractor) {
        this.f12872a = getReceiptListInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a(java.lang.Integer r10, au.com.woolworths.shop.receipts.data.ReceiptListResponse r11) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = r11.f12871a
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
            r4 = r3
        Ld:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L5c
            java.lang.Object r5 = r2.next()
            int r6 = r4 + 1
            r7 = 0
            if (r4 < 0) goto L58
            boolean r8 = r5 instanceof au.com.woolworths.shop.receipts.data.ReceiptListItem
            if (r8 == 0) goto L31
            au.com.woolworths.shop.receipts.pagination.ReceiptRowEntry$ReceiptItem r4 = new au.com.woolworths.shop.receipts.pagination.ReceiptRowEntry$ReceiptItem
            au.com.woolworths.shop.receipts.data.ReceiptListItem r5 = (au.com.woolworths.shop.receipts.data.ReceiptListItem) r5
            java.lang.String r7 = r5.f12869a
            java.lang.String r8 = r5.b
            java.lang.String r5 = r5.c
            r4.<init>(r7, r8, r5)
            r0.add(r4)
            goto L56
        L31:
            boolean r8 = r5 instanceof au.com.woolworths.shop.receipts.data.ReceiptListGroupHeader
            if (r8 == 0) goto L56
            if (r4 != 0) goto L48
            r4 = r5
            au.com.woolworths.shop.receipts.data.ReceiptListGroupHeader r4 = (au.com.woolworths.shop.receipts.data.ReceiptListGroupHeader) r4
            java.lang.String r4 = r4.f12868a
            au.com.woolworths.shop.receipts.data.ReceiptListGroupHeader r8 = r9.b
            if (r8 == 0) goto L42
            java.lang.String r7 = r8.f12868a
        L42:
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L56
        L48:
            au.com.woolworths.shop.receipts.pagination.ReceiptRowEntry$GroupHeader r4 = new au.com.woolworths.shop.receipts.pagination.ReceiptRowEntry$GroupHeader
            au.com.woolworths.shop.receipts.data.ReceiptListGroupHeader r5 = (au.com.woolworths.shop.receipts.data.ReceiptListGroupHeader) r5
            java.lang.String r7 = r5.f12868a
            r4.<init>(r7)
            r0.add(r4)
            r9.b = r5
        L56:
            r4 = r6
            goto Ld
        L58:
            kotlin.collections.CollectionsKt.z0()
            throw r7
        L5c:
            if (r10 != 0) goto L69
            boolean r10 = r1.isEmpty()
            if (r10 != 0) goto L69
            au.com.woolworths.shop.receipts.pagination.ReceiptRowEntry$MyOrdersBanner r10 = au.com.woolworths.shop.receipts.pagination.ReceiptRowEntry.MyOrdersBanner.f12874a
            r0.add(r3, r10)
        L69:
            au.com.woolworths.shop.receipts.data.ReceiptListPageInfo r10 = r11.b
            java.lang.Integer r10 = r10.f12870a
            if (r10 == 0) goto L76
            r11 = -1
            int r10 = r10.intValue()
            if (r10 != r11) goto L7b
        L76:
            au.com.woolworths.shop.receipts.pagination.ReceiptRowEntry$NoMoreReceipts r10 = au.com.woolworths.shop.receipts.pagination.ReceiptRowEntry.NoMoreReceipts.f12875a
            r0.add(r10)
        L7b:
            java.util.List r10 = java.util.Collections.unmodifiableList(r0)
            java.lang.String r11 = "unmodifiableList(...)"
            kotlin.jvm.internal.Intrinsics.g(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.receipts.pagination.ReceiptPaginationAdapter.a(java.lang.Integer, au.com.woolworths.shop.receipts.data.ReceiptListResponse):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Integer r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            java.util.LinkedHashMap r0 = r5.d
            boolean r1 = r7 instanceof au.com.woolworths.shop.receipts.pagination.ReceiptPaginationAdapter$load$1
            if (r1 == 0) goto L15
            r1 = r7
            au.com.woolworths.shop.receipts.pagination.ReceiptPaginationAdapter$load$1 r1 = (au.com.woolworths.shop.receipts.pagination.ReceiptPaginationAdapter$load$1) r1
            int r2 = r1.s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s = r2
            goto L1a
        L15:
            au.com.woolworths.shop.receipts.pagination.ReceiptPaginationAdapter$load$1 r1 = new au.com.woolworths.shop.receipts.pagination.ReceiptPaginationAdapter$load$1
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.s
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            java.lang.Integer r6 = r1.p
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L2b
            goto L47
        L2b:
            r6 = move-exception
            goto L88
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.shop.receipts.GetReceiptListInteractor r7 = r5.f12872a     // Catch: java.lang.Throwable -> L2b
            r1.p = r6     // Catch: java.lang.Throwable -> L2b
            r1.s = r4     // Catch: java.lang.Throwable -> L2b
            au.com.woolworths.shop.receipts.ReceiptListRepository r7 = r7.f12820a     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r7.a(r6, r1)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r2) goto L47
            return r2
        L47:
            au.com.woolworths.shop.receipts.data.ReceiptListResponse r7 = (au.com.woolworths.shop.receipts.data.ReceiptListResponse) r7     // Catch: java.lang.Throwable -> L2b
            au.com.woolworths.shop.receipts.data.ReceiptListPageInfo r1 = r7.b     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r1 = r1.f12870a     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r2 = r5.c     // Catch: java.lang.Throwable -> L2b
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2b
            r5.c = r1     // Catch: java.lang.Throwable -> L2b
            if (r6 != 0) goto L69
            java.util.ArrayList r1 = r7.f12871a     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L69
            androidx.paging.PagingSource$LoadResult$Error r6 = new androidx.paging.PagingSource$LoadResult$Error     // Catch: java.lang.Throwable -> L2b
            au.com.woolworths.shop.receipts.pagination.NoReceiptsError r7 = new au.com.woolworths.shop.receipts.pagination.NoReceiptsError     // Catch: java.lang.Throwable -> L2b
            r7.<init>()     // Catch: java.lang.Throwable -> L2b
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L2b
            return r6
        L69:
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L2b
            au.com.woolworths.shop.receipts.data.ReceiptListPageInfo r1 = r7.b     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r1 = r1.f12870a     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L76
            goto L7e
        L76:
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L2b
            r3 = -1
            if (r2 != r3) goto L7e
            r1 = 0
        L7e:
            java.util.List r6 = r5.a(r6, r7)     // Catch: java.lang.Throwable -> L2b
            androidx.paging.PagingSource$LoadResult$Page r7 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: java.lang.Throwable -> L2b
            r7.<init>(r6, r0, r1)     // Catch: java.lang.Throwable -> L2b
            return r7
        L88:
            androidx.paging.PagingSource$LoadResult$Error r7 = new androidx.paging.PagingSource$LoadResult$Error
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.receipts.pagination.ReceiptPaginationAdapter.b(java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
