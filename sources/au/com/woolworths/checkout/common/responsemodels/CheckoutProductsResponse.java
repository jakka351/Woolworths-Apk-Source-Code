package au.com.woolworths.checkout.common.responsemodels;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutProductsResponse;", "", "checkoutOrder", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutOrder;", "trolley", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutTrolley;", "<init>", "(Lau/com/woolworths/checkout/common/responsemodels/CheckoutOrder;Lau/com/woolworths/checkout/common/responsemodels/CheckoutTrolley;)V", "getCheckoutOrder", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutOrder;", "getTrolley", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutTrolley;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutProductsResponse {

    @SerializedName("Order")
    @Nullable
    private final CheckoutOrder checkoutOrder;

    @SerializedName("Trolley")
    @Nullable
    private final CheckoutTrolley trolley;

    public CheckoutProductsResponse(@Nullable CheckoutOrder checkoutOrder, @Nullable CheckoutTrolley checkoutTrolley) {
        this.checkoutOrder = checkoutOrder;
        this.trolley = checkoutTrolley;
    }

    public static /* synthetic */ CheckoutProductsResponse copy$default(CheckoutProductsResponse checkoutProductsResponse, CheckoutOrder checkoutOrder, CheckoutTrolley checkoutTrolley, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutOrder = checkoutProductsResponse.checkoutOrder;
        }
        if ((i & 2) != 0) {
            checkoutTrolley = checkoutProductsResponse.trolley;
        }
        return checkoutProductsResponse.copy(checkoutOrder, checkoutTrolley);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final CheckoutOrder getCheckoutOrder() {
        return this.checkoutOrder;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final CheckoutTrolley getTrolley() {
        return this.trolley;
    }

    @NotNull
    public final CheckoutProductsResponse copy(@Nullable CheckoutOrder checkoutOrder, @Nullable CheckoutTrolley trolley) {
        return new CheckoutProductsResponse(checkoutOrder, trolley);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutProductsResponse)) {
            return false;
        }
        CheckoutProductsResponse checkoutProductsResponse = (CheckoutProductsResponse) other;
        return Intrinsics.c(this.checkoutOrder, checkoutProductsResponse.checkoutOrder) && Intrinsics.c(this.trolley, checkoutProductsResponse.trolley);
    }

    @Nullable
    public final CheckoutOrder getCheckoutOrder() {
        return this.checkoutOrder;
    }

    @Nullable
    public final CheckoutTrolley getTrolley() {
        return this.trolley;
    }

    public int hashCode() {
        CheckoutOrder checkoutOrder = this.checkoutOrder;
        int iHashCode = (checkoutOrder == null ? 0 : checkoutOrder.hashCode()) * 31;
        CheckoutTrolley checkoutTrolley = this.trolley;
        return iHashCode + (checkoutTrolley != null ? checkoutTrolley.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CheckoutProductsResponse(checkoutOrder=" + this.checkoutOrder + ", trolley=" + this.trolley + ")";
    }
}
