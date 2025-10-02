package au.com.woolworths.product.details.generated.callback;

import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.databinding.EpoxyItemProductHeadingBindingImpl;
import au.com.woolworths.product.models.ProductCard;

/* loaded from: classes4.dex */
public final class Function0 implements kotlin.jvm.functions.Function0 {
    public final EpoxyItemProductHeadingBindingImpl d;

    public interface Listener {
    }

    public Function0(EpoxyItemProductHeadingBindingImpl epoxyItemProductHeadingBindingImpl) {
        this.d = epoxyItemProductHeadingBindingImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EpoxyItemProductHeadingBindingImpl epoxyItemProductHeadingBindingImpl = this.d;
        ProductDetailsClickHandler productDetailsClickHandler = epoxyItemProductHeadingBindingImpl.I;
        ProductCard productCard = epoxyItemProductHeadingBindingImpl.H;
        if (productDetailsClickHandler == null) {
            return null;
        }
        productDetailsClickHandler.t(productCard);
        return null;
    }
}
