package au.com.woolworths.feature.shop.recipes.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagSummaryData;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeListener;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagImageViewState;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes3.dex */
public abstract class EpoxyItemFreshMagHomeBinding extends ViewDataBinding {
    public final Button A;
    public final ProgressBar B;
    public FreshMagHomeListener C;
    public FreshMagSummaryData D;
    public ImageLoaderListener E;
    public FreshMagImageViewState F;
    public final TextView y;
    public final MaterialCardView z;

    public EpoxyItemFreshMagHomeBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, MaterialCardView materialCardView, Button button, ProgressBar progressBar) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = materialCardView;
        this.A = button;
        this.B = progressBar;
    }

    public abstract void L(FreshMagImageViewState freshMagImageViewState);
}
