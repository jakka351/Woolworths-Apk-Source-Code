package au.com.woolworths.feature.rewards.card.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentRewardsCardOutageBottomSheetBinding extends ViewDataBinding {
    public final TextView A;
    public ServiceUnavailableViewModel B;
    public final Button y;
    public final TextView z;

    public FragmentRewardsCardOutageBottomSheetBinding(DataBindingComponent dataBindingComponent, View view, Button button, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = textView;
        this.A = textView2;
    }

    public abstract void L(ServiceUnavailableViewModel serviceUnavailableViewModel);
}
