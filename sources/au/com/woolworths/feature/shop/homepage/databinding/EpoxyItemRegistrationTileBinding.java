package au.com.woolworths.feature.shop.homepage.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.homepage.presentation.RegistrationClickListener;

/* loaded from: classes3.dex */
public abstract class EpoxyItemRegistrationTileBinding extends ViewDataBinding {
    public RegistrationClickListener A;
    public final Button y;
    public final Button z;

    public EpoxyItemRegistrationTileBinding(DataBindingComponent dataBindingComponent, View view, Button button, Button button2) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = button2;
    }
}
