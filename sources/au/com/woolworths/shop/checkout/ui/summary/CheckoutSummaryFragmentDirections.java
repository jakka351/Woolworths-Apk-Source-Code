package au.com.woolworths.shop.checkout.ui.summary;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDirections;
import au.com.woolworths.foundation.shop.bottomsheet.CheckoutRefundInfo;
import com.woolworths.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/CheckoutSummaryFragmentDirections;", "", "ActionSummaryToRefundBottomSheet", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutSummaryFragmentDirections {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/CheckoutSummaryFragmentDirections$ActionSummaryToRefundBottomSheet;", "Landroidx/navigation/NavDirections;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionSummaryToRefundBottomSheet implements NavDirections {

        /* renamed from: a, reason: collision with root package name */
        public final CheckoutRefundInfo f10822a;

        public ActionSummaryToRefundBottomSheet(CheckoutRefundInfo info) {
            Intrinsics.h(info, "info");
            this.f10822a = info;
        }

        @Override // androidx.navigation.NavDirections
        public final Bundle b() {
            Bundle bundle = new Bundle();
            boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(CheckoutRefundInfo.class);
            Parcelable parcelable = this.f10822a;
            if (zIsAssignableFrom) {
                Intrinsics.f(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("info", parcelable);
                return bundle;
            }
            if (!Serializable.class.isAssignableFrom(CheckoutRefundInfo.class)) {
                throw new UnsupportedOperationException(CheckoutRefundInfo.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            Intrinsics.f(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("info", (Serializable) parcelable);
            return bundle;
        }

        @Override // androidx.navigation.NavDirections
        public final int c() {
            return R.id.action_summary_to_refund_bottom_sheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionSummaryToRefundBottomSheet) && Intrinsics.c(this.f10822a, ((ActionSummaryToRefundBottomSheet) obj).f10822a);
        }

        public final int hashCode() {
            return this.f10822a.hashCode();
        }

        public final String toString() {
            return "ActionSummaryToRefundBottomSheet(info=" + this.f10822a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/CheckoutSummaryFragmentDirections$Companion;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }
}
