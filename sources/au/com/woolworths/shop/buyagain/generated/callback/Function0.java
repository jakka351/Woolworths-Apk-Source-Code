package au.com.woolworths.shop.buyagain.generated.callback;

import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.databinding.EpoxyItemBuyAgainProductBindingImpl;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainProductItemListenerLegacy;

/* loaded from: classes4.dex */
public final class Function0 implements kotlin.jvm.functions.Function0 {
    public final EpoxyItemBuyAgainProductBindingImpl d;

    public interface Listener {
    }

    public Function0(EpoxyItemBuyAgainProductBindingImpl epoxyItemBuyAgainProductBindingImpl) {
        this.d = epoxyItemBuyAgainProductBindingImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EpoxyItemBuyAgainProductBindingImpl epoxyItemBuyAgainProductBindingImpl = this.d;
        BuyAgainProductItemListenerLegacy buyAgainProductItemListenerLegacy = epoxyItemBuyAgainProductBindingImpl.O;
        ProductCard productCard = epoxyItemBuyAgainProductBindingImpl.N;
        if (buyAgainProductItemListenerLegacy == null) {
            return null;
        }
        buyAgainProductItemListenerLegacy.t(productCard);
        return null;
    }
}
