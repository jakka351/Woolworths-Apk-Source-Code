package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeSearchableToolbarWrapperBinding;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class ActivityAddFullDeliveryAddressBySearchBinding extends ViewDataBinding {
    public final IncludeSearchableToolbarWrapperBinding A;
    public DeliveryAddressSearchViewModel B;
    public final ComposeView y;
    public final EpoxyRecyclerView z;

    public ActivityAddFullDeliveryAddressBySearchBinding(DataBindingComponent dataBindingComponent, View view, ComposeView composeView, EpoxyRecyclerView epoxyRecyclerView, IncludeSearchableToolbarWrapperBinding includeSearchableToolbarWrapperBinding) {
        super(dataBindingComponent, view, 2);
        this.y = composeView;
        this.z = epoxyRecyclerView;
        this.A = includeSearchableToolbarWrapperBinding;
    }

    public abstract void L(DeliveryAddressSearchViewModel deliveryAddressSearchViewModel);
}
