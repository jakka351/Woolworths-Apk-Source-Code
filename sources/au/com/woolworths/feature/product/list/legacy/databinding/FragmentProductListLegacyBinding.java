package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeSearchableToolbarWrapperBinding;
import au.com.woolworths.feature.product.list.legacy.ProductListViewModel;
import au.com.woolworths.shop.lists.databinding.IncludeBoostAllBannerBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class FragmentProductListLegacyBinding extends ViewDataBinding {
    public final IncludeGenericErrorStateBinding A;
    public final LinearLayout B;
    public final IncludeProductListHeaderLegacyBinding C;
    public final EpoxyRecyclerView D;
    public final IncludeSearchableToolbarWrapperWithComposeLegacyBinding E;
    public final IncludeSearchableToolbarWrapperBinding F;
    public final ComposeView G;
    public ProductListViewModel H;
    public View.OnFocusChangeListener I;
    public final IncludeBoostAllBannerBinding y;
    public final ComposeView z;

    public FragmentProductListLegacyBinding(DataBindingComponent dataBindingComponent, View view, IncludeBoostAllBannerBinding includeBoostAllBannerBinding, ComposeView composeView, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, LinearLayout linearLayout, IncludeProductListHeaderLegacyBinding includeProductListHeaderLegacyBinding, EpoxyRecyclerView epoxyRecyclerView, IncludeSearchableToolbarWrapperWithComposeLegacyBinding includeSearchableToolbarWrapperWithComposeLegacyBinding, IncludeSearchableToolbarWrapperBinding includeSearchableToolbarWrapperBinding, ComposeView composeView2) {
        super(dataBindingComponent, view, 6);
        this.y = includeBoostAllBannerBinding;
        this.z = composeView;
        this.A = includeGenericErrorStateBinding;
        this.B = linearLayout;
        this.C = includeProductListHeaderLegacyBinding;
        this.D = epoxyRecyclerView;
        this.E = includeSearchableToolbarWrapperWithComposeLegacyBinding;
        this.F = includeSearchableToolbarWrapperBinding;
        this.G = composeView2;
    }

    public abstract void L(View.OnFocusChangeListener onFocusChangeListener);

    public abstract void M(ProductListViewModel productListViewModel);
}
