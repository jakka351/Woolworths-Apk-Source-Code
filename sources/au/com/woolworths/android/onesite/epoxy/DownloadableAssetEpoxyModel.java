package au.com.woolworths.android.onesite.epoxy;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeDownloadableAssetBinding;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/epoxy/DownloadableAssetEpoxyModel;", "Lau/com/woolworths/android/onesite/epoxy/DatabindingEpoxyModel;", "Lau/com/woolworths/android/onesite/base/ui/databinding/IncludeDownloadableAssetBinding;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DownloadableAssetEpoxyModel extends DatabindingEpoxyModel<IncludeDownloadableAssetBinding> {
    @Override // au.com.woolworths.android.onesite.epoxy.DatabindingEpoxyModel
    public final void C() {
        IncludeDownloadableAssetBinding includeDownloadableAssetBinding = (IncludeDownloadableAssetBinding) this.o;
        if (includeDownloadableAssetBinding != null) {
            includeDownloadableAssetBinding.L(null);
            includeDownloadableAssetBinding.M(null);
            includeDownloadableAssetBinding.O(null);
            includeDownloadableAssetBinding.N(Boolean.FALSE);
        }
    }

    @Override // au.com.woolworths.android.onesite.epoxy.DatabindingEpoxyModel, com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof DownloadableAssetEpoxyModel) && super.equals(obj);
    }

    @Override // au.com.woolworths.android.onesite.epoxy.DatabindingEpoxyModel, com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        return Boolean.hashCode(false) + (super.hashCode() * 923521);
    }
}
