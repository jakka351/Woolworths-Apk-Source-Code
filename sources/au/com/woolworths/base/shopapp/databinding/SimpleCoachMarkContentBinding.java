package au.com.woolworths.base.shopapp.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettings;

/* loaded from: classes3.dex */
public abstract class SimpleCoachMarkContentBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public final TextView A;
    public SimpleCoachMarkSettings B;
    public final Button y;
    public final TextView z;

    public SimpleCoachMarkContentBinding(DataBindingComponent dataBindingComponent, View view, Button button, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = textView;
        this.A = textView2;
    }

    public abstract void L(SimpleCoachMarkSettings simpleCoachMarkSettings);
}
