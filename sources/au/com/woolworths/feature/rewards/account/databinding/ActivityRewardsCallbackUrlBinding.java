package au.com.woolworths.feature.rewards.account.databinding;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlViewModel;
import au.com.woolworths.rewards.base.databinding.IncludeRewardsGenericErrorStateFullScreenBinding;

/* loaded from: classes3.dex */
public abstract class ActivityRewardsCallbackUrlBinding extends ViewDataBinding {
    public final WebView A;
    public RewardsCallbackUrlViewModel B;
    public final IncludeRewardsGenericErrorStateFullScreenBinding y;
    public final Toolbar z;

    public ActivityRewardsCallbackUrlBinding(DataBindingComponent dataBindingComponent, View view, IncludeRewardsGenericErrorStateFullScreenBinding includeRewardsGenericErrorStateFullScreenBinding, Toolbar toolbar, WebView webView) {
        super(dataBindingComponent, view, 2);
        this.y = includeRewardsGenericErrorStateFullScreenBinding;
        this.z = toolbar;
        this.A = webView;
    }

    public abstract void L(RewardsCallbackUrlViewModel rewardsCallbackUrlViewModel);
}
