package au.com.woolworths.product.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeTintableTextBinding;
import au.com.woolworths.product.models.ProductCard;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes4.dex */
public abstract class LayoutProductBoostBinding extends ViewDataBinding {
    public final TextView A;
    public ProductCard B;
    public String C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public final IncludeTintableTextBinding y;
    public final LottieAnimationView z;

    public LayoutProductBoostBinding(DataBindingComponent dataBindingComponent, View view, IncludeTintableTextBinding includeTintableTextBinding, LottieAnimationView lottieAnimationView, TextView textView) {
        super(dataBindingComponent, view, 1);
        this.y = includeTintableTextBinding;
        this.z = lottieAnimationView;
        this.A = textView;
    }

    public abstract void L(int i);

    public abstract void M(String str);

    public abstract void N(ProductCard productCard);

    public abstract void O(boolean z);

    public abstract void P(boolean z);

    public abstract void Q(boolean z);
}
