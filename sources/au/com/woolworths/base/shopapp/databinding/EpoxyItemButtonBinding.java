package au.com.woolworths.base.shopapp.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;

/* loaded from: classes3.dex */
public abstract class EpoxyItemButtonBinding extends ViewDataBinding {
    public ButtonClickHandler A;
    public final FrameLayout y;
    public ButtonApiData z;

    public EpoxyItemButtonBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout) {
        super(dataBindingComponent, view, 0);
        this.y = frameLayout;
    }

    public abstract void L(ButtonApiData buttonApiData);

    public abstract void M(ButtonClickHandler buttonClickHandler);
}
