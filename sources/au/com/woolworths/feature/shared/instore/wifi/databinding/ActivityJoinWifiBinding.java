package au.com.woolworths.feature.shared.instore.wifi.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiContract;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiViewModel;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* loaded from: classes3.dex */
public abstract class ActivityJoinWifiBinding extends ViewDataBinding {
    public final View A;
    public final ProgressBar B;
    public final SwitchMaterial C;
    public final TextView D;
    public JoinWifiViewModel E;
    public JoinWifiContract.ViewState F;
    public final ImageButton y;
    public final Button z;

    public ActivityJoinWifiBinding(DataBindingComponent dataBindingComponent, View view, ImageButton imageButton, Button button, View view2, ProgressBar progressBar, SwitchMaterial switchMaterial, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = imageButton;
        this.z = button;
        this.A = view2;
        this.B = progressBar;
        this.C = switchMaterial;
        this.D = textView;
    }

    public abstract void L(JoinWifiViewModel joinWifiViewModel);

    public abstract void M(JoinWifiContract.ViewState viewState);
}
