package au.com.woolworths.feature.shop.storelocator.legacy.databinding;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultViewModel;

/* loaded from: classes3.dex */
public abstract class ActivityPickUpLocationResultBinding extends ViewDataBinding {
    public final ProgressBar A;
    public final Toolbar B;
    public PickUpLocationResultViewModel C;
    public final IncludeGenericErrorStateBinding y;
    public final RecyclerView z;

    public ActivityPickUpLocationResultBinding(View view, ProgressBar progressBar, Toolbar toolbar, DataBindingComponent dataBindingComponent, RecyclerView recyclerView, IncludeGenericErrorStateBinding includeGenericErrorStateBinding) {
        super(dataBindingComponent, view, 2);
        this.y = includeGenericErrorStateBinding;
        this.z = recyclerView;
        this.A = progressBar;
        this.B = toolbar;
    }

    public abstract void L(PickUpLocationResultViewModel pickUpLocationResultViewModel);
}
