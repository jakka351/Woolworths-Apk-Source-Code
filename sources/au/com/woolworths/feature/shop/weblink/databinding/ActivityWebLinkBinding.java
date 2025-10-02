package au.com.woolworths.feature.shop.weblink.databinding;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.weblink.WebLinkViewModel;

/* loaded from: classes3.dex */
public abstract class ActivityWebLinkBinding extends ViewDataBinding {
    public final WebView A;
    public WebLinkViewModel B;
    public final IncludeGenericErrorStateBinding y;
    public final Toolbar z;

    public ActivityWebLinkBinding(DataBindingComponent dataBindingComponent, View view, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, Toolbar toolbar, WebView webView) {
        super(dataBindingComponent, view, 2);
        this.y = includeGenericErrorStateBinding;
        this.z = toolbar;
        this.A = webView;
    }

    public abstract void L(WebLinkViewModel webLinkViewModel);
}
