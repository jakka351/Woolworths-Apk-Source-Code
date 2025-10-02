package au.com.woolworths.base.rewards.account.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingCta;", "", "iconUrl", "", "cta", "Lau/com/woolworths/android/onesite/data/ContentCta;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;)V", "getIconUrl", "()Ljava/lang/String;", "getCta", "()Lau/com/woolworths/android/onesite/data/ContentCta;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsRedemptionSettingCta {
    public static final int $stable = 8;

    @SerializedName("cta")
    @NotNull
    private final ContentCta cta;

    @SerializedName("iconUrl")
    @NotNull
    private final String iconUrl;

    public RewardsRedemptionSettingCta(@NotNull String iconUrl, @NotNull ContentCta cta) {
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(cta, "cta");
        this.iconUrl = iconUrl;
        this.cta = cta;
    }

    public static /* synthetic */ RewardsRedemptionSettingCta copy$default(RewardsRedemptionSettingCta rewardsRedemptionSettingCta, String str, ContentCta contentCta, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsRedemptionSettingCta.iconUrl;
        }
        if ((i & 2) != 0) {
            contentCta = rewardsRedemptionSettingCta.cta;
        }
        return rewardsRedemptionSettingCta.copy(str, contentCta);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ContentCta getCta() {
        return this.cta;
    }

    @NotNull
    public final RewardsRedemptionSettingCta copy(@NotNull String iconUrl, @NotNull ContentCta cta) {
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(cta, "cta");
        return new RewardsRedemptionSettingCta(iconUrl, cta);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsRedemptionSettingCta)) {
            return false;
        }
        RewardsRedemptionSettingCta rewardsRedemptionSettingCta = (RewardsRedemptionSettingCta) other;
        return Intrinsics.c(this.iconUrl, rewardsRedemptionSettingCta.iconUrl) && Intrinsics.c(this.cta, rewardsRedemptionSettingCta.cta);
    }

    @NotNull
    public final ContentCta getCta() {
        return this.cta;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public int hashCode() {
        return this.cta.hashCode() + (this.iconUrl.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RewardsRedemptionSettingCta(iconUrl=" + this.iconUrl + ", cta=" + this.cta + ")";
    }
}
