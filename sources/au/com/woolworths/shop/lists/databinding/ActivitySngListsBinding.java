package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes4.dex */
public abstract class ActivitySngListsBinding extends ViewDataBinding {
    public final ProgressBar A;
    public final Toolbar B;
    public Boolean C;
    public final FrameLayout y;
    public final View z;

    public ActivitySngListsBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout, View view2, ProgressBar progressBar, Toolbar toolbar) {
        super(dataBindingComponent, view, 0);
        this.y = frameLayout;
        this.z = view2;
        this.A = progressBar;
        this.B = toolbar;
    }

    public abstract void L(Boolean bool);
}
