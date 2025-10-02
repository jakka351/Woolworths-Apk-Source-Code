package au.com.woolworths.android.onesite.base.ui.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class UnlockSliderBinding extends ViewDataBinding {
    public static final /* synthetic */ int J = 0;
    public final View A;
    public final ConstraintLayout B;
    public final Space C;
    public final TextView D;
    public final Space E;
    public String F;
    public String G;
    public int H;
    public boolean I;
    public final ImageView y;
    public final ProgressBar z;

    public UnlockSliderBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, ProgressBar progressBar, View view2, ConstraintLayout constraintLayout, Space space, TextView textView, Space space2) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = progressBar;
        this.A = view2;
        this.B = constraintLayout;
        this.C = space;
        this.D = textView;
        this.E = space2;
    }

    public abstract void L(String str);

    public abstract void M(int i);

    public abstract void N(boolean z);

    public abstract void O(String str);
}
