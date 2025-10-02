package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.feature.product.list.legacy.data.FilterInsetBannerData;
import au.com.woolworths.feature.product.list.legacy.ui.FilterInsetBannerClickListener;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProductListOptionsInsetBannerLegacyBinding extends ViewDataBinding {
    public FilterInsetBannerClickListener A;
    public final IncludeInsetBannerBinding y;
    public FilterInsetBannerData z;

    public EpoxyItemProductListOptionsInsetBannerLegacyBinding(DataBindingComponent dataBindingComponent, View view, IncludeInsetBannerBinding includeInsetBannerBinding) {
        super(dataBindingComponent, view, 1);
        this.y = includeInsetBannerBinding;
    }
}
