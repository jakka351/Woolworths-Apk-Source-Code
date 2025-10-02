package au.com.woolworths.feature.product.list.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProductListInsetBannerBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public Integer A;
    public InsetBannerClickListener B;
    public final IncludeInsetBannerBinding y;
    public InsetBannerData z;

    public EpoxyItemProductListInsetBannerBinding(DataBindingComponent dataBindingComponent, View view, IncludeInsetBannerBinding includeInsetBannerBinding) {
        super(dataBindingComponent, view, 1);
        this.y = includeInsetBannerBinding;
    }

    public abstract void L(InsetBannerData insetBannerData);

    public abstract void M(Integer num);
}
