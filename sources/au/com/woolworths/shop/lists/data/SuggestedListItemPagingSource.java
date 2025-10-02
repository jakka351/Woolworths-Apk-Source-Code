package au.com.woolworths.shop.lists.data;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import au.com.woolworths.shop.lists.data.model.SuggestedListItem;
import au.com.woolworths.shop.lists.data.repository.SuggestedListsRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/lists/data/SuggestedListItemPagingSource;", "Landroidx/paging/PagingSource;", "", "Lau/com/woolworths/shop/lists/data/model/SuggestedListItem;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SuggestedListItemPagingSource extends PagingSource<Integer, SuggestedListItem> {
    public final SuggestedListsRepository b;

    public SuggestedListItemPagingSource(SuggestedListsRepository repository) {
        Intrinsics.h(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.paging.PagingSource
    public final Object b(PagingState pagingState) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(androidx.paging.PagingSource.LoadParams r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.shop.lists.data.SuggestedListItemPagingSource$load$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.lists.data.SuggestedListItemPagingSource$load$1 r0 = (au.com.woolworths.shop.lists.data.SuggestedListItemPagingSource$load$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.SuggestedListItemPagingSource$load$1 r0 = new au.com.woolworths.shop.lists.data.SuggestedListItemPagingSource$load$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r7)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            goto L5b
        L27:
            r6 = move-exception
            goto L6c
        L29:
            r6 = move-exception
            goto L72
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r7)
            java.lang.Object r6 = r6.getC()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            if (r6 == 0) goto L43
            int r6 = r6.intValue()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            goto L44
        L43:
            r6 = r3
        L44:
            au.com.woolworths.shop.lists.data.repository.SuggestedListsRepository r7 = r5.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            java.lang.Integer r2 = new java.lang.Integer     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            r2.<init>(r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            java.lang.Integer r6 = new java.lang.Integer     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            r4 = 20
            r6.<init>(r4)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            java.lang.Object r7 = r7.a(r2, r6, r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            if (r7 != r1) goto L5b
            return r1
        L5b:
            au.com.woolworths.shop.lists.data.model.SuggestedLists r7 = (au.com.woolworths.shop.lists.data.model.SuggestedLists) r7     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            androidx.paging.PagingSource$LoadResult$Page r6 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            java.util.List r0 = r7.getItems()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            java.lang.Integer r7 = r7.getNextPageKey()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            r1 = 0
            r6.<init>(r0, r1, r7)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            return r6
        L6c:
            androidx.paging.PagingSource$LoadResult$Error r7 = new androidx.paging.PagingSource$LoadResult$Error
            r7.<init>(r6)
            return r7
        L72:
            androidx.paging.PagingSource$LoadResult$Error r7 = new androidx.paging.PagingSource$LoadResult$Error
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.SuggestedListItemPagingSource.d(androidx.paging.PagingSource$LoadParams, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
