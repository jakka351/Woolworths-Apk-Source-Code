package au.com.woolworths.android.onesite.epoxy;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.base.ui.databinding.ItemSpacerBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/epoxy/ItemSpacerEpoxyModel;", "Lau/com/woolworths/android/onesite/epoxy/DatabindingEpoxyModel;", "Lau/com/woolworths/android/onesite/base/ui/databinding/ItemSpacerBinding;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ItemSpacerEpoxyModel extends DatabindingEpoxyModel<ItemSpacerBinding> {
    public Integer p;

    @Override // au.com.woolworths.android.onesite.epoxy.DatabindingEpoxyModel
    public final void C() {
        Integer num = this.p;
        if (num != null) {
            int iIntValue = num.intValue();
            ItemSpacerBinding itemSpacerBinding = (ItemSpacerBinding) this.o;
            if (itemSpacerBinding != null) {
                itemSpacerBinding.L(iIntValue);
            }
        }
    }

    public final void D(int i) {
        this.p = Integer.valueOf(i);
    }

    @Override // au.com.woolworths.android.onesite.epoxy.DatabindingEpoxyModel, com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ItemSpacerEpoxyModel) && super.equals(obj) && Intrinsics.c(this.p, ((ItemSpacerEpoxyModel) obj).p);
    }

    @Override // au.com.woolworths.android.onesite.epoxy.DatabindingEpoxyModel, com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Integer num = this.p;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
