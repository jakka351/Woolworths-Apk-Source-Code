package au.com.woolworths.feature.product.list;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridSpanKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(ComposeProductListActivity composeProductListActivity, int i, int i2) {
        this.d = i2;
        this.e = composeProductListActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = ComposeProductListActivity.H;
                ((ComposeProductListActivity) obj3).P4((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 1:
                ((Integer) obj2).getClass();
                int i3 = ComposeProductListActivity.H;
                ((ComposeProductListActivity) obj3).O4((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            default:
                LazyGridItemSpanScope lazyGridItemSpanScope = (LazyGridItemSpanScope) obj;
                int iIntValue = ((Integer) obj2).intValue();
                float f = ProductListFragment.u;
                Intrinsics.h(lazyGridItemSpanScope, "<this>");
                return new GridItemSpan(ProductListFragment.A3(((LazyPagingItems) obj3).a(iIntValue)) ? LazyGridSpanKt.a(lazyGridItemSpanScope.a()) : LazyGridSpanKt.a(1));
        }
    }

    public /* synthetic */ a(ProductListFragment productListFragment, LazyPagingItems lazyPagingItems) {
        this.d = 2;
        this.e = lazyPagingItems;
    }
}
