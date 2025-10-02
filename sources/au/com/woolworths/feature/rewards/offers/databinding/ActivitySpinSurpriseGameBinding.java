package au.com.woolworths.feature.rewards.offers.databinding;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameViewModel;

/* loaded from: classes3.dex */
public abstract class ActivitySpinSurpriseGameBinding extends ViewDataBinding {
    public SpinSurpriseGameViewModel A;
    public final Toolbar y;
    public final WebView z;

    public ActivitySpinSurpriseGameBinding(DataBindingComponent dataBindingComponent, View view, Toolbar toolbar, WebView webView) {
        super(dataBindingComponent, view, 1);
        this.y = toolbar;
        this.z = webView;
    }

    public abstract void L(SpinSurpriseGameViewModel spinSurpriseGameViewModel);
}
