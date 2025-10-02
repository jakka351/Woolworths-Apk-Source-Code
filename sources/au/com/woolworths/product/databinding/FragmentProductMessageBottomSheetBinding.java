package au.com.woolworths.product.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetListener;

/* loaded from: classes4.dex */
public abstract class FragmentProductMessageBottomSheetBinding extends ViewDataBinding {
    public static final /* synthetic */ int K = 0;
    public final LayoutProductInfoBinding A;
    public final FrameLayout B;
    public final TextView C;
    public final ComposeView D;
    public Screen E;
    public ProductCardConfig F;
    public ProductCard G;
    public String H;
    public ProductMessageBottomSheetListener I;
    public boolean J;
    public final Button y;
    public final IncludeHorizontalDividerBinding z;

    public FragmentProductMessageBottomSheetBinding(DataBindingComponent dataBindingComponent, View view, Button button, IncludeHorizontalDividerBinding includeHorizontalDividerBinding, LayoutProductInfoBinding layoutProductInfoBinding, FrameLayout frameLayout, TextView textView, ComposeView composeView) {
        super(dataBindingComponent, view, 2);
        this.y = button;
        this.z = includeHorizontalDividerBinding;
        this.A = layoutProductInfoBinding;
        this.B = frameLayout;
        this.C = textView;
        this.D = composeView;
    }

    public abstract void L(Screen screen);

    public abstract void M(boolean z);

    public abstract void N(String str);

    public abstract void O(ProductCardConfig productCardConfig);

    public abstract void P(ProductCard productCard);

    public abstract void Q(ProductMessageBottomSheetListener productMessageBottomSheetListener);
}
