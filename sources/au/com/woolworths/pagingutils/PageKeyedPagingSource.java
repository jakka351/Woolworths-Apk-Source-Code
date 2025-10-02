package au.com.woolworths.pagingutils;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/pagingutils/PageKeyedPagingSource;", "", "K", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/PagingSource;", "paging-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PageKeyedPagingSource<K, T> extends PagingSource<K, T> {
    public final PageData b;
    public final SuspendLambda c;
    public final MutableLiveData d = new MutableLiveData();
    public final MutableLiveData e = new MutableLiveData();
    public final MutableLiveData f = new MutableLiveData();
    public final MutableLiveData g = new MutableLiveData();

    /* JADX WARN: Multi-variable type inference failed */
    public PageKeyedPagingSource(PageData pageData, Function3 function3) {
        this.b = pageData;
        this.c = (SuspendLambda) function3;
    }

    @Override // androidx.paging.PagingSource
    public final Object b(PagingState pagingState) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:29:0x0068, B:30:0x006a, B:32:0x008f, B:33:0x0092, B:21:0x0047, B:23:0x004b, B:26:0x0050), top: B:40:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(androidx.paging.PagingSource.LoadParams r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof au.com.woolworths.pagingutils.PageKeyedPagingSource$load$1
            if (r0 == 0) goto L13
            r0 = r11
            au.com.woolworths.pagingutils.PageKeyedPagingSource$load$1 r0 = (au.com.woolworths.pagingutils.PageKeyedPagingSource$load$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.pagingutils.PageKeyedPagingSource$load$1 r0 = new au.com.woolworths.pagingutils.PageKeyedPagingSource$load$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            androidx.lifecycle.MutableLiveData r4 = r9.e
            androidx.lifecycle.MutableLiveData r5 = r9.d
            r6 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            androidx.paging.PagingSource$LoadParams r10 = r0.p
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Exception -> L2e
            goto L68
        L2e:
            r11 = move-exception
            goto La0
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            kotlin.ResultKt.b(r11)
            au.com.woolworths.pagingutils.NetworkState r11 = au.com.woolworths.pagingutils.NetworkState.e
            r5.j(r11)
            boolean r2 = r10 instanceof androidx.paging.PagingSource.LoadParams.Refresh
            if (r2 == 0) goto L47
            r4.j(r11)
        L47:
            boolean r11 = r10 instanceof androidx.paging.PagingSource.LoadParams.Refresh     // Catch: java.lang.Exception -> L2e
            if (r11 == 0) goto L50
            au.com.woolworths.pagingutils.PageData r11 = r9.b     // Catch: java.lang.Exception -> L2e
            if (r11 == 0) goto L50
            goto L6a
        L50:
            kotlin.coroutines.jvm.internal.SuspendLambda r11 = r9.c     // Catch: java.lang.Exception -> L2e
            java.lang.Object r2 = r10.getC()     // Catch: java.lang.Exception -> L2e
            int r7 = r10.f3582a     // Catch: java.lang.Exception -> L2e
            java.lang.Integer r8 = new java.lang.Integer     // Catch: java.lang.Exception -> L2e
            r8.<init>(r7)     // Catch: java.lang.Exception -> L2e
            r0.p = r10     // Catch: java.lang.Exception -> L2e
            r0.s = r3     // Catch: java.lang.Exception -> L2e
            java.lang.Object r11 = r11.invoke(r2, r8, r0)     // Catch: java.lang.Exception -> L2e
            if (r11 != r1) goto L68
            return r1
        L68:
            au.com.woolworths.pagingutils.PageData r11 = (au.com.woolworths.pagingutils.PageData) r11     // Catch: java.lang.Exception -> L2e
        L6a:
            androidx.lifecycle.MutableLiveData r0 = r9.g     // Catch: java.lang.Exception -> L2e
            au.com.woolworths.pagingutils.KeyedPageData r1 = new au.com.woolworths.pagingutils.KeyedPageData     // Catch: java.lang.Exception -> L2e
            java.lang.Object r2 = r10.getC()     // Catch: java.lang.Exception -> L2e
            r1.<init>(r2, r11)     // Catch: java.lang.Exception -> L2e
            r0.j(r1)     // Catch: java.lang.Exception -> L2e
            androidx.lifecycle.MutableLiveData r0 = r9.f     // Catch: java.lang.Exception -> L2e
            int r1 = r11.getTotalCount()     // Catch: java.lang.Exception -> L2e
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Exception -> L2e
            r2.<init>(r1)     // Catch: java.lang.Exception -> L2e
            r0.j(r2)     // Catch: java.lang.Exception -> L2e
            au.com.woolworths.pagingutils.NetworkState r0 = au.com.woolworths.pagingutils.NetworkState.d     // Catch: java.lang.Exception -> L2e
            r5.j(r0)     // Catch: java.lang.Exception -> L2e
            boolean r1 = r10 instanceof androidx.paging.PagingSource.LoadParams.Refresh     // Catch: java.lang.Exception -> L2e
            if (r1 == 0) goto L92
            r4.j(r0)     // Catch: java.lang.Exception -> L2e
        L92:
            androidx.paging.PagingSource$LoadResult$Page r0 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: java.lang.Exception -> L2e
            java.util.List r1 = r11.getItems()     // Catch: java.lang.Exception -> L2e
            java.lang.Object r11 = r11.getNextPageKey()     // Catch: java.lang.Exception -> L2e
            r0.<init>(r1, r6, r11)     // Catch: java.lang.Exception -> L2e
            return r0
        La0:
            au.com.woolworths.pagingutils.NetworkState r0 = au.com.woolworths.pagingutils.NetworkState.d
            au.com.woolworths.pagingutils.NetworkState r0 = new au.com.woolworths.pagingutils.NetworkState
            au.com.woolworths.pagingutils.Status r1 = au.com.woolworths.pagingutils.Status.f
            r0.<init>(r1, r6, r11)
            r5.j(r0)
            boolean r10 = r10 instanceof androidx.paging.PagingSource.LoadParams.Refresh
            if (r10 == 0) goto Lb3
            r4.j(r0)
        Lb3:
            androidx.paging.PagingSource$LoadResult$Error r10 = new androidx.paging.PagingSource$LoadResult$Error
            r10.<init>(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.pagingutils.PageKeyedPagingSource.d(androidx.paging.PagingSource$LoadParams, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
