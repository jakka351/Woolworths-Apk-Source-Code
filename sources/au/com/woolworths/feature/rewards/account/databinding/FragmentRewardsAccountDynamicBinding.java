package au.com.woolworths.feature.rewards.account.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsContractOld;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsViewModelOld;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class FragmentRewardsAccountDynamicBinding extends ViewDataBinding {
    public static final /* synthetic */ int E = 0;
    public final SwipeRefreshLayout A;
    public final Toolbar B;
    public AccountSettingsViewModelOld C;
    public AccountSettingsContractOld.ViewState D;
    public final CoordinatorLayout y;
    public final EpoxyRecyclerView z;

    public FragmentRewardsAccountDynamicBinding(DataBindingComponent dataBindingComponent, View view, CoordinatorLayout coordinatorLayout, EpoxyRecyclerView epoxyRecyclerView, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar) {
        super(dataBindingComponent, view, 0);
        this.y = coordinatorLayout;
        this.z = epoxyRecyclerView;
        this.A = swipeRefreshLayout;
        this.B = toolbar;
    }

    public abstract void L(AccountSettingsViewModelOld accountSettingsViewModelOld);

    public abstract void M(AccountSettingsContractOld.ViewState viewState);
}
