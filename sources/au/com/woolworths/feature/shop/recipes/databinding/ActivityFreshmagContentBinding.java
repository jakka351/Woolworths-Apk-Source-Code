package au.com.woolworths.feature.shop.recipes.databinding;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentContract;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentErrorState;

/* loaded from: classes3.dex */
public abstract class ActivityFreshmagContentBinding extends ViewDataBinding {
    public final AppCompatSeekBar A;
    public final ViewPager B;
    public final ProgressBar C;
    public final Toolbar D;
    public FreshMagContentViewModel E;
    public FreshMagContentErrorState F;
    public FreshMagContentContract.FreshMagContent G;
    public FreshMagContentContract.PageState H;
    public final IncludeGenericErrorStateBinding y;
    public final TextView z;

    public ActivityFreshmagContentBinding(DataBindingComponent dataBindingComponent, View view, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, TextView textView, AppCompatSeekBar appCompatSeekBar, ViewPager viewPager, ProgressBar progressBar, Toolbar toolbar) {
        super(dataBindingComponent, view, 1);
        this.y = includeGenericErrorStateBinding;
        this.z = textView;
        this.A = appCompatSeekBar;
        this.B = viewPager;
        this.C = progressBar;
        this.D = toolbar;
    }

    public abstract void L(FreshMagContentErrorState freshMagContentErrorState);

    public abstract void M(FreshMagContentContract.FreshMagContent freshMagContent);

    public abstract void N(FreshMagContentContract.PageState pageState);

    public abstract void O(FreshMagContentViewModel freshMagContentViewModel);
}
