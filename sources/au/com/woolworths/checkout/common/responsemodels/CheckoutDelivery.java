package au.com.woolworths.checkout.common.responsemodels;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutDelivery;", "", "address", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutData;", "window", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutSelectedWindowData;", "<init>", "(Lau/com/woolworths/checkout/common/responsemodels/CheckoutData;Lau/com/woolworths/checkout/common/responsemodels/CheckoutSelectedWindowData;)V", "getAddress", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutData;", "getWindow", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutSelectedWindowData;", "isDeliveryAddressSet", "", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutDelivery {

    @SerializedName("Address")
    @Nullable
    private final CheckoutData address;

    @SerializedName("Window")
    @Nullable
    private final CheckoutSelectedWindowData window;

    public CheckoutDelivery(@Nullable CheckoutData checkoutData, @Nullable CheckoutSelectedWindowData checkoutSelectedWindowData) {
        this.address = checkoutData;
        this.window = checkoutSelectedWindowData;
    }

    public static /* synthetic */ CheckoutDelivery copy$default(CheckoutDelivery checkoutDelivery, CheckoutData checkoutData, CheckoutSelectedWindowData checkoutSelectedWindowData, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutData = checkoutDelivery.address;
        }
        if ((i & 2) != 0) {
            checkoutSelectedWindowData = checkoutDelivery.window;
        }
        return checkoutDelivery.copy(checkoutData, checkoutSelectedWindowData);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final CheckoutData getAddress() {
        return this.address;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final CheckoutSelectedWindowData getWindow() {
        return this.window;
    }

    @NotNull
    public final CheckoutDelivery copy(@Nullable CheckoutData address, @Nullable CheckoutSelectedWindowData window) {
        return new CheckoutDelivery(address, window);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutDelivery)) {
            return false;
        }
        CheckoutDelivery checkoutDelivery = (CheckoutDelivery) other;
        return Intrinsics.c(this.address, checkoutDelivery.address) && Intrinsics.c(this.window, checkoutDelivery.window);
    }

    @Nullable
    public final CheckoutData getAddress() {
        return this.address;
    }

    @Nullable
    public final CheckoutSelectedWindowData getWindow() {
        return this.window;
    }

    public int hashCode() {
        CheckoutData checkoutData = this.address;
        int iHashCode = (checkoutData == null ? 0 : checkoutData.hashCode()) * 31;
        CheckoutSelectedWindowData checkoutSelectedWindowData = this.window;
        return iHashCode + (checkoutSelectedWindowData != null ? checkoutSelectedWindowData.hashCode() : 0);
    }

    public final boolean isDeliveryAddressSet() {
        CheckoutData checkoutData = this.address;
        if (checkoutData != null) {
            return checkoutData.isAllDataSet();
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "CheckoutDelivery(address=" + this.address + ", window=" + this.window + ")";
    }
}
