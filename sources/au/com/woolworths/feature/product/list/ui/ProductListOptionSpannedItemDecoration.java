package au.com.woolworths.feature.product.list.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyControllerAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/ProductListOptionSpannedItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListOptionSpannedItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f5390a;
    public final Lazy b;

    public ProductListOptionSpannedItemDecoration(@NotNull Context context) {
        Intrinsics.h(context, "context");
        this.f5390a = LazyKt.b(new au.com.woolworths.feature.product.list.legacy.ui.a(context, 2));
        this.b = LazyKt.b(new au.com.woolworths.feature.product.list.legacy.ui.a(context, 3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void f(Rect outRect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.h(outRect, "outRect");
        Intrinsics.h(view, "view");
        Intrinsics.h(state, "state");
        int iN = RecyclerView.N(view);
        if (iN == -1) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.f(adapter, "null cannot be cast to non-null type com.airbnb.epoxy.EpoxyControllerAdapter");
        EpoxyControllerAdapter epoxyControllerAdapter = (EpoxyControllerAdapter) adapter;
        GridLayoutManager.SpanSizeLookup spanSizeLookup = epoxyControllerAdapter.k;
        int i = epoxyControllerAdapter.g;
        int iB = spanSizeLookup.b(iN, i);
        int iC = spanSizeLookup.c(iN);
        Lazy lazy = this.f5390a;
        Lazy lazy2 = this.b;
        int iIntValue = iC == i ? 0 : iB + iC == i ? ((Number) lazy2.getD()).intValue() : ((Number) lazy.getD()).intValue();
        int iIntValue2 = (iC == i || iB != 0) ? 0 : ((Number) lazy2.getD()).intValue();
        int iIntValue3 = iC != i ? ((Number) lazy.getD()).intValue() : 0;
        outRect.right = iIntValue;
        outRect.bottom = iIntValue3;
        outRect.left = iIntValue2;
    }
}
