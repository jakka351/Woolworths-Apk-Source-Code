package au.com.woolworths.base.shopapp.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;

/* loaded from: classes3.dex */
public abstract class ItemContainedButtonBinding extends ViewDataBinding {
    public ButtonClickHandler A;
    public Boolean B;
    public final Button y;
    public au.com.woolworths.base.shopapp.modules.button.Button z;

    public ItemContainedButtonBinding(DataBindingComponent dataBindingComponent, View view, Button button) {
        super(dataBindingComponent, view, 0);
        this.y = button;
    }
}
