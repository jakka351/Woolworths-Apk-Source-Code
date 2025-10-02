package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class ActivityProgressStepperInfoBinding extends ViewDataBinding {
    public final EpoxyRecyclerView y;
    public final Toolbar z;

    public ActivityProgressStepperInfoBinding(DataBindingComponent dataBindingComponent, View view, EpoxyRecyclerView epoxyRecyclerView, Toolbar toolbar) {
        super(dataBindingComponent, view, 0);
        this.y = epoxyRecyclerView;
        this.z = toolbar;
    }
}
