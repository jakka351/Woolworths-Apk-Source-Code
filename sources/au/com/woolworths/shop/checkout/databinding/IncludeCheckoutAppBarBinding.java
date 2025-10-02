package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes4.dex */
public abstract class IncludeCheckoutAppBarBinding extends ViewDataBinding {
    public final Toolbar A;
    public final AppBarLayout y;
    public final ComposeView z;

    public IncludeCheckoutAppBarBinding(DataBindingComponent dataBindingComponent, View view, AppBarLayout appBarLayout, ComposeView composeView, Toolbar toolbar) {
        super(dataBindingComponent, view, 0);
        this.y = appBarLayout;
        this.z = composeView;
        this.A = toolbar;
    }
}
