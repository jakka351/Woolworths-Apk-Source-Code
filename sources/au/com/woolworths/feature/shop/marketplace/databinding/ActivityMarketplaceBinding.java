package au.com.woolworths.feature.shop.marketplace.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class ActivityMarketplaceBinding extends ViewDataBinding {
    public final FrameLayout y;
    public final Toolbar z;

    public ActivityMarketplaceBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout, Toolbar toolbar) {
        super(dataBindingComponent, view, 0);
        this.y = frameLayout;
        this.z = toolbar;
    }
}
