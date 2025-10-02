package au.com.woolworths.android.onesite.epoxy;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/epoxy/InsetBannerEpoxyModel;", "Lau/com/woolworths/android/onesite/epoxy/DatabindingEpoxyModel;", "Lau/com/woolworths/android/onesite/base/ui/databinding/IncludeInsetBannerBinding;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InsetBannerEpoxyModel extends DatabindingEpoxyModel<IncludeInsetBannerBinding> {
    public InsetBanner p;

    @Override // au.com.woolworths.android.onesite.epoxy.DatabindingEpoxyModel
    public final void C() {
        IncludeInsetBannerBinding includeInsetBannerBinding = (IncludeInsetBannerBinding) this.o;
        if (includeInsetBannerBinding != null) {
            includeInsetBannerBinding.L(this.p);
            includeInsetBannerBinding.M(null);
        }
    }

    @Override // au.com.woolworths.android.onesite.epoxy.DatabindingEpoxyModel, com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof InsetBannerEpoxyModel) && super.equals(obj) && Intrinsics.c(this.p, ((InsetBannerEpoxyModel) obj).p);
    }

    @Override // au.com.woolworths.android.onesite.epoxy.DatabindingEpoxyModel, com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        InsetBanner insetBanner = this.p;
        return (iHashCode + (insetBanner != null ? insetBanner.hashCode() : 0)) * 31;
    }
}
