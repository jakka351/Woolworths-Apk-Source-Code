package au.com.woolworths.product.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.tile.ProductPriceView;

/* loaded from: classes4.dex */
public abstract class EpoxyItemProductCardTileBinding extends ViewDataBinding {
    public final Barrier A;
    public final Button B;
    public final Button C;
    public final Button D;
    public final TextView E;
    public final Group F;
    public final ImageView G;
    public final IncludeBrandLabelBinding H;
    public final LayoutMemberPriceLabelBinding I;
    public final IncludeProductMultibuyLabelBinding J;
    public final TextView K;
    public final ProductPriceView L;
    public final TextView M;
    public final TextView N;
    public final TextView O;
    public final TextView P;
    public final Button Q;
    public final ImageView R;
    public String S;
    public ProductClickListener T;
    public ProductCard U;
    public Boolean V;
    public Boolean W;
    public Boolean X;
    public boolean Y;
    public final Button y;
    public final ImageView z;

    public EpoxyItemProductCardTileBinding(DataBindingComponent dataBindingComponent, View view, Button button, ImageView imageView, Barrier barrier, Button button2, Button button3, Button button4, TextView textView, Group group, ImageView imageView2, IncludeBrandLabelBinding includeBrandLabelBinding, LayoutMemberPriceLabelBinding layoutMemberPriceLabelBinding, IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding, TextView textView2, ProductPriceView productPriceView, TextView textView3, TextView textView4, TextView textView5, TextView textView6, Button button5, ImageView imageView3) {
        super(dataBindingComponent, view, 3);
        this.y = button;
        this.z = imageView;
        this.A = barrier;
        this.B = button2;
        this.C = button3;
        this.D = button4;
        this.E = textView;
        this.F = group;
        this.G = imageView2;
        this.H = includeBrandLabelBinding;
        this.I = layoutMemberPriceLabelBinding;
        this.J = includeProductMultibuyLabelBinding;
        this.K = textView2;
        this.L = productPriceView;
        this.M = textView3;
        this.N = textView4;
        this.O = textView5;
        this.P = textView6;
        this.Q = button5;
        this.R = imageView3;
    }
}
