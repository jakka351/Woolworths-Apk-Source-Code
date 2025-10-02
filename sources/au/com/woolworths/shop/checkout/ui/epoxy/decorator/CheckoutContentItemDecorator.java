package au.com.woolworths.shop.checkout.ui.epoxy.decorator;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.modules.customviews.itemdividers.DefaultDividerItemDecoration;
import au.com.woolworths.shop.checkout.ItemCheckoutOrderAddressMarketSellerBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutProductMessageBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutSectionTitleBindingModel_;
import au.com.woolworths.shop.checkout.ui.components.OrderTotalSectionEpoxyModel_;
import au.com.woolworths.shop.checkout.ui.components.SectionDividerEpoxyModel;
import com.airbnb.epoxy.EpoxyControllerAdapter;
import com.airbnb.epoxy.EpoxyModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/epoxy/decorator/CheckoutContentItemDecorator;", "Lau/com/woolworths/android/onesite/modules/customviews/itemdividers/DefaultDividerItemDecoration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutContentItemDecorator extends DefaultDividerItemDecoration {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutContentItemDecorator(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.itemdividers.DefaultDividerItemDecoration
    public final boolean i(View child, RecyclerView recyclerView) {
        int i;
        Intrinsics.h(child, "child");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return false;
        }
        EpoxyControllerAdapter epoxyControllerAdapter = (EpoxyControllerAdapter) adapter;
        int iN = RecyclerView.N(child);
        if (iN < 0 || (i = iN + 1) >= epoxyControllerAdapter.o) {
            return false;
        }
        EpoxyModel epoxyModelS = epoxyControllerAdapter.S(iN);
        Intrinsics.g(epoxyModelS, "getModelAtPosition(...)");
        EpoxyModel epoxyModelS2 = epoxyControllerAdapter.S(i);
        Intrinsics.g(epoxyModelS2, "getModelAtPosition(...)");
        if (epoxyModelS instanceof ItemCheckoutSectionTitleBindingModel_) {
            return true;
        }
        return ((epoxyModelS2 instanceof ItemCheckoutOrderAddressMarketSellerBindingModel_) || (epoxyModelS2 instanceof SectionDividerEpoxyModel) || (epoxyModelS2 instanceof OrderTotalSectionEpoxyModel_) || (epoxyModelS2 instanceof ItemCheckoutProductMessageBindingModel_)) ? false : true;
    }
}
