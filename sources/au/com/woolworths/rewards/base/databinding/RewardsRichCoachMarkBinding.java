package au.com.woolworths.rewards.base.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes4.dex */
public abstract class RewardsRichCoachMarkBinding extends ViewDataBinding {
    public final TextView A;
    public final Button B;
    public final Button C;
    public final Space D;
    public final Space E;
    public final TextView F;
    public Boolean G;
    public final ImageButton y;
    public final ConstraintLayout z;

    public RewardsRichCoachMarkBinding(DataBindingComponent dataBindingComponent, View view, ImageButton imageButton, ConstraintLayout constraintLayout, TextView textView, Button button, Button button2, Space space, Space space2, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = imageButton;
        this.z = constraintLayout;
        this.A = textView;
        this.B = button;
        this.C = button2;
        this.D = space;
        this.E = space2;
        this.F = textView2;
    }
}
