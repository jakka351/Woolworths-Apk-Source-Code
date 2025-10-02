package au.com.woolworths.feature.product.list.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.feature.product.list.data.FilterInsetBannerData;
import au.com.woolworths.feature.product.list.ui.FilterInsetBannerClickListener;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProductListOptionsInsetBannerBinding extends ViewDataBinding {
    public FilterInsetBannerClickListener A;
    public final IncludeInsetBannerBinding y;
    public FilterInsetBannerData z;

    public EpoxyItemProductListOptionsInsetBannerBinding(DataBindingComponent dataBindingComponent, View view, IncludeInsetBannerBinding includeInsetBannerBinding) {
        super(dataBindingComponent, view, 1);
        this.y = includeInsetBannerBinding;
    }
}
