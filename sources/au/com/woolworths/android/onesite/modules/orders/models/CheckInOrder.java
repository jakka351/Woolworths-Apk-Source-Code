package au.com.woolworths.android.onesite.modules.orders.models;

import YU.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/android/onesite/modules/orders/models/CheckInOrder;", "", "", "orderId", "checkInType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getOrderId", "()Ljava/lang/String;", "getCheckInType", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckInOrder {

    @SerializedName("checkInType")
    @NotNull
    private final String checkInType;

    @SerializedName("orderId")
    @NotNull
    private final String orderId;

    public CheckInOrder(@NotNull String orderId, @NotNull String checkInType) {
        Intrinsics.h(orderId, "orderId");
        Intrinsics.h(checkInType, "checkInType");
        this.orderId = orderId;
        this.checkInType = checkInType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckInOrder)) {
            return false;
        }
        CheckInOrder checkInOrder = (CheckInOrder) obj;
        return Intrinsics.c(this.orderId, checkInOrder.orderId) && Intrinsics.c(this.checkInType, checkInOrder.checkInType);
    }

    public final int hashCode() {
        return this.checkInType.hashCode() + (this.orderId.hashCode() * 31);
    }

    public final String toString() {
        return a.j("CheckInOrder(orderId=", this.orderId, ", checkInType=", this.checkInType, ")");
    }
}
