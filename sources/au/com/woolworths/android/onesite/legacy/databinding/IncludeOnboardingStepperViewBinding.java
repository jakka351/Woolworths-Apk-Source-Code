package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class IncludeOnboardingStepperViewBinding extends ViewDataBinding {
    public static final /* synthetic */ int E = 0;
    public final ImageView A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public final ImageView y;
    public final TextView z;

    public IncludeOnboardingStepperViewBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, ImageView imageView3, TextView textView3) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
        this.A = imageView2;
        this.B = textView2;
        this.C = imageView3;
        this.D = textView3;
    }
}
