package au.com.woolworths.foundation.shop.bottomsheet.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeDownloadableAssetBinding;
import au.com.woolworths.android.onesite.data.DownloadableAsset;

/* loaded from: classes4.dex */
public abstract class EpoxyItemBannerAssetBinding extends ViewDataBinding {
    public final IncludeDownloadableAssetBinding y;
    public DownloadableAsset z;

    public EpoxyItemBannerAssetBinding(DataBindingComponent dataBindingComponent, View view, IncludeDownloadableAssetBinding includeDownloadableAssetBinding) {
        super(dataBindingComponent, view, 1);
        this.y = includeDownloadableAssetBinding;
    }
}
