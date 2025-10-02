package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes3.dex */
public abstract class ActivityRewardsChooserMoreBinding extends ViewDataBinding {
    public static final /* synthetic */ int B = 0;
    public final FrameLayout A;
    public final IncludeRewardsToolbarBinding y;
    public final AppBarLayout z;

    public ActivityRewardsChooserMoreBinding(DataBindingComponent dataBindingComponent, View view, IncludeRewardsToolbarBinding includeRewardsToolbarBinding, AppBarLayout appBarLayout, FrameLayout frameLayout) {
        super(dataBindingComponent, view, 1);
        this.y = includeRewardsToolbarBinding;
        this.z = appBarLayout;
        this.A = frameLayout;
    }
}
