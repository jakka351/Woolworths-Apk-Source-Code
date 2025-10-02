package au.com.woolworths.shop.checkout.ui.summary.refund;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import au.com.woolworths.foundation.shop.bottomsheet.CheckoutRefundInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/refund/RefundBottomSheetFragmentArgs;", "Landroidx/navigation/NavArgs;", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RefundBottomSheetFragmentArgs implements NavArgs {

    /* renamed from: a, reason: collision with root package name */
    public final CheckoutRefundInfo f10829a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/refund/RefundBottomSheetFragmentArgs$Companion;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RefundBottomSheetFragmentArgs(CheckoutRefundInfo checkoutRefundInfo) {
        this.f10829a = checkoutRefundInfo;
    }

    @JvmStatic
    @NotNull
    public static final RefundBottomSheetFragmentArgs fromBundle(@NotNull Bundle bundle) {
        Intrinsics.h(bundle, "bundle");
        bundle.setClassLoader(RefundBottomSheetFragmentArgs.class.getClassLoader());
        if (!bundle.containsKey("info")) {
            throw new IllegalArgumentException("Required argument \"info\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(CheckoutRefundInfo.class) && !Serializable.class.isAssignableFrom(CheckoutRefundInfo.class)) {
            throw new UnsupportedOperationException(CheckoutRefundInfo.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        CheckoutRefundInfo checkoutRefundInfo = (CheckoutRefundInfo) bundle.get("info");
        if (checkoutRefundInfo != null) {
            return new RefundBottomSheetFragmentArgs(checkoutRefundInfo);
        }
        throw new IllegalArgumentException("Argument \"info\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RefundBottomSheetFragmentArgs) && Intrinsics.c(this.f10829a, ((RefundBottomSheetFragmentArgs) obj).f10829a);
    }

    public final int hashCode() {
        return this.f10829a.hashCode();
    }

    public final String toString() {
        return "RefundBottomSheetFragmentArgs(info=" + this.f10829a + ")";
    }
}
