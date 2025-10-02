package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class ActivityEReceiptDetailsBinding extends ViewDataBinding {
    public final View A;
    public final ProgressBar B;
    public final EpoxyRecyclerView C;
    public final Toolbar D;
    public EReceiptDetailsViewModel E;
    public final CoordinatorLayout y;
    public final IncludeGenericErrorStateBinding z;

    public ActivityEReceiptDetailsBinding(DataBindingComponent dataBindingComponent, View view, CoordinatorLayout coordinatorLayout, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, View view2, ProgressBar progressBar, EpoxyRecyclerView epoxyRecyclerView, Toolbar toolbar) {
        super(dataBindingComponent, view, 2);
        this.y = coordinatorLayout;
        this.z = includeGenericErrorStateBinding;
        this.A = view2;
        this.B = progressBar;
        this.C = epoxyRecyclerView;
        this.D = toolbar;
    }

    public abstract void L(EReceiptDetailsViewModel eReceiptDetailsViewModel);
}
