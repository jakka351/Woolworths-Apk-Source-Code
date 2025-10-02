package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler;
import au.com.woolworths.feature.shop.myorders.details.models.OrderOverview;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes3.dex */
public abstract class EpoxyItemOrderOverviewBinding extends ViewDataBinding {
    public final TextView A;
    public final IncludeInsetBannerBinding B;
    public final TextView C;
    public final ConstraintLayout D;
    public final MaterialTextView E;
    public final TextView F;
    public final ConstraintLayout G;
    public final TextView H;
    public final TextView I;
    public final EpoxyItemButtonBinding J;
    public final TextView K;
    public OrderOverview L;
    public ButtonClickHandler M;
    public OrderDetailsClickHandler N;
    public final EpoxyItemButtonBinding y;
    public final EpoxyItemButtonBinding z;

    public EpoxyItemOrderOverviewBinding(DataBindingComponent dataBindingComponent, View view, EpoxyItemButtonBinding epoxyItemButtonBinding, EpoxyItemButtonBinding epoxyItemButtonBinding2, TextView textView, IncludeInsetBannerBinding includeInsetBannerBinding, TextView textView2, ConstraintLayout constraintLayout, MaterialTextView materialTextView, TextView textView3, ConstraintLayout constraintLayout2, TextView textView4, TextView textView5, EpoxyItemButtonBinding epoxyItemButtonBinding3, TextView textView6) {
        super(dataBindingComponent, view, 4);
        this.y = epoxyItemButtonBinding;
        this.z = epoxyItemButtonBinding2;
        this.A = textView;
        this.B = includeInsetBannerBinding;
        this.C = textView2;
        this.D = constraintLayout;
        this.E = materialTextView;
        this.F = textView3;
        this.G = constraintLayout2;
        this.H = textView4;
        this.I = textView5;
        this.J = epoxyItemButtonBinding3;
        this.K = textView6;
    }
}
