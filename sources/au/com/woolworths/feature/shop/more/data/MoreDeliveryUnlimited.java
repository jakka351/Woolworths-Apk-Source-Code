package au.com.woolworths.feature.shop.more.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.model.deliveryunilimited.DeliveryUnlimitedStatus;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/feature/shop/more/data/MoreDeliveryUnlimited;", "", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "badge", "Lau/com/woolworths/foundation/shop/model/deliveryunilimited/DeliveryUnlimitedStatus;", "status", "subscribeUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/foundation/shop/model/deliveryunilimited/DeliveryUnlimitedStatus;Ljava/lang/String;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "d", "a", "Lau/com/woolworths/foundation/shop/model/deliveryunilimited/DeliveryUnlimitedStatus;", "b", "()Lau/com/woolworths/foundation/shop/model/deliveryunilimited/DeliveryUnlimitedStatus;", "c", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MoreDeliveryUnlimited {

    @SerializedName("badge")
    @Nullable
    private final String badge;

    @SerializedName("status")
    @NotNull
    private final DeliveryUnlimitedStatus status;

    @SerializedName("subscribeUrl")
    @NotNull
    private final String subscribeUrl;

    @SerializedName(NotificationMessage.NOTIF_KEY_SUB_TITLE)
    @Nullable
    private final String subtitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    public MoreDeliveryUnlimited(@NotNull String title, @Nullable String str, @Nullable String str2, @NotNull DeliveryUnlimitedStatus status, @NotNull String subscribeUrl) {
        Intrinsics.h(title, "title");
        Intrinsics.h(status, "status");
        Intrinsics.h(subscribeUrl, "subscribeUrl");
        this.title = title;
        this.subtitle = str;
        this.badge = str2;
        this.status = status;
        this.subscribeUrl = subscribeUrl;
    }

    /* renamed from: a, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    /* renamed from: b, reason: from getter */
    public final DeliveryUnlimitedStatus getStatus() {
        return this.status;
    }

    /* renamed from: c, reason: from getter */
    public final String getSubscribeUrl() {
        return this.subscribeUrl;
    }

    /* renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreDeliveryUnlimited)) {
            return false;
        }
        MoreDeliveryUnlimited moreDeliveryUnlimited = (MoreDeliveryUnlimited) obj;
        return Intrinsics.c(this.title, moreDeliveryUnlimited.title) && Intrinsics.c(this.subtitle, moreDeliveryUnlimited.subtitle) && Intrinsics.c(this.badge, moreDeliveryUnlimited.badge) && this.status == moreDeliveryUnlimited.status && Intrinsics.c(this.subscribeUrl, moreDeliveryUnlimited.subscribeUrl);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.badge;
        return this.subscribeUrl.hashCode() + ((this.status.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.badge;
        DeliveryUnlimitedStatus deliveryUnlimitedStatus = this.status;
        String str4 = this.subscribeUrl;
        StringBuilder sbV = a.v("MoreDeliveryUnlimited(title=", str, ", subtitle=", str2, ", badge=");
        sbV.append(str3);
        sbV.append(", status=");
        sbV.append(deliveryUnlimitedStatus);
        sbV.append(", subscribeUrl=");
        return a.o(sbV, str4, ")");
    }
}
