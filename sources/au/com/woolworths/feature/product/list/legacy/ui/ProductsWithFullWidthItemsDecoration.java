package au.com.woolworths.feature.product.list.legacy.ui;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.feature.product.list.legacy.ProductListControllerKt;
import au.com.woolworths.product.ProductGridLayoutItemDecoration;
import com.airbnb.epoxy.EpoxyControllerAdapter;
import com.airbnb.epoxy.EpoxyModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ui/ProductsWithFullWidthItemsDecoration;", "Lau/com/woolworths/product/ProductGridLayoutItemDecoration;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsWithFullWidthItemsDecoration extends ProductGridLayoutItemDecoration {
    public final int e;

    public ProductsWithFullWidthItemsDecoration(Drawable drawable, int i) {
        super(drawable, i, 1);
        this.e = 1;
    }

    public static boolean m(int i, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.f(adapter, "null cannot be cast to non-null type com.airbnb.epoxy.EpoxyControllerAdapter");
        List listR = ((EpoxyControllerAdapter) adapter).R();
        Intrinsics.g(listR, "getCopyOfModels(...)");
        return i >= 0 && ProductListControllerKt.a((EpoxyModel) listR.get(i));
    }

    @Override // au.com.woolworths.product.ProductGridLayoutItemDecoration
    public final boolean k(int i, RecyclerView recyclerView) {
        return !m(i, recyclerView);
    }

    @Override // au.com.woolworths.product.ProductGridLayoutItemDecoration
    public final boolean l(int i, RecyclerView recyclerView) {
        if (!m(i, recyclerView)) {
            int i2 = i - 1;
            int i3 = i - this.e;
            if (i3 <= i2) {
                while (!m(i2, recyclerView)) {
                    if (i2 != i3) {
                        i2--;
                    }
                }
            }
            return i < this.c;
        }
        if (i != 0) {
            return false;
        }
        return true;
    }

    public ProductsWithFullWidthItemsDecoration(Drawable drawable, int i, int i2) {
        super(drawable, i, i2);
        this.e = i2;
    }
}
