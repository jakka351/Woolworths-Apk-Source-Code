package au.com.woolworths.feature.rewards.account.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsClickHandler;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsFooterData;

/* loaded from: classes3.dex */
public abstract class EpoxyItemPreferenceDetailsFooterBinding extends ViewDataBinding {
    public PreferenceDetailsFooterData A;
    public RewardsPreferenceDetailsClickHandler B;
    public final Button y;
    public final TextView z;

    public EpoxyItemPreferenceDetailsFooterBinding(View view, Button button, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = textView;
    }
}
