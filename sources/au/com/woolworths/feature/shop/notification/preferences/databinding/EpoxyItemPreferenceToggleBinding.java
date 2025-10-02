package au.com.woolworths.feature.shop.notification.preferences.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopPreferenceDetailsClickHandler;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferenceToggleData;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* loaded from: classes3.dex */
public abstract class EpoxyItemPreferenceToggleBinding extends ViewDataBinding {
    public final SwitchMaterial A;
    public final TextView B;
    public final TextView C;
    public PreferenceToggleData D;
    public ShopPreferenceDetailsClickHandler E;
    public Boolean F;
    public final TextView y;
    public final ConstraintLayout z;

    public EpoxyItemPreferenceToggleBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, ConstraintLayout constraintLayout, SwitchMaterial switchMaterial, TextView textView2, TextView textView3) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = constraintLayout;
        this.A = switchMaterial;
        this.B = textView2;
        this.C = textView3;
    }
}
