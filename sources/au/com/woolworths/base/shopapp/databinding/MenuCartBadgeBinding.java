package au.com.woolworths.base.shopapp.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.cartbadge.CartBadgeClickListener;

/* loaded from: classes3.dex */
public abstract class MenuCartBadgeBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public final TextView A;
    public CartBadgeClickListener B;
    public final ConstraintLayout y;
    public final ImageView z;

    public MenuCartBadgeBinding(View view, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = constraintLayout;
        this.z = imageView;
        this.A = textView;
    }

    public abstract void L(CartBadgeClickListener cartBadgeClickListener);
}
