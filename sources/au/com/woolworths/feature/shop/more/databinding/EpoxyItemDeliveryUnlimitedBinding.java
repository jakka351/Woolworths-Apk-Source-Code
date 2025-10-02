package au.com.woolworths.feature.shop.more.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.feature.shop.more.MoreClickListener;
import au.com.woolworths.feature.shop.more.data.MoreDeliveryUnlimited;

/* loaded from: classes3.dex */
public abstract class EpoxyItemDeliveryUnlimitedBinding extends ViewDataBinding {
    public final TextView A;
    public MoreDeliveryUnlimited B;
    public MoreClickListener C;
    public final TextView y;
    public final IncludeBrandLabelBinding z;

    public EpoxyItemDeliveryUnlimitedBinding(View view, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent, IncludeBrandLabelBinding includeBrandLabelBinding) {
        super(dataBindingComponent, view, 1);
        this.y = textView;
        this.z = includeBrandLabelBinding;
        this.A = textView2;
    }
}
