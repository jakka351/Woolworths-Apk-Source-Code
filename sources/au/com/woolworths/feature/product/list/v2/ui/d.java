package au.com.woolworths.feature.product.list.v2.ui;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import au.com.woolworths.feature.product.list.v2.ProductListUiEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ d(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
                Intrinsics.h(LazyVerticalGrid, "$this$LazyVerticalGrid");
                LazyGridScope.h(LazyVerticalGrid, 6, null, null, null, new ComposableLambdaImpl(new ProductListSkeletonUiKt$ProductListSkeletonUiDisplayGrid$1$1$1(), true, 1143209828), 14);
                return Unit.f24250a;
            case 1:
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                LazyListScope.g(LazyColumn, 6, null, new ComposableLambdaImpl(new ProductListSkeletonUiKt$ProductListSkeletonUiDisplayList$1$1$1(), true, 1040837029), 6);
                return Unit.f24250a;
            case 2:
                ProductListUiEvent it = (ProductListUiEvent) obj;
                Intrinsics.h(it, "it");
                return Unit.f24250a;
            case 3:
                ProductListUiEvent it2 = (ProductListUiEvent) obj;
                Intrinsics.h(it2, "it");
                return Unit.f24250a;
            case 4:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 5:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 6:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 7:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 8:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 9:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 10:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            case 11:
                return new GridItemSpan(au.com.woolworths.dynamic.page.ui.content.d.e((LazyGridItemSpanScope) obj, "$this$item"));
            default:
                ProductListUiEvent it3 = (ProductListUiEvent) obj;
                Intrinsics.h(it3, "it");
                return Unit.f24250a;
        }
    }
}
