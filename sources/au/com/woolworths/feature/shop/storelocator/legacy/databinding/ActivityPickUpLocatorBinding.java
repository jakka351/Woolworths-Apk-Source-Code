package au.com.woolworths.feature.shop.storelocator.legacy.databinding;

import android.view.View;
import android.widget.ProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeSearchableToolbarWrapperBinding;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorViewModel;

/* loaded from: classes3.dex */
public abstract class ActivityPickUpLocatorBinding extends ViewDataBinding {
    public final ProgressBar A;
    public final IncludeSearchableToolbarWrapperBinding B;
    public PickUpLocatorViewModel C;
    public final IncludeGenericErrorStateBinding y;
    public final RecyclerView z;

    public ActivityPickUpLocatorBinding(View view, ProgressBar progressBar, DataBindingComponent dataBindingComponent, RecyclerView recyclerView, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, IncludeSearchableToolbarWrapperBinding includeSearchableToolbarWrapperBinding) {
        super(dataBindingComponent, view, 3);
        this.y = includeGenericErrorStateBinding;
        this.z = recyclerView;
        this.A = progressBar;
        this.B = includeSearchableToolbarWrapperBinding;
    }

    public abstract void L(PickUpLocatorViewModel pickUpLocatorViewModel);
}
