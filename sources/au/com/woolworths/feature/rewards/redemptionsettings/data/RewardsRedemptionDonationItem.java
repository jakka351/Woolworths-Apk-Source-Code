package au.com.woolworths.feature.rewards.redemptionsettings.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionIcon;
import com.google.gson.annotations.SerializedName;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/data/RewardsRedemptionDonationItem;", "", "Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;", BarcodePickDeserializer.FIELD_ICON, "", "title", "body", "<init>", "(Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;Ljava/lang/String;Ljava/lang/String;)V", "Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;", "getIcon", "()Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getBody", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsRedemptionDonationItem {

    @SerializedName("body")
    @NotNull
    private final String body;

    @SerializedName(BarcodePickDeserializer.FIELD_ICON)
    @NotNull
    private final RewardsRedemptionIcon icon;

    @SerializedName("title")
    @NotNull
    private final String title;

    public RewardsRedemptionDonationItem(@NotNull RewardsRedemptionIcon icon, @NotNull String title, @NotNull String body) {
        Intrinsics.h(icon, "icon");
        Intrinsics.h(title, "title");
        Intrinsics.h(body, "body");
        this.icon = icon;
        this.title = title;
        this.body = body;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsRedemptionDonationItem)) {
            return false;
        }
        RewardsRedemptionDonationItem rewardsRedemptionDonationItem = (RewardsRedemptionDonationItem) obj;
        return this.icon == rewardsRedemptionDonationItem.icon && Intrinsics.c(this.title, rewardsRedemptionDonationItem.title) && Intrinsics.c(this.body, rewardsRedemptionDonationItem.body);
    }

    public final int hashCode() {
        return this.body.hashCode() + b.c(this.icon.hashCode() * 31, 31, this.title);
    }

    public final String toString() {
        RewardsRedemptionIcon rewardsRedemptionIcon = this.icon;
        String str = this.title;
        String str2 = this.body;
        StringBuilder sb = new StringBuilder("RewardsRedemptionDonationItem(icon=");
        sb.append(rewardsRedemptionIcon);
        sb.append(", title=");
        sb.append(str);
        sb.append(", body=");
        return a.o(sb, str2, ")");
    }
}
