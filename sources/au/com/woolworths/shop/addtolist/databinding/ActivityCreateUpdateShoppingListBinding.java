package au.com.woolworths.shop.addtolist.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListViewModel;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes4.dex */
public abstract class ActivityCreateUpdateShoppingListBinding extends ViewDataBinding {
    public final ImageView A;
    public final StatefulButton B;
    public final TextInputEditText C;
    public final TextInputLayout D;
    public final ConstraintLayout E;
    public final Toolbar F;
    public CreateUpdateShoppingListViewModel G;
    public final LinearLayout y;
    public final CoordinatorLayout z;

    public ActivityCreateUpdateShoppingListBinding(DataBindingComponent dataBindingComponent, View view, LinearLayout linearLayout, CoordinatorLayout coordinatorLayout, ImageView imageView, StatefulButton statefulButton, TextInputEditText textInputEditText, TextInputLayout textInputLayout, ConstraintLayout constraintLayout, Toolbar toolbar) {
        super(dataBindingComponent, view, 1);
        this.y = linearLayout;
        this.z = coordinatorLayout;
        this.A = imageView;
        this.B = statefulButton;
        this.C = textInputEditText;
        this.D = textInputLayout;
        this.E = constraintLayout;
        this.F = toolbar;
    }

    public abstract void L(CreateUpdateShoppingListViewModel createUpdateShoppingListViewModel);
}
