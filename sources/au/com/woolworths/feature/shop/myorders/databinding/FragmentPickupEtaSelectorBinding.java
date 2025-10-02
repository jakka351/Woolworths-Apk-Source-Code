package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorViewModel;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorView;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;

/* loaded from: classes3.dex */
public abstract class FragmentPickupEtaSelectorBinding extends ViewDataBinding {
    public static final /* synthetic */ int E = 0;
    public final TextView A;
    public final TextView B;
    public HorizontalSelectorViewListener C;
    public PickupEtaSelectorViewModel D;
    public final EpoxyItemButtonBinding y;
    public final HorizontalSelectorView z;

    public FragmentPickupEtaSelectorBinding(DataBindingComponent dataBindingComponent, View view, EpoxyItemButtonBinding epoxyItemButtonBinding, HorizontalSelectorView horizontalSelectorView, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 2);
        this.y = epoxyItemButtonBinding;
        this.z = horizontalSelectorView;
        this.A = textView;
        this.B = textView2;
    }

    public abstract void L(HorizontalSelectorViewListener horizontalSelectorViewListener);

    public abstract void M(PickupEtaSelectorViewModel pickupEtaSelectorViewModel);
}
