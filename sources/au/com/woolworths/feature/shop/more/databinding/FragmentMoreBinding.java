package au.com.woolworths.feature.shop.more.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.more.MoreViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class FragmentMoreBinding extends ViewDataBinding {
    public MoreViewModel A;
    public final View y;
    public final EpoxyRecyclerView z;

    public FragmentMoreBinding(DataBindingComponent dataBindingComponent, View view, View view2, EpoxyRecyclerView epoxyRecyclerView) {
        super(dataBindingComponent, view, 1);
        this.y = view2;
        this.z = epoxyRecyclerView;
    }

    public abstract void L(MoreViewModel moreViewModel);
}
