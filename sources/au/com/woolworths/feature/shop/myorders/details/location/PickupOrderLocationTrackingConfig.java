package au.com.woolworths.feature.shop.myorders.details.location;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/location/PickupOrderLocationTrackingConfig;", "", "", "trackingIntervalSeconds", "<init>", "(J)V", "J", "a", "()J", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PickupOrderLocationTrackingConfig {

    @SerializedName("tracking_interval_seconds")
    private final long trackingIntervalSeconds;

    public PickupOrderLocationTrackingConfig(long j) {
        this.trackingIntervalSeconds = j;
    }

    /* renamed from: a, reason: from getter */
    public final long getTrackingIntervalSeconds() {
        return this.trackingIntervalSeconds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PickupOrderLocationTrackingConfig) && this.trackingIntervalSeconds == ((PickupOrderLocationTrackingConfig) obj).trackingIntervalSeconds;
    }

    public final int hashCode() {
        return Long.hashCode(this.trackingIntervalSeconds);
    }

    public final String toString() {
        return androidx.camera.core.impl.b.l(this.trackingIntervalSeconds, "PickupOrderLocationTrackingConfig(trackingIntervalSeconds=", ")");
    }
}
