package au.com.woolworths.shop.checkout.ui.confirmation;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationActivityArgs;", "Landroidx/navigation/NavArgs;", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderConfirmationActivityArgs implements NavArgs {

    /* renamed from: a, reason: collision with root package name */
    public final long f10715a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationActivityArgs$Companion;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public OrderConfirmationActivityArgs(long j) {
        this.f10715a = j;
    }

    @JvmStatic
    @NotNull
    public static final OrderConfirmationActivityArgs fromBundle(@NotNull Bundle bundle) {
        Intrinsics.h(bundle, "bundle");
        bundle.setClassLoader(OrderConfirmationActivityArgs.class.getClassLoader());
        if (bundle.containsKey("orderId")) {
            return new OrderConfirmationActivityArgs(bundle.getLong("orderId"));
        }
        throw new IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderConfirmationActivityArgs) && this.f10715a == ((OrderConfirmationActivityArgs) obj).f10715a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10715a);
    }

    public final String toString() {
        return androidx.camera.core.impl.b.l(this.f10715a, "OrderConfirmationActivityArgs(orderId=", ")");
    }
}
