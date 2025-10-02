package au.com.woolworths.shop.checkout.ui.epoxy.decorator;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.shop.checkout.ui.components.OrderTotalSectionEpoxyModel_;
import com.airbnb.epoxy.EpoxyControllerAdapter;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/epoxy/decorator/OrderTotalDetailsSpaceItemDecorator;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderTotalDetailsSpaceItemDecorator extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    public final int f10778a;

    public OrderTotalDetailsSpaceItemDecorator(@NotNull Context context) {
        Intrinsics.h(context, "context");
        this.f10778a = context.getResources().getDimensionPixelOffset(R.dimen.three_quarter_default_padding);
    }

    public static boolean i(EpoxyControllerAdapter epoxyControllerAdapter, int i) {
        if (i < 0 || i >= epoxyControllerAdapter.o) {
            epoxyControllerAdapter = null;
        }
        return (epoxyControllerAdapter != null ? epoxyControllerAdapter.S(i) : null) instanceof OrderTotalSectionEpoxyModel_;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void f(Rect outRect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.h(outRect, "outRect");
        Intrinsics.h(view, "view");
        Intrinsics.h(state, "state");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        EpoxyControllerAdapter epoxyControllerAdapter = adapter instanceof EpoxyControllerAdapter ? (EpoxyControllerAdapter) adapter : null;
        if (epoxyControllerAdapter != null) {
            int iN = RecyclerView.N(view);
            if (i(epoxyControllerAdapter, iN)) {
                boolean zI = i(epoxyControllerAdapter, iN - 1);
                int i = this.f10778a;
                if (!zI) {
                    outRect.top = i;
                }
                if (i(epoxyControllerAdapter, iN + 1)) {
                    return;
                }
                outRect.bottom = i;
            }
        }
    }
}
