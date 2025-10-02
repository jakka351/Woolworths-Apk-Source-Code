package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.ObservableWebView;

/* loaded from: classes3.dex */
public abstract class ActivityWebViewBinding extends ViewDataBinding {
    public final Toolbar A;
    public final Toolbar B;
    public boolean C;
    public final View y;
    public final ObservableWebView z;

    public ActivityWebViewBinding(DataBindingComponent dataBindingComponent, View view, View view2, ObservableWebView observableWebView, Toolbar toolbar, Toolbar toolbar2) {
        super(dataBindingComponent, view, 0);
        this.y = view2;
        this.z = observableWebView;
        this.A = toolbar;
        this.B = toolbar2;
    }

    public abstract void L(boolean z);
}
