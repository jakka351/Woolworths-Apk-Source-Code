package au.com.woolworths.feature.rewards.redemptionsettings.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import au.com.woolworths.feature.rewards.redemptionsettings.RedemptionItemClickListener;

/* loaded from: classes3.dex */
public abstract class EpoxyItemRedemptionSettingsBinding extends ViewDataBinding {
    public final TextView A;
    public RewardsRedemptionSettingsItem B;
    public RedemptionItemClickListener C;
    public boolean D;
    public boolean E;
    public final TextView y;
    public final FrameLayout z;

    public EpoxyItemRedemptionSettingsBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, FrameLayout frameLayout, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = frameLayout;
        this.A = textView2;
    }
}
