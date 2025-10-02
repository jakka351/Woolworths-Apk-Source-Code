package au.com.woolworths.product.details.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.ui.ProductNutritionInfoUiModel;

/* loaded from: classes4.dex */
public abstract class EpoxyItemProductNutritionInfoBinding extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final TextView C;
    public final LinearLayout D;
    public final TextView E;
    public ProductNutritionInfoUiModel F;
    public ProductDetailsClickHandler G;
    public final TextView y;
    public final Button z;

    public EpoxyItemProductNutritionInfoBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, Button button, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, LinearLayout linearLayout, TextView textView4) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = button;
        this.A = constraintLayout;
        this.B = textView2;
        this.C = textView3;
        this.D = linearLayout;
        this.E = textView4;
    }
}
