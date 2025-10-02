package au.com.woolworths.android.onesite.epoxy;

import android.view.View;
import androidx.camera.core.processing.concurrent.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericInlineErrorStateBinding;
import au.com.woolworths.shop.checkout.domain.model.CheckoutInlineError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/epoxy/GenericInlineErrorStateEpoxyModel;", "Lau/com/woolworths/android/onesite/epoxy/DatabindingEpoxyModel;", "Lau/com/woolworths/android/onesite/base/ui/databinding/IncludeGenericInlineErrorStateBinding;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GenericInlineErrorStateEpoxyModel extends DatabindingEpoxyModel<IncludeGenericInlineErrorStateBinding> {
    public b p;
    public CheckoutInlineError q;

    @Override // au.com.woolworths.android.onesite.epoxy.DatabindingEpoxyModel
    public final void C() {
        IncludeGenericInlineErrorStateBinding includeGenericInlineErrorStateBinding = (IncludeGenericInlineErrorStateBinding) this.o;
        if (includeGenericInlineErrorStateBinding != null) {
            includeGenericInlineErrorStateBinding.M(this.q);
            includeGenericInlineErrorStateBinding.L(null);
        }
    }

    @Override // au.com.woolworths.android.onesite.epoxy.DatabindingEpoxyModel, com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GenericInlineErrorStateEpoxyModel) && super.equals(obj) && Intrinsics.c(this.q, ((GenericInlineErrorStateEpoxyModel) obj).q);
    }

    @Override // au.com.woolworths.android.onesite.epoxy.DatabindingEpoxyModel, com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        CheckoutInlineError checkoutInlineError = this.q;
        return (iHashCode + (checkoutInlineError != null ? checkoutInlineError.hashCode() : 0)) * 31;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void x(int i, Object obj) {
        View view = (View) obj;
        Intrinsics.h(view, "view");
        IncludeGenericInlineErrorStateBinding includeGenericInlineErrorStateBinding = (IncludeGenericInlineErrorStateBinding) this.o;
        if (includeGenericInlineErrorStateBinding != null) {
            this.p.invoke(this, includeGenericInlineErrorStateBinding, Integer.valueOf(i));
        }
    }
}
