package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.shop.lists.ui.pastshops.PastShopsViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes4.dex */
public abstract class ActivityPastShopsBinding extends ViewDataBinding {
    public final IncludeGenericErrorStateBinding A;
    public final EpoxyRecyclerView B;
    public final SwipeRefreshLayout C;
    public final Toolbar D;
    public PastShopsViewModel E;
    public final ConstraintLayout y;
    public final CoordinatorLayout z;

    public ActivityPastShopsBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, EpoxyRecyclerView epoxyRecyclerView, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar) {
        super(dataBindingComponent, view, 2);
        this.y = constraintLayout;
        this.z = coordinatorLayout;
        this.A = includeGenericErrorStateBinding;
        this.B = epoxyRecyclerView;
        this.C = swipeRefreshLayout;
        this.D = toolbar;
    }

    public abstract void L(PastShopsViewModel pastShopsViewModel);
}
