package au.com.woolworths.shop.deliveryunlimited.signup.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeConfirmation;", "", "", "feed", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeConfirmationAnalytics;", "analytics", "<init>", "(Ljava/util/List;Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeConfirmationAnalytics;)V", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeConfirmationAnalytics;", "a", "()Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeConfirmationAnalytics;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSubscribeConfirmation {

    @SerializedName("analytics")
    @NotNull
    private final DeliveryUnlimitedSubscribeConfirmationAnalytics analytics;

    @SerializedName("feed")
    @NotNull
    private final List<Object> feed;

    public DeliveryUnlimitedSubscribeConfirmation(@NotNull List<? extends Object> feed, @NotNull DeliveryUnlimitedSubscribeConfirmationAnalytics analytics) {
        Intrinsics.h(feed, "feed");
        Intrinsics.h(analytics, "analytics");
        this.feed = feed;
        this.analytics = analytics;
    }

    /* renamed from: a, reason: from getter */
    public final DeliveryUnlimitedSubscribeConfirmationAnalytics getAnalytics() {
        return this.analytics;
    }

    /* renamed from: b, reason: from getter */
    public final List getFeed() {
        return this.feed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSubscribeConfirmation)) {
            return false;
        }
        DeliveryUnlimitedSubscribeConfirmation deliveryUnlimitedSubscribeConfirmation = (DeliveryUnlimitedSubscribeConfirmation) obj;
        return Intrinsics.c(this.feed, deliveryUnlimitedSubscribeConfirmation.feed) && Intrinsics.c(this.analytics, deliveryUnlimitedSubscribeConfirmation.analytics);
    }

    public final int hashCode() {
        return this.analytics.hashCode() + (this.feed.hashCode() * 31);
    }

    public final String toString() {
        return "DeliveryUnlimitedSubscribeConfirmation(feed=" + this.feed + ", analytics=" + this.analytics + ")";
    }
}
