package au.com.woolworths.android.onesite.epoxy;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.base.ui.databinding.ItemDynamicSizeCardBindingImpl;
import au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardClickListener;
import au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardImageLoaderListener;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardMargins;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/epoxy/DynamicSizeCardEpoxyModel;", "Lau/com/woolworths/android/onesite/epoxy/DatabindingEpoxyModel;", "Lau/com/woolworths/android/onesite/base/ui/databinding/ItemDynamicSizeCardBindingImpl;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DynamicSizeCardEpoxyModel extends DatabindingEpoxyModel<ItemDynamicSizeCardBindingImpl> {
    public DynamicSizeCardData p;
    public DynamicSizeCardMargins q;
    public DynamicSizeCardClickListener r;
    public DynamicSizeCardImageLoaderListener s;
    public Function0 t;

    @Override // au.com.woolworths.android.onesite.epoxy.DatabindingEpoxyModel
    public final void C() throws Throwable {
        ItemDynamicSizeCardBindingImpl itemDynamicSizeCardBindingImpl = (ItemDynamicSizeCardBindingImpl) this.o;
        if (itemDynamicSizeCardBindingImpl != null) {
            DynamicSizeCardData dynamicSizeCardData = this.p;
            if (dynamicSizeCardData != null) {
                itemDynamicSizeCardBindingImpl.M(dynamicSizeCardData);
            }
            DynamicSizeCardMargins dynamicSizeCardMargins = this.q;
            if (dynamicSizeCardMargins != null) {
                itemDynamicSizeCardBindingImpl.O(dynamicSizeCardMargins);
            }
            DynamicSizeCardClickListener dynamicSizeCardClickListener = this.r;
            if (dynamicSizeCardClickListener != null) {
                itemDynamicSizeCardBindingImpl.L(dynamicSizeCardClickListener);
            }
            DynamicSizeCardImageLoaderListener dynamicSizeCardImageLoaderListener = this.s;
            if (dynamicSizeCardImageLoaderListener != null) {
                itemDynamicSizeCardBindingImpl.N(dynamicSizeCardImageLoaderListener);
            }
        }
        Function0 function0 = this.t;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void D(String str) {
        super.p(str);
    }

    @Override // au.com.woolworths.android.onesite.epoxy.DatabindingEpoxyModel, com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DynamicSizeCardEpoxyModel) || !super.equals(obj)) {
            return false;
        }
        DynamicSizeCardEpoxyModel dynamicSizeCardEpoxyModel = (DynamicSizeCardEpoxyModel) obj;
        if (!Intrinsics.c(this.p, dynamicSizeCardEpoxyModel.p) || !Intrinsics.c(this.q, dynamicSizeCardEpoxyModel.q)) {
            return false;
        }
        if ((this.r == null) != (dynamicSizeCardEpoxyModel.r == null)) {
            return false;
        }
        return (this.s == null) == (dynamicSizeCardEpoxyModel.s == null);
    }

    @Override // au.com.woolworths.android.onesite.epoxy.DatabindingEpoxyModel, com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        DynamicSizeCardData dynamicSizeCardData = this.p;
        int iHashCode2 = (iHashCode + (dynamicSizeCardData != null ? dynamicSizeCardData.hashCode() : 0)) * 31;
        DynamicSizeCardMargins dynamicSizeCardMargins = this.q;
        return ((((iHashCode2 + (dynamicSizeCardMargins != null ? dynamicSizeCardMargins.hashCode() : 0)) * 31) + (this.r != null ? 1 : 0)) * 31) + (this.s != null ? 1 : 0);
    }
}
