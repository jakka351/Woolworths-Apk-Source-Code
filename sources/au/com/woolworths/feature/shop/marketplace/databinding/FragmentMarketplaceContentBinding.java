package au.com.woolworths.feature.shop.marketplace.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class FragmentMarketplaceContentBinding extends ViewDataBinding {
    public static final /* synthetic */ int B = 0;
    public boolean A;
    public final EpoxyRecyclerView y;
    public Boolean z;

    public FragmentMarketplaceContentBinding(DataBindingComponent dataBindingComponent, View view, EpoxyRecyclerView epoxyRecyclerView) {
        super(dataBindingComponent, view, 0);
        this.y = epoxyRecyclerView;
    }

    public abstract void L(boolean z);

    public abstract void M(Boolean bool);
}
