package au.com.woolworths.rewards.base.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/rewards/base/data/ActionBannerWithCampaignId;", "", "actionBannerData", "Lau/com/woolworths/rewards/base/data/RewardsActionBannerData;", "campaignId", "", "<init>", "(Lau/com/woolworths/rewards/base/data/RewardsActionBannerData;I)V", "getActionBannerData", "()Lau/com/woolworths/rewards/base/data/RewardsActionBannerData;", "getCampaignId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ActionBannerWithCampaignId {
    public static final int $stable = 8;

    @NotNull
    private final RewardsActionBannerData actionBannerData;
    private final int campaignId;

    public ActionBannerWithCampaignId(@NotNull RewardsActionBannerData actionBannerData, int i) {
        Intrinsics.h(actionBannerData, "actionBannerData");
        this.actionBannerData = actionBannerData;
        this.campaignId = i;
    }

    public static /* synthetic */ ActionBannerWithCampaignId copy$default(ActionBannerWithCampaignId actionBannerWithCampaignId, RewardsActionBannerData rewardsActionBannerData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            rewardsActionBannerData = actionBannerWithCampaignId.actionBannerData;
        }
        if ((i2 & 2) != 0) {
            i = actionBannerWithCampaignId.campaignId;
        }
        return actionBannerWithCampaignId.copy(rewardsActionBannerData, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RewardsActionBannerData getActionBannerData() {
        return this.actionBannerData;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    @NotNull
    public final ActionBannerWithCampaignId copy(@NotNull RewardsActionBannerData actionBannerData, int campaignId) {
        Intrinsics.h(actionBannerData, "actionBannerData");
        return new ActionBannerWithCampaignId(actionBannerData, campaignId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionBannerWithCampaignId)) {
            return false;
        }
        ActionBannerWithCampaignId actionBannerWithCampaignId = (ActionBannerWithCampaignId) other;
        return Intrinsics.c(this.actionBannerData, actionBannerWithCampaignId.actionBannerData) && this.campaignId == actionBannerWithCampaignId.campaignId;
    }

    @NotNull
    public final RewardsActionBannerData getActionBannerData() {
        return this.actionBannerData;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public int hashCode() {
        return Integer.hashCode(this.campaignId) + (this.actionBannerData.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ActionBannerWithCampaignId(actionBannerData=" + this.actionBannerData + ", campaignId=" + this.campaignId + ")";
    }
}
