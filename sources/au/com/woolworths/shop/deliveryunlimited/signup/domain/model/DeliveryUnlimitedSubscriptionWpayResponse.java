package au.com.woolworths.shop.deliveryunlimited.signup.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/domain/model/DeliveryUnlimitedSubscriptionWpayResponse;", "", "", "success", "", "message", "Lau/com/woolworths/analytics/model/AnalyticsData;", "errorAnalytics", "<init>", "(ZLjava/lang/String;Lau/com/woolworths/analytics/model/AnalyticsData;)V", "Z", "c", "()Z", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lau/com/woolworths/analytics/model/AnalyticsData;", "a", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSubscriptionWpayResponse {

    @SerializedName("errorAnalytics")
    @Nullable
    private final AnalyticsData errorAnalytics;

    @SerializedName("message")
    @Nullable
    private final String message;

    @SerializedName("success")
    private final boolean success;

    public DeliveryUnlimitedSubscriptionWpayResponse(boolean z, @Nullable String str, @Nullable AnalyticsData analyticsData) {
        this.success = z;
        this.message = str;
        this.errorAnalytics = analyticsData;
    }

    /* renamed from: a, reason: from getter */
    public final AnalyticsData getErrorAnalytics() {
        return this.errorAnalytics;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSubscriptionWpayResponse)) {
            return false;
        }
        DeliveryUnlimitedSubscriptionWpayResponse deliveryUnlimitedSubscriptionWpayResponse = (DeliveryUnlimitedSubscriptionWpayResponse) obj;
        return this.success == deliveryUnlimitedSubscriptionWpayResponse.success && Intrinsics.c(this.message, deliveryUnlimitedSubscriptionWpayResponse.message) && Intrinsics.c(this.errorAnalytics, deliveryUnlimitedSubscriptionWpayResponse.errorAnalytics);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AnalyticsData analyticsData = this.errorAnalytics;
        return iHashCode2 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.success;
        String str = this.message;
        return a.n(a.t("DeliveryUnlimitedSubscriptionWpayResponse(success=", ", message=", str, ", errorAnalytics=", z), this.errorAnalytics, ")");
    }
}
