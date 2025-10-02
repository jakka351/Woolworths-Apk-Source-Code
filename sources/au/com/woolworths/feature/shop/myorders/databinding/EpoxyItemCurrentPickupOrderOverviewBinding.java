package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.android.onesite.handlers.LinkHandler;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentPickupOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.ui.PickUpInstructionsClickHandler;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class EpoxyItemCurrentPickupOrderOverviewBinding extends ViewDataBinding {
    public final EpoxyItemButtonBinding A;
    public final EpoxyItemButtonBinding B;
    public final EpoxyItemButtonBinding C;
    public final TextView D;
    public final IncludeInsetBannerBinding E;
    public final TextView F;
    public final LayoutOrderProgressBinding G;
    public final TextView H;
    public final ImageView I;
    public final TextView J;
    public final ComposeView K;
    public CurrentPickupOrderOverview L;
    public LinkHandler M;
    public ButtonClickHandler N;
    public PickUpInstructionsClickHandler O;
    public Function1 P;
    public Boolean Q;
    public final LinearLayout y;
    public final EpoxyItemButtonBinding z;

    public EpoxyItemCurrentPickupOrderOverviewBinding(DataBindingComponent dataBindingComponent, View view, LinearLayout linearLayout, EpoxyItemButtonBinding epoxyItemButtonBinding, EpoxyItemButtonBinding epoxyItemButtonBinding2, EpoxyItemButtonBinding epoxyItemButtonBinding3, EpoxyItemButtonBinding epoxyItemButtonBinding4, TextView textView, IncludeInsetBannerBinding includeInsetBannerBinding, TextView textView2, LayoutOrderProgressBinding layoutOrderProgressBinding, TextView textView3, ImageView imageView, TextView textView4, ComposeView composeView) {
        super(dataBindingComponent, view, 6);
        this.y = linearLayout;
        this.z = epoxyItemButtonBinding;
        this.A = epoxyItemButtonBinding2;
        this.B = epoxyItemButtonBinding3;
        this.C = epoxyItemButtonBinding4;
        this.D = textView;
        this.E = includeInsetBannerBinding;
        this.F = textView2;
        this.G = layoutOrderProgressBinding;
        this.H = textView3;
        this.I = imageView;
        this.J = textView4;
        this.K = composeView;
    }
}
