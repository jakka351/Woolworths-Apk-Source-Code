package au.com.woolworths.android.onesite.modules.orders.models;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/android/onesite/modules/orders/models/OrderInsetBanner;", "", "Lau/com/woolworths/android/onesite/modules/orders/models/OrderInsetBannerStatus;", "insetBannerStatus", "", "message", "<init>", "(Lau/com/woolworths/android/onesite/modules/orders/models/OrderInsetBannerStatus;Ljava/lang/String;)V", "Lau/com/woolworths/android/onesite/modules/orders/models/OrderInsetBannerStatus;", "getInsetBannerStatus", "()Lau/com/woolworths/android/onesite/modules/orders/models/OrderInsetBannerStatus;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OrderInsetBanner {

    @SerializedName("displayType")
    @NotNull
    private final OrderInsetBannerStatus insetBannerStatus;

    @SerializedName("message")
    @NotNull
    private final String message;

    public OrderInsetBanner(@NotNull OrderInsetBannerStatus insetBannerStatus, @NotNull String message) {
        Intrinsics.h(insetBannerStatus, "insetBannerStatus");
        Intrinsics.h(message, "message");
        this.insetBannerStatus = insetBannerStatus;
        this.message = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderInsetBanner)) {
            return false;
        }
        OrderInsetBanner orderInsetBanner = (OrderInsetBanner) obj;
        return this.insetBannerStatus == orderInsetBanner.insetBannerStatus && Intrinsics.c(this.message, orderInsetBanner.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + (this.insetBannerStatus.hashCode() * 31);
    }

    public final String toString() {
        return "OrderInsetBanner(insetBannerStatus=" + this.insetBannerStatus + ", message=" + this.message + ")";
    }
}
