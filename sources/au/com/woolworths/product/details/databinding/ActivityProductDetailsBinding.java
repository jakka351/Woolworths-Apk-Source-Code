package au.com.woolworths.product.details.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.ProductDetailsViewModel;
import au.com.woolworths.product.ui.ProductCardButtonType;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes4.dex */
public abstract class ActivityProductDetailsBinding extends ViewDataBinding {
    public final EpoxyRecyclerView A;
    public final CoordinatorLayout B;
    public final IncludeGenericErrorStateBinding C;
    public final Toolbar D;
    public ProductDetailsViewModel E;
    public ProductDetailsClickHandler F;
    public CollectionMode G;
    public ProductCardButtonType H;
    public final IncludeProductDetailsBottomActionLayoutBinding y;
    public final IncludeProductDetailsBottomButtonsLayoutBinding z;

    public ActivityProductDetailsBinding(DataBindingComponent dataBindingComponent, View view, IncludeProductDetailsBottomActionLayoutBinding includeProductDetailsBottomActionLayoutBinding, IncludeProductDetailsBottomButtonsLayoutBinding includeProductDetailsBottomButtonsLayoutBinding, EpoxyRecyclerView epoxyRecyclerView, CoordinatorLayout coordinatorLayout, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, Toolbar toolbar) {
        super(dataBindingComponent, view, 4);
        this.y = includeProductDetailsBottomActionLayoutBinding;
        this.z = includeProductDetailsBottomButtonsLayoutBinding;
        this.A = epoxyRecyclerView;
        this.B = coordinatorLayout;
        this.C = includeGenericErrorStateBinding;
        this.D = toolbar;
    }

    public abstract void L(ProductDetailsClickHandler productDetailsClickHandler);

    public abstract void M(CollectionMode collectionMode);

    public abstract void N(ProductCardButtonType productCardButtonType);

    public abstract void O(ProductDetailsViewModel productDetailsViewModel);
}
