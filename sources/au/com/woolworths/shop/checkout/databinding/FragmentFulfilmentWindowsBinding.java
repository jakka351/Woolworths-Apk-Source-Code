package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.shop.checkout.domain.model.DeliveryNowWindow;
import au.com.woolworths.shop.checkout.domain.model.DirectToBootNowWindow;
import au.com.woolworths.shop.checkout.ui.components.ItemCheckoutFulfilmentWindows;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowErrorState;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes4.dex */
public abstract class FragmentFulfilmentWindowsBinding extends ViewDataBinding {
    public static final /* synthetic */ int Q = 0;
    public final ComposeView A;
    public final ViewPager2 B;
    public final TabLayout C;
    public final IncludeCheckoutDeliveryNowBinding D;
    public final IncludeCheckoutDirectToBootNowBinding E;
    public final IncludeExtraInfoButtonBinding F;
    public final IncludeInsetBannerBinding G;
    public final View H;
    public String I;
    public Boolean J;
    public DeliveryNowWindow K;
    public DirectToBootNowWindow L;
    public FulfilmentWindowsSlotListener M;
    public InsetBanner N;
    public FulfilmentWindowsViewModel O;
    public FulfilmentWindowErrorState P;
    public final ItemCheckoutFulfilmentWindows y;
    public final IncludeGenericErrorStateBinding z;

    public FragmentFulfilmentWindowsBinding(DataBindingComponent dataBindingComponent, View view, ItemCheckoutFulfilmentWindows itemCheckoutFulfilmentWindows, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, ComposeView composeView, ViewPager2 viewPager2, TabLayout tabLayout, IncludeCheckoutDeliveryNowBinding includeCheckoutDeliveryNowBinding, IncludeCheckoutDirectToBootNowBinding includeCheckoutDirectToBootNowBinding, IncludeExtraInfoButtonBinding includeExtraInfoButtonBinding, IncludeInsetBannerBinding includeInsetBannerBinding, View view2) {
        super(dataBindingComponent, view, 5);
        this.y = itemCheckoutFulfilmentWindows;
        this.z = includeGenericErrorStateBinding;
        this.A = composeView;
        this.B = viewPager2;
        this.C = tabLayout;
        this.D = includeCheckoutDeliveryNowBinding;
        this.E = includeCheckoutDirectToBootNowBinding;
        this.F = includeExtraInfoButtonBinding;
        this.G = includeInsetBannerBinding;
        this.H = view2;
    }

    public abstract void L(DeliveryNowWindow deliveryNowWindow);

    public abstract void M(DirectToBootNowWindow directToBootNowWindow);

    public abstract void N(FulfilmentWindowErrorState fulfilmentWindowErrorState);

    public abstract void O(Boolean bool);

    public abstract void P(FulfilmentWindowsSlotListener fulfilmentWindowsSlotListener);

    public abstract void Q(String str);

    public abstract void R(FulfilmentWindowsViewModel fulfilmentWindowsViewModel);

    public abstract void S(InsetBanner insetBanner);
}
