package au.com.woolworths.feature.rewards.account.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsHeaderData;

/* loaded from: classes3.dex */
public abstract class EpoxyItemPreferenceDetailsHeaderBinding extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public PreferenceDetailsHeaderData C;
    public final TextView y;
    public final TextView z;

    public EpoxyItemPreferenceDetailsHeaderBinding(View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
        this.A = imageView;
        this.B = textView3;
    }
}
