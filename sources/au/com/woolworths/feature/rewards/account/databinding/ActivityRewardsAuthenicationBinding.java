package au.com.woolworths.feature.rewards.account.databinding;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModel;

/* loaded from: classes3.dex */
public abstract class ActivityRewardsAuthenicationBinding extends ViewDataBinding {
    public final Toolbar A;
    public final WebView B;
    public RewardsAuthenticationViewModel C;
    public final ContentLoadingProgressBar y;
    public final IncludeGenericErrorStateBinding z;

    public ActivityRewardsAuthenicationBinding(DataBindingComponent dataBindingComponent, View view, ContentLoadingProgressBar contentLoadingProgressBar, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, Toolbar toolbar, WebView webView) {
        super(dataBindingComponent, view, 2);
        this.y = contentLoadingProgressBar;
        this.z = includeGenericErrorStateBinding;
        this.A = toolbar;
        this.B = webView;
    }

    public abstract void L(RewardsAuthenticationViewModel rewardsAuthenticationViewModel);
}
