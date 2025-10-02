package au.com.woolworths.feature.shop.foryou.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class ActivityRewardsSettingsBinding extends ViewDataBinding {
    public final Toolbar A;
    public RewardsSettingsViewModel B;
    public final View y;
    public final EpoxyRecyclerView z;

    public ActivityRewardsSettingsBinding(DataBindingComponent dataBindingComponent, View view, View view2, EpoxyRecyclerView epoxyRecyclerView, Toolbar toolbar) {
        super(dataBindingComponent, view, 1);
        this.y = view2;
        this.z = epoxyRecyclerView;
        this.A = toolbar;
    }

    public abstract void L(RewardsSettingsViewModel rewardsSettingsViewModel);
}
