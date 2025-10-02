package au.com.woolworths.shop.buyagain.ui.legacy.quantityselector;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.CoroutineLiveData;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductQuantityHelper;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorContract;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewListener;", "Companion", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BuyAgainQuantitySelectorViewModel extends ViewModel implements HorizontalSelectorViewListener {
    public final FeatureToggleManager e;
    public final SharedFlowImpl f;
    public final Flow g;
    public final MutableStateFlow h;
    public final CoroutineLiveData i;
    public ProductCard j;
    public float k;
    public float l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorViewModel$Companion;", "", "", "EMPTY_QUANTITY", "F", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public BuyAgainQuantitySelectorViewModel(FeatureToggleManager featureToggleManager) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = featureToggleManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.f = sharedFlowImplB;
        this.g = FlowKt.a(sharedFlowImplB);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new BuyAgainQuantitySelectorContract.ViewState(true, true));
        this.h = mutableStateFlowA;
        this.i = FlowLiveDataConversions.b(FlowKt.b(mutableStateFlowA), ViewModelKt.a(this).d, 2);
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final int f5() {
        if (this.k > q6().getDefault_()) {
            return p6(this.k);
        }
        return -1;
    }

    public final int p6(float f) {
        return ProductQuantityHelper.INSTANCE.getIndexFromQuantity(f, q6().getIncrement());
    }

    public final ProductShoppingList q6() {
        ProductCard productCard = this.j;
        if (productCard != null) {
            return productCard.getProductShoppingList();
        }
        Intrinsics.p("product");
        throw null;
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final void s4() {
        int iP6 = p6(this.l);
        int iP62 = p6(this.k);
        SharedFlowImpl sharedFlowImpl = this.f;
        if (iP6 == iP62) {
            ProductCard productCard = this.j;
            if (productCard != null) {
                sharedFlowImpl.f(new BuyAgainQuantitySelectorContract.Actions.Remove(productCard));
                return;
            } else {
                Intrinsics.p("product");
                throw null;
            }
        }
        ProductCard productCard2 = this.j;
        if (productCard2 != null) {
            sharedFlowImpl.f(new BuyAgainQuantitySelectorContract.Actions.Update(productCard2, this.l));
        } else {
            Intrinsics.p("product");
            throw null;
        }
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final int x4() {
        float f = this.k;
        float default_ = (float) q6().getDefault_();
        if (f < default_) {
            f = default_;
        }
        return p6(f);
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final String y1(int i, Context context) {
        Intrinsics.h(context, "context");
        return (i != p6(this.k) ? new ResWithArgText(R.string.buy_again_quantity_selector_accessibility_update_quantity, ProductQuantityHelper.INSTANCE.getQuantityLabel(i, q6().getIncrement(), q6().getUnitLabel())) : new ResText(R.string.buy_again_quantity_selector_accessibility_remove_quantity)).getText(context).toString();
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final void z2(int i) {
        float quantityFromIndex = (float) ProductQuantityHelper.INSTANCE.getQuantityFromIndex(i, q6().getIncrement());
        this.l = quantityFromIndex;
        boolean z = this.k == quantityFromIndex;
        MutableStateFlow mutableStateFlow = this.h;
        boolean z2 = ((BuyAgainQuantitySelectorContract.ViewState) mutableStateFlow.getValue()).b;
        ((BuyAgainQuantitySelectorContract.ViewState) mutableStateFlow.getValue()).getClass();
        mutableStateFlow.f(new BuyAgainQuantitySelectorContract.ViewState(!z, z2));
    }
}
