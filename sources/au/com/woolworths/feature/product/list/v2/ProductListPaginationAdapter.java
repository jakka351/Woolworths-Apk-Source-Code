package au.com.woolworths.feature.product.list.v2;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListPaginationAdapter;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListPaginationAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final ProductListInteractorImpl f5402a;
    public final RepositoryManager b;
    public Integer c;
    public final LinkedHashMap d;

    public ProductListPaginationAdapter(ProductListInteractorImpl productListInteractorImpl, RepositoryManager repositoryManager) {
        Intrinsics.h(repositoryManager, "repositoryManager");
        this.f5402a = productListInteractorImpl;
        this.b = repositoryManager;
        this.d = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Integer r11, au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r12, java.util.List r13, au.com.woolworths.feature.product.list.v2.a r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Exception {
        /*
            r10 = this;
            java.util.LinkedHashMap r0 = r10.d
            boolean r1 = r15 instanceof au.com.woolworths.feature.product.list.v2.ProductListPaginationAdapter$load$1
            if (r1 == 0) goto L16
            r1 = r15
            au.com.woolworths.feature.product.list.v2.ProductListPaginationAdapter$load$1 r1 = (au.com.woolworths.feature.product.list.v2.ProductListPaginationAdapter$load$1) r1
            int r2 = r1.t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.t = r2
        L14:
            r9 = r1
            goto L1c
        L16:
            au.com.woolworths.feature.product.list.v2.ProductListPaginationAdapter$load$1 r1 = new au.com.woolworths.feature.product.list.v2.ProductListPaginationAdapter$load$1
            r1.<init>(r10, r15)
            goto L14
        L1c:
            java.lang.Object r15 = r9.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r9.t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            au.com.woolworths.feature.product.list.v2.a r14 = r9.q
            java.lang.Integer r11 = r9.p
            kotlin.ResultKt.b(r15)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            goto L6d
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            kotlin.ResultKt.b(r15)
            au.com.woolworths.android.onesite.navigation.Activities$ProductList$ExtraProductListSource r12 = r12.e     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            boolean r15 = r12 instanceof au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtrasBySearch     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            if (r15 == 0) goto L69
            au.com.woolworths.feature.product.list.v2.ProductListInteractorImpl r15 = r10.f5402a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            r2 = r12
            au.com.woolworths.android.onesite.navigation.Activities$ProductList$ExtrasBySearch r2 = (au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtrasBySearch) r2     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            java.lang.String r4 = r2.getD()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            au.com.woolworths.android.onesite.navigation.Activities$ProductList$ExtrasBySearch r12 = (au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtrasBySearch) r12     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            java.lang.String r12 = r12.e     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            java.util.Map r8 = kotlin.collections.MapsKt.d()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            au.com.woolworths.foundation.shop.collectionmode.RepositoryManager r2 = r10.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            java.lang.String r7 = r2.f()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            r9.p = r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            r9.q = r14     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            r9.t = r3     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            au.com.woolworths.feature.product.list.v2.ProductListRepository r2 = r15.f5401a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            r5 = r11
            r3 = r12
            r6 = r13
            java.lang.Object r15 = r2.a(r3, r4, r5, r6, r7, r8, r9)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            if (r15 != r1) goto L6c
            return r1
        L69:
            r5 = r11
            kotlin.Unit r15 = kotlin.Unit.f24250a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
        L6c:
            r11 = r5
        L6d:
            java.lang.String r12 = "null cannot be cast to non-null type au.com.woolworths.feature.product.list.v2.data.ProductListData"
            kotlin.jvm.internal.Intrinsics.f(r15, r12)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            au.com.woolworths.feature.product.list.v2.data.ProductListData r15 = (au.com.woolworths.feature.product.list.v2.data.ProductListData) r15     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            java.lang.Integer r12 = r15.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            java.lang.Integer r13 = r10.c     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            r0.put(r12, r13)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            r10.c = r12     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            r14.invoke(r15)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            java.util.List r13 = r15.e     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            if (r11 != 0) goto L95
            boolean r14 = r13.isEmpty()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            if (r14 == 0) goto L95
            androidx.paging.PagingSource$LoadResult$Error r11 = new androidx.paging.PagingSource$LoadResult$Error     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            au.com.woolworths.android.onesite.network.ServerErrorException r12 = new au.com.woolworths.android.onesite.network.ServerErrorException     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            r12.<init>()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            r11.<init>(r12)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            return r11
        L95:
            java.lang.Object r11 = r0.get(r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            androidx.paging.PagingSource$LoadResult$Page r14 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            r14.<init>(r13, r11, r12)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> La1 au.com.woolworths.android.onesite.network.NoConnectivityException -> Lac
            return r14
        La1:
            androidx.paging.PagingSource$LoadResult$Error r11 = new androidx.paging.PagingSource$LoadResult$Error
            au.com.woolworths.android.onesite.network.ServerErrorException r12 = new au.com.woolworths.android.onesite.network.ServerErrorException
            r12.<init>()
            r11.<init>(r12)
            goto Lb6
        Lac:
            androidx.paging.PagingSource$LoadResult$Error r11 = new androidx.paging.PagingSource$LoadResult$Error
            au.com.woolworths.android.onesite.network.NoConnectivityException r12 = new au.com.woolworths.android.onesite.network.NoConnectivityException
            r12.<init>()
            r11.<init>(r12)
        Lb6:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.v2.ProductListPaginationAdapter.a(java.lang.Integer, au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.util.List, au.com.woolworths.feature.product.list.v2.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
