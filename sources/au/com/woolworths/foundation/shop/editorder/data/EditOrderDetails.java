package au.com.woolworths.foundation.shop.editorder.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/data/EditOrderDetails;", "", "", "orderId", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderBanner;", "banner", "<init>", "(Ljava/lang/String;Lau/com/woolworths/foundation/shop/editorder/data/EditOrderBanner;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderBanner;", "a", "()Lau/com/woolworths/foundation/shop/editorder/data/EditOrderBanner;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EditOrderDetails {

    @SerializedName("banner")
    @NotNull
    private final EditOrderBanner banner;

    @SerializedName("orderId")
    @NotNull
    private final String orderId;

    public EditOrderDetails(@NotNull String orderId, @NotNull EditOrderBanner banner) {
        Intrinsics.h(orderId, "orderId");
        Intrinsics.h(banner, "banner");
        this.orderId = orderId;
        this.banner = banner;
    }

    /* renamed from: a, reason: from getter */
    public final EditOrderBanner getBanner() {
        return this.banner;
    }

    /* renamed from: b, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditOrderDetails)) {
            return false;
        }
        EditOrderDetails editOrderDetails = (EditOrderDetails) obj;
        return Intrinsics.c(this.orderId, editOrderDetails.orderId) && Intrinsics.c(this.banner, editOrderDetails.banner);
    }

    public final int hashCode() {
        return this.banner.hashCode() + (this.orderId.hashCode() * 31);
    }

    public final String toString() {
        return "EditOrderDetails(orderId=" + this.orderId + ", banner=" + this.banner + ")";
    }
}
