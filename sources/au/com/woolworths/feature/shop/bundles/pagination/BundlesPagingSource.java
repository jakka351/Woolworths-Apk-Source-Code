package au.com.woolworths.feature.shop.bundles.pagination;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import au.com.woolworths.feature.shop.bundles.BundlesRepository;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/pagination/BundlesPagingSource;", "Landroidx/paging/PagingSource;", "", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BundlesPagingSource extends PagingSource<Integer, Object> {
    public final BundlesRepository b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final Function1 g;
    public final Function1 h;

    public BundlesPagingSource(BundlesRepository bundlesRepository, String str, String str2, String str3, boolean z, Function1 function1, Function1 function12) {
        this.b = bundlesRepository;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = function1;
        this.h = function12;
    }

    @Override // androidx.paging.PagingSource
    public final Object b(PagingState pagingState) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(androidx.paging.PagingSource.LoadParams r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r11 instanceof au.com.woolworths.feature.shop.bundles.pagination.BundlesPagingSource$load$1
            if (r0 == 0) goto L14
            r0 = r11
            au.com.woolworths.feature.shop.bundles.pagination.BundlesPagingSource$load$1 r0 = (au.com.woolworths.feature.shop.bundles.pagination.BundlesPagingSource$load$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.r = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            au.com.woolworths.feature.shop.bundles.pagination.BundlesPagingSource$load$1 r0 = new au.com.woolworths.feature.shop.bundles.pagination.BundlesPagingSource$load$1
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r7.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.r
            kotlin.jvm.functions.Function1 r8 = r9.h
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.ResultKt.b(r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            goto L63
        L2b:
            r0 = move-exception
            r10 = r0
            goto L86
        L2e:
            r0 = move-exception
            r10 = r0
            goto L8f
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            kotlin.ResultKt.b(r11)
            java.lang.Object r10 = r10.getC()
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L49
            int r10 = r10.intValue()
            goto L4a
        L49:
            r10 = 0
        L4a:
            au.com.woolworths.feature.shop.bundles.BundlesRepository r1 = r9.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            r11 = r2
            java.lang.String r2 = r9.c     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            boolean r3 = r9.f     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            java.lang.String r4 = r9.d     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            java.lang.String r5 = r9.e     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            java.lang.Integer r6 = new java.lang.Integer     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            r6.<init>(r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            r7.r = r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            java.lang.Object r11 = r1.a(r2, r3, r4, r5, r6, r7)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            if (r11 != r0) goto L63
            return r0
        L63:
            au.com.woolworths.feature.shop.bundles.data.BundlesData r11 = (au.com.woolworths.feature.shop.bundles.data.BundlesData) r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            kotlin.jvm.functions.Function1 r10 = r9.g     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            r10.invoke(r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            boolean r10 = r11 instanceof au.com.woolworths.feature.shop.bundles.data.BundlesData.BundlesLandingPage     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            r0 = 0
            if (r10 == 0) goto L7e
            r10 = r11
            au.com.woolworths.feature.shop.bundles.data.BundlesData$BundlesLandingPage r10 = (au.com.woolworths.feature.shop.bundles.data.BundlesData.BundlesLandingPage) r10     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            java.lang.Integer r10 = r10.e     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            au.com.woolworths.feature.shop.bundles.data.BundlesData$BundlesLandingPage r11 = (au.com.woolworths.feature.shop.bundles.data.BundlesData.BundlesLandingPage) r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            java.util.List r11 = r11.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            androidx.paging.PagingSource$LoadResult$Page r1 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            r1.<init>(r11, r0, r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            return r1
        L7e:
            kotlin.collections.EmptyList r10 = kotlin.collections.EmptyList.d     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            androidx.paging.PagingSource$LoadResult$Page r11 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            r11.<init>(r10, r0, r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2e
            return r11
        L86:
            r8.invoke(r10)
            androidx.paging.PagingSource$LoadResult$Error r11 = new androidx.paging.PagingSource$LoadResult$Error
            r11.<init>(r10)
            goto L97
        L8f:
            r8.invoke(r10)
            androidx.paging.PagingSource$LoadResult$Error r11 = new androidx.paging.PagingSource$LoadResult$Error
            r11.<init>(r10)
        L97:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.bundles.pagination.BundlesPagingSource.d(androidx.paging.PagingSource$LoadParams, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
