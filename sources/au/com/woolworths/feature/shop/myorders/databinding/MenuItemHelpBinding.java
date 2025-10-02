package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.help.HelpActionView;

/* loaded from: classes3.dex */
public abstract class MenuItemHelpBinding extends ViewDataBinding {
    public static final /* synthetic */ int A = 0;
    public final Button y;
    public HelpActionView.ClickHandler z;

    public MenuItemHelpBinding(DataBindingComponent dataBindingComponent, View view, Button button) {
        super(dataBindingComponent, view, 0);
        this.y = button;
    }

    public abstract void L(HelpActionView.ClickHandler clickHandler);
}
