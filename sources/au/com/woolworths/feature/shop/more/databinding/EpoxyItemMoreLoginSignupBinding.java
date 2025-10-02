package au.com.woolworths.feature.shop.more.databinding;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.more.MoreViewModel;

/* loaded from: classes3.dex */
public abstract class EpoxyItemMoreLoginSignupBinding extends ViewDataBinding {
    public final Button A;
    public MoreViewModel B;
    public final Button y;
    public final ConstraintLayout z;

    public EpoxyItemMoreLoginSignupBinding(DataBindingComponent dataBindingComponent, View view, Button button, ConstraintLayout constraintLayout, Button button2) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = constraintLayout;
        this.A = button2;
    }
}
