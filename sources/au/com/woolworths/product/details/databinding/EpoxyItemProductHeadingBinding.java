package au.com.woolworths.product.details.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoView;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelBinding;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductPriceView;

/* loaded from: classes4.dex */
public abstract class EpoxyItemProductHeadingBinding extends ViewDataBinding {
    public final ComposeView A;
    public final IncludeProductMultibuyLabelBinding B;
    public final TextView C;
    public final ProductPriceView D;
    public final TextView E;
    public final TextView F;
    public final IncludeBrandLabelBinding G;
    public ProductCard H;
    public ProductDetailsClickHandler I;
    public boolean J;
    public final FrameLayout y;
    public final ProductLocationInfoView z;

    public EpoxyItemProductHeadingBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout, ProductLocationInfoView productLocationInfoView, ComposeView composeView, IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding, TextView textView, ProductPriceView productPriceView, TextView textView2, TextView textView3, IncludeBrandLabelBinding includeBrandLabelBinding) {
        super(dataBindingComponent, view, 2);
        this.y = frameLayout;
        this.z = productLocationInfoView;
        this.A = composeView;
        this.B = includeProductMultibuyLabelBinding;
        this.C = textView;
        this.D = productPriceView;
        this.E = textView2;
        this.F = textView3;
        this.G = includeBrandLabelBinding;
    }
}
