package au.com.woolworths.base.shopapp.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class ButtonDestructiveBinding extends ViewDataBinding {
    public final Button y;

    public ButtonDestructiveBinding(DataBindingComponent dataBindingComponent, View view, Button button) {
        super(dataBindingComponent, view, 0);
        this.y = button;
    }
}
