package au.com.woolworths.feature.shop.foryou.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInlineMessageBinding;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.feature.shop.foryou.RewardsBoostersViewModelLegacy;
import au.com.woolworths.rewards.base.CustomCollapsingToolbarLayout;

/* loaded from: classes3.dex */
public abstract class FragmentRewardsBoostersBinding extends ViewDataBinding {
    public static final /* synthetic */ int E = 0;
    public final CustomCollapsingToolbarLayout A;
    public final Toolbar B;
    public RewardsBoostersViewModelLegacy C;
    public InlineMessage D;
    public final IncludeInlineMessageBinding y;
    public final CoordinatorLayout z;

    public FragmentRewardsBoostersBinding(DataBindingComponent dataBindingComponent, View view, IncludeInlineMessageBinding includeInlineMessageBinding, CoordinatorLayout coordinatorLayout, CustomCollapsingToolbarLayout customCollapsingToolbarLayout, Toolbar toolbar) {
        super(dataBindingComponent, view, 2);
        this.y = includeInlineMessageBinding;
        this.z = coordinatorLayout;
        this.A = customCollapsingToolbarLayout;
        this.B = toolbar;
    }

    public abstract void L(InlineMessage inlineMessage);

    public abstract void M(RewardsBoostersViewModelLegacy rewardsBoostersViewModelLegacy);
}
