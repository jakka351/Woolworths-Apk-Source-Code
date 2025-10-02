package au.com.woolworths.feature.shop.ask.olive.databinding;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel;

/* loaded from: classes3.dex */
public abstract class ActivityChatWithOliveBinding extends ViewDataBinding {
    public final WebView A;
    public AskOliveViewModel B;
    public final IncludeGenericErrorStateBinding y;
    public final Toolbar z;

    public ActivityChatWithOliveBinding(DataBindingComponent dataBindingComponent, View view, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, Toolbar toolbar, WebView webView) {
        super(dataBindingComponent, view, 2);
        this.y = includeGenericErrorStateBinding;
        this.z = toolbar;
        this.A = webView;
    }

    public abstract void L(AskOliveViewModel askOliveViewModel);
}
