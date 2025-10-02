package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorViewModel;
import au.com.woolworths.feature.shop.myorders.details.models.BayNumberPreferences;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorView;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;

/* loaded from: classes3.dex */
public abstract class FragmentBayNumberSelectorBinding extends ViewDataBinding {
    public static final /* synthetic */ int G = 0;
    public final HorizontalSelectorView A;
    public final TextView B;
    public final TextView C;
    public HorizontalSelectorViewListener D;
    public BayNumberSelectorViewModel E;
    public BayNumberPreferences F;
    public final EpoxyItemButtonBinding y;
    public final EpoxyItemButtonBinding z;

    public FragmentBayNumberSelectorBinding(DataBindingComponent dataBindingComponent, View view, EpoxyItemButtonBinding epoxyItemButtonBinding, EpoxyItemButtonBinding epoxyItemButtonBinding2, HorizontalSelectorView horizontalSelectorView, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 3);
        this.y = epoxyItemButtonBinding;
        this.z = epoxyItemButtonBinding2;
        this.A = horizontalSelectorView;
        this.B = textView;
        this.C = textView2;
    }

    public abstract void L(BayNumberPreferences bayNumberPreferences);

    public abstract void M(HorizontalSelectorViewListener horizontalSelectorViewListener);

    public abstract void N(BayNumberSelectorViewModel bayNumberSelectorViewModel);
}
