package au.com.woolworths.feature.rewards.account.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsClickHandler;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* loaded from: classes3.dex */
public abstract class EpoxyItemPreferenceDetailsToggleBinding extends ViewDataBinding {
    public final SwitchMaterial A;
    public final TextView B;
    public final TextView C;
    public PreferenceToggleData D;
    public RewardsPreferenceDetailsClickHandler E;
    public Boolean F;
    public final ImageView y;
    public final ConstraintLayout z;

    public EpoxyItemPreferenceDetailsToggleBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, ConstraintLayout constraintLayout, SwitchMaterial switchMaterial, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = constraintLayout;
        this.A = switchMaterial;
        this.B = textView;
        this.C = textView2;
    }
}
