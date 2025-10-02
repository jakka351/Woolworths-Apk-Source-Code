package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;

/* loaded from: classes3.dex */
public abstract class EpoxyItemNutritionInfoBinding extends ViewDataBinding {
    public InsetBannerClickListener A;
    public final IncludeInsetBannerBinding y;
    public InsetBannerData z;

    public EpoxyItemNutritionInfoBinding(DataBindingComponent dataBindingComponent, View view, IncludeInsetBannerBinding includeInsetBannerBinding) {
        super(dataBindingComponent, view, 1);
        this.y = includeInsetBannerBinding;
    }
}
