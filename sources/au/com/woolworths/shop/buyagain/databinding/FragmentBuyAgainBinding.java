package au.com.woolworths.shop.buyagain.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy;
import au.com.woolworths.shop.buyagain.ui.legacy.footer.BuyAgainFooterView;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes4.dex */
public abstract class FragmentBuyAgainBinding extends ViewDataBinding {
    public final BuyAgainFooterView A;
    public final EpoxyRecyclerView B;
    public final Toolbar C;
    public BuyAgainViewModelLegacy D;
    public final LayoutBuyAgainHeaderBinding y;
    public final IncludeGenericErrorStateBinding z;

    public FragmentBuyAgainBinding(DataBindingComponent dataBindingComponent, View view, LayoutBuyAgainHeaderBinding layoutBuyAgainHeaderBinding, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, BuyAgainFooterView buyAgainFooterView, EpoxyRecyclerView epoxyRecyclerView, Toolbar toolbar) {
        super(dataBindingComponent, view, 3);
        this.y = layoutBuyAgainHeaderBinding;
        this.z = includeGenericErrorStateBinding;
        this.A = buyAgainFooterView;
        this.B = epoxyRecyclerView;
        this.C = toolbar;
    }

    public abstract void L(BuyAgainViewModelLegacy buyAgainViewModelLegacy);
}
