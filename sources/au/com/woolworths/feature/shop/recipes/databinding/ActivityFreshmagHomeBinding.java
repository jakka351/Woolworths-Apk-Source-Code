package au.com.woolworths.feature.shop.recipes.databinding;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeContract;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeErrorState;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class ActivityFreshmagHomeBinding extends ViewDataBinding {
    public final EpoxyRecyclerView A;
    public final Toolbar B;
    public FreshMagHomeContract.PageState C;
    public FreshMagHomeErrorState D;
    public final IncludeGenericErrorStateBinding y;
    public final ProgressBar z;

    public ActivityFreshmagHomeBinding(DataBindingComponent dataBindingComponent, View view, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, ProgressBar progressBar, EpoxyRecyclerView epoxyRecyclerView, Toolbar toolbar) {
        super(dataBindingComponent, view, 1);
        this.y = includeGenericErrorStateBinding;
        this.z = progressBar;
        this.A = epoxyRecyclerView;
        this.B = toolbar;
    }

    public abstract void L(FreshMagHomeErrorState freshMagHomeErrorState);

    public abstract void M(FreshMagHomeContract.PageState pageState);
}
