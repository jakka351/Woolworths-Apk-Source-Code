package au.com.woolworths.foundation.shop.model.checkout;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/foundation/shop/model/checkout/OrderSummary;", "", "", "orderId", "", "isPlaced", "<init>", "(JZ)V", "J", "a", "()J", "Z", "b", "()Z", "model"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderSummary {

    @SerializedName("placed")
    private final boolean isPlaced;

    @SerializedName("orderId")
    private final long orderId;

    public OrderSummary(long j, boolean z) {
        this.orderId = j;
        this.isPlaced = z;
    }

    /* renamed from: a, reason: from getter */
    public final long getOrderId() {
        return this.orderId;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsPlaced() {
        return this.isPlaced;
    }
}
