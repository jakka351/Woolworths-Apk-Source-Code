package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.main.MainViewModel;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.feature.shop.homepage.data.HomeFulfilmentWindowState;

/* loaded from: classes3.dex */
public abstract class IncludeShoppingModeFulfilmentBinding extends ViewDataBinding {
    public final TextView A;
    public HomeFulfilmentWindowState B;
    public MainViewModel C;
    public final EpoxyItemButtonBinding y;
    public final TextView z;

    public IncludeShoppingModeFulfilmentBinding(DataBindingComponent dataBindingComponent, View view, EpoxyItemButtonBinding epoxyItemButtonBinding, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 1);
        this.y = epoxyItemButtonBinding;
        this.z = textView;
        this.A = textView2;
    }
}
