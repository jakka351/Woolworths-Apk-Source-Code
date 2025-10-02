package au.com.woolworths.product.details.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.HealthierBottomSheetFragment;
import au.com.woolworths.product.details.HealthierBottomSheetViewModel;

/* loaded from: classes4.dex */
public abstract class FragmentHealthierBottomSheetBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public HealthierBottomSheetFragment D;
    public HealthierBottomSheetViewModel E;
    public final ConstraintLayout y;
    public final ImageView z;

    public FragmentHealthierBottomSheetBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        super(dataBindingComponent, view, 1);
        this.y = constraintLayout;
        this.z = imageView;
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
    }

    public abstract void L(HealthierBottomSheetFragment healthierBottomSheetFragment);

    public abstract void M(HealthierBottomSheetViewModel healthierBottomSheetViewModel);
}
