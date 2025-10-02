package au.com.woolworths.feature.shop.more.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.more.MoreViewModel;
import au.com.woolworths.feature.shop.more.data.MoreCiscoWiFi;

/* loaded from: classes3.dex */
public abstract class EpoxyItemMoreWifiBinding extends ViewDataBinding {
    public MoreViewModel A;
    public final TextView y;
    public MoreCiscoWiFi z;

    public EpoxyItemMoreWifiBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }
}
