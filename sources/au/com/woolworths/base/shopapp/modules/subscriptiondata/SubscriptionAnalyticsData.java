package au.com.woolworths.base.shopapp.modules.subscriptiondata;

import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u000f\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0010\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0011\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0012\u0010\u000eR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/subscriptiondata/SubscriptionAnalyticsData;", "", "", "", "subscriptionTypes", "subscriptionBillingPeriods", "subscriptionAllowedUsageTypes", "subscriptionIds", "userStatus", "userSubscriberTypes", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "a", "c", "e", "f", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionAnalyticsData {

    @SerializedName("subscriptionAllowedUsageTypes")
    @NotNull
    private final List<String> subscriptionAllowedUsageTypes;

    @SerializedName("subscriptionBillingPeriods")
    @NotNull
    private final List<String> subscriptionBillingPeriods;

    @SerializedName("subscriptionIds")
    @NotNull
    private final List<String> subscriptionIds;

    @SerializedName("subscriptionTypes")
    @NotNull
    private final List<String> subscriptionTypes;

    @SerializedName("userStatus")
    @NotNull
    private final List<String> userStatus;

    @SerializedName("userSubscriberTypes")
    @NotNull
    private final List<String> userSubscriberTypes;

    public SubscriptionAnalyticsData(@NotNull List<String> subscriptionTypes, @NotNull List<String> subscriptionBillingPeriods, @NotNull List<String> subscriptionAllowedUsageTypes, @NotNull List<String> subscriptionIds, @NotNull List<String> userStatus, @NotNull List<String> userSubscriberTypes) {
        Intrinsics.h(subscriptionTypes, "subscriptionTypes");
        Intrinsics.h(subscriptionBillingPeriods, "subscriptionBillingPeriods");
        Intrinsics.h(subscriptionAllowedUsageTypes, "subscriptionAllowedUsageTypes");
        Intrinsics.h(subscriptionIds, "subscriptionIds");
        Intrinsics.h(userStatus, "userStatus");
        Intrinsics.h(userSubscriberTypes, "userSubscriberTypes");
        this.subscriptionTypes = subscriptionTypes;
        this.subscriptionBillingPeriods = subscriptionBillingPeriods;
        this.subscriptionAllowedUsageTypes = subscriptionAllowedUsageTypes;
        this.subscriptionIds = subscriptionIds;
        this.userStatus = userStatus;
        this.userSubscriberTypes = userSubscriberTypes;
    }

    /* renamed from: a, reason: from getter */
    public final List getSubscriptionAllowedUsageTypes() {
        return this.subscriptionAllowedUsageTypes;
    }

    /* renamed from: b, reason: from getter */
    public final List getSubscriptionBillingPeriods() {
        return this.subscriptionBillingPeriods;
    }

    /* renamed from: c, reason: from getter */
    public final List getSubscriptionIds() {
        return this.subscriptionIds;
    }

    /* renamed from: d, reason: from getter */
    public final List getSubscriptionTypes() {
        return this.subscriptionTypes;
    }

    /* renamed from: e, reason: from getter */
    public final List getUserStatus() {
        return this.userStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionAnalyticsData)) {
            return false;
        }
        SubscriptionAnalyticsData subscriptionAnalyticsData = (SubscriptionAnalyticsData) obj;
        return Intrinsics.c(this.subscriptionTypes, subscriptionAnalyticsData.subscriptionTypes) && Intrinsics.c(this.subscriptionBillingPeriods, subscriptionAnalyticsData.subscriptionBillingPeriods) && Intrinsics.c(this.subscriptionAllowedUsageTypes, subscriptionAnalyticsData.subscriptionAllowedUsageTypes) && Intrinsics.c(this.subscriptionIds, subscriptionAnalyticsData.subscriptionIds) && Intrinsics.c(this.userStatus, subscriptionAnalyticsData.userStatus) && Intrinsics.c(this.userSubscriberTypes, subscriptionAnalyticsData.userSubscriberTypes);
    }

    /* renamed from: f, reason: from getter */
    public final List getUserSubscriberTypes() {
        return this.userSubscriberTypes;
    }

    public final int hashCode() {
        return this.userSubscriberTypes.hashCode() + b.d(b.d(b.d(b.d(this.subscriptionTypes.hashCode() * 31, 31, this.subscriptionBillingPeriods), 31, this.subscriptionAllowedUsageTypes), 31, this.subscriptionIds), 31, this.userStatus);
    }

    public final String toString() {
        List<String> list = this.subscriptionTypes;
        List<String> list2 = this.subscriptionBillingPeriods;
        List<String> list3 = this.subscriptionAllowedUsageTypes;
        List<String> list4 = this.subscriptionIds;
        List<String> list5 = this.userStatus;
        List<String> list6 = this.userSubscriberTypes;
        StringBuilder sb = new StringBuilder("SubscriptionAnalyticsData(subscriptionTypes=");
        sb.append(list);
        sb.append(", subscriptionBillingPeriods=");
        sb.append(list2);
        sb.append(", subscriptionAllowedUsageTypes=");
        a.C(sb, list3, ", subscriptionIds=", list4, ", userStatus=");
        sb.append(list5);
        sb.append(", userSubscriberTypes=");
        sb.append(list6);
        sb.append(")");
        return sb.toString();
    }
}
