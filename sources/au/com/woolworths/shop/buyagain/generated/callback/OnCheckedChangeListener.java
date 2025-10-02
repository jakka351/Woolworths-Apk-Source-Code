package au.com.woolworths.shop.buyagain.generated.callback;

import android.widget.CompoundButton;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.databinding.EpoxyItemBuyAgainProductBindingImpl;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainProductItemListenerLegacy;

/* loaded from: classes4.dex */
public final class OnCheckedChangeListener implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final EpoxyItemBuyAgainProductBindingImpl f10260a;

    public interface Listener {
    }

    public OnCheckedChangeListener(EpoxyItemBuyAgainProductBindingImpl epoxyItemBuyAgainProductBindingImpl) {
        this.f10260a = epoxyItemBuyAgainProductBindingImpl;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        EpoxyItemBuyAgainProductBindingImpl epoxyItemBuyAgainProductBindingImpl = this.f10260a;
        BuyAgainProductItemListenerLegacy buyAgainProductItemListenerLegacy = epoxyItemBuyAgainProductBindingImpl.O;
        ProductCard productCard = epoxyItemBuyAgainProductBindingImpl.N;
        if (buyAgainProductItemListenerLegacy != null) {
            buyAgainProductItemListenerLegacy.i0(productCard, z);
        }
    }
}
