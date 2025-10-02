package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.main.MainViewModel;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentWindowContainer;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes3.dex */
public abstract class IncludeShoppingModeFulfilmentNoWindowBinding extends ViewDataBinding {
    public final EpoxyItemButtonBinding A;
    public final EpoxyItemButtonBinding B;
    public FulfilmentWindowContainer C;
    public ButtonClickHandler D;
    public MainViewModel E;
    public final LottieAnimationView y;
    public final IncludeShoppingModeDnBannerBinding z;

    public IncludeShoppingModeFulfilmentNoWindowBinding(DataBindingComponent dataBindingComponent, View view, LottieAnimationView lottieAnimationView, IncludeShoppingModeDnBannerBinding includeShoppingModeDnBannerBinding, EpoxyItemButtonBinding epoxyItemButtonBinding, EpoxyItemButtonBinding epoxyItemButtonBinding2) {
        super(dataBindingComponent, view, 3);
        this.y = lottieAnimationView;
        this.z = includeShoppingModeDnBannerBinding;
        this.A = epoxyItemButtonBinding;
        this.B = epoxyItemButtonBinding2;
    }
}
