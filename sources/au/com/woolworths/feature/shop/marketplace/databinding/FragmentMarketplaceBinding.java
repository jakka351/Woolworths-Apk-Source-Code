package au.com.woolworths.feature.shop.marketplace.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public abstract class FragmentMarketplaceBinding extends ViewDataBinding {
    public static final /* synthetic */ int E = 0;
    public final ViewPager2 A;
    public Boolean B;
    public FullPageErrorStateClickHandler C;
    public MarketplaceErrorState D;
    public final IncludeGenericErrorStateBinding y;
    public final TabLayout z;

    public FragmentMarketplaceBinding(DataBindingComponent dataBindingComponent, View view, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, TabLayout tabLayout, ViewPager2 viewPager2) {
        super(dataBindingComponent, view, 1);
        this.y = includeGenericErrorStateBinding;
        this.z = tabLayout;
        this.A = viewPager2;
    }

    public abstract void L(FullPageErrorStateClickHandler fullPageErrorStateClickHandler);

    public abstract void M(MarketplaceErrorState marketplaceErrorState);

    public abstract void N(Boolean bool);
}
