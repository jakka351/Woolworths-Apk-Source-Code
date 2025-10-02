package au.com.woolworths.feature.rewards.redemptionsettings.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/data/RewardsRedemptionActionsList;", "", "", "title", "", "Lau/com/woolworths/feature/rewards/redemptionsettings/data/RewardsRedemptionAction;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsRedemptionActionsList {

    @SerializedName("items")
    @NotNull
    private final List<RewardsRedemptionAction> items;

    @SerializedName("title")
    @NotNull
    private final String title;

    public RewardsRedemptionActionsList(@NotNull String title, @NotNull List<RewardsRedemptionAction> items) {
        Intrinsics.h(title, "title");
        Intrinsics.h(items, "items");
        this.title = title;
        this.items = items;
    }

    /* renamed from: a, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsRedemptionActionsList)) {
            return false;
        }
        RewardsRedemptionActionsList rewardsRedemptionActionsList = (RewardsRedemptionActionsList) obj;
        return Intrinsics.c(this.title, rewardsRedemptionActionsList.title) && Intrinsics.c(this.items, rewardsRedemptionActionsList.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return a.i("RewardsRedemptionActionsList(title=", this.title, ", items=", ")", this.items);
    }
}
