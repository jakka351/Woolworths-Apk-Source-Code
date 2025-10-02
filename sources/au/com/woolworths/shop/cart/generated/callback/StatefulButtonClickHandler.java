package au.com.woolworths.shop.cart.generated.callback;

import android.view.View;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.product.addtocart.AddToCartViewModel;
import au.com.woolworths.shop.cart.databinding.FragmentAddToCartBindingImpl;

/* loaded from: classes4.dex */
public final class StatefulButtonClickHandler implements au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler {
    public final FragmentAddToCartBindingImpl d;
    public final int e;

    public interface Listener {
    }

    public StatefulButtonClickHandler(FragmentAddToCartBindingImpl fragmentAddToCartBindingImpl, int i) {
        this.d = fragmentAddToCartBindingImpl;
        this.e = i;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler
    public final void T2(View view, StatefulButtonState statefulButtonState) {
        AddToCartViewModel addToCartViewModel;
        FragmentAddToCartBindingImpl fragmentAddToCartBindingImpl = this.d;
        int i = this.e;
        if (i == 1) {
            AddToCartViewModel addToCartViewModel2 = fragmentAddToCartBindingImpl.F;
            if (addToCartViewModel2 != null) {
                addToCartViewModel2.r6();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (addToCartViewModel = fragmentAddToCartBindingImpl.F) != null) {
                addToCartViewModel.u6();
                return;
            }
            return;
        }
        AddToCartViewModel addToCartViewModel3 = fragmentAddToCartBindingImpl.F;
        if (addToCartViewModel3 != null) {
            addToCartViewModel3.x6();
        }
    }
}
