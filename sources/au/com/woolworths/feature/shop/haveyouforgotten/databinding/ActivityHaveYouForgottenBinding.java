package au.com.woolworths.feature.shop.haveyouforgotten.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class ActivityHaveYouForgottenBinding extends ViewDataBinding {
    public final View A;
    public final Toolbar B;
    public final ComposeView y;
    public final FrameLayout z;

    public ActivityHaveYouForgottenBinding(DataBindingComponent dataBindingComponent, View view, ComposeView composeView, FrameLayout frameLayout, View view2, Toolbar toolbar) {
        super(dataBindingComponent, view, 0);
        this.y = composeView;
        this.z = frameLayout;
        this.A = view2;
        this.B = toolbar;
    }
}
