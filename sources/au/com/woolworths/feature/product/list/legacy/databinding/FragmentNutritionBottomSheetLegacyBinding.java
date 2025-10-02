package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.legacy.nutrition.NutritionBottomSheetViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentNutritionBottomSheetLegacyBinding extends ViewDataBinding {
    public final TextView A;
    public NutritionBottomSheetViewModel B;
    public final ConstraintLayout y;
    public final TextView z;

    public FragmentNutritionBottomSheetLegacyBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 1);
        this.y = constraintLayout;
        this.z = textView;
        this.A = textView2;
    }

    public abstract void L(NutritionBottomSheetViewModel nutritionBottomSheetViewModel);
}
