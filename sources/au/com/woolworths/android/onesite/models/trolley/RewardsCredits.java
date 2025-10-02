package au.com.woolworths.android.onesite.models.trolley;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006 "}, d2 = {"Lau/com/woolworths/android/onesite/models/trolley/RewardsCredits;", "", AnnotatedPrivateKey.LABEL, "", "iconUrl", "creditsInfo", "Lau/com/woolworths/android/onesite/models/trolley/RewardsCreditsInfo;", "isRedemptionEnabled", "", "isUserRedeemingCredits", "redemptionToggleLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/models/trolley/RewardsCreditsInfo;ZZLjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getIconUrl", "getCreditsInfo", "()Lau/com/woolworths/android/onesite/models/trolley/RewardsCreditsInfo;", "()Z", "getRedemptionToggleLabel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsCredits {

    @SerializedName("info")
    @NotNull
    private final RewardsCreditsInfo creditsInfo;

    @SerializedName("image")
    @NotNull
    private final String iconUrl;

    @SerializedName("isrewardscreditsenabled")
    private final boolean isRedemptionEnabled;

    @SerializedName("isredeemingrewardscredits")
    private final boolean isUserRedeemingCredits;

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @NotNull
    private final String label;

    @SerializedName("toggletext")
    @NotNull
    private final String redemptionToggleLabel;

    public RewardsCredits(@NotNull String label, @NotNull String iconUrl, @NotNull RewardsCreditsInfo creditsInfo, boolean z, boolean z2, @NotNull String redemptionToggleLabel) {
        Intrinsics.h(label, "label");
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(creditsInfo, "creditsInfo");
        Intrinsics.h(redemptionToggleLabel, "redemptionToggleLabel");
        this.label = label;
        this.iconUrl = iconUrl;
        this.creditsInfo = creditsInfo;
        this.isRedemptionEnabled = z;
        this.isUserRedeemingCredits = z2;
        this.redemptionToggleLabel = redemptionToggleLabel;
    }

    public static /* synthetic */ RewardsCredits copy$default(RewardsCredits rewardsCredits, String str, String str2, RewardsCreditsInfo rewardsCreditsInfo, boolean z, boolean z2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsCredits.label;
        }
        if ((i & 2) != 0) {
            str2 = rewardsCredits.iconUrl;
        }
        if ((i & 4) != 0) {
            rewardsCreditsInfo = rewardsCredits.creditsInfo;
        }
        if ((i & 8) != 0) {
            z = rewardsCredits.isRedemptionEnabled;
        }
        if ((i & 16) != 0) {
            z2 = rewardsCredits.isUserRedeemingCredits;
        }
        if ((i & 32) != 0) {
            str3 = rewardsCredits.redemptionToggleLabel;
        }
        boolean z3 = z2;
        String str4 = str3;
        return rewardsCredits.copy(str, str2, rewardsCreditsInfo, z, z3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RewardsCreditsInfo getCreditsInfo() {
        return this.creditsInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsRedemptionEnabled() {
        return this.isRedemptionEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsUserRedeemingCredits() {
        return this.isUserRedeemingCredits;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getRedemptionToggleLabel() {
        return this.redemptionToggleLabel;
    }

    @NotNull
    public final RewardsCredits copy(@NotNull String label, @NotNull String iconUrl, @NotNull RewardsCreditsInfo creditsInfo, boolean isRedemptionEnabled, boolean isUserRedeemingCredits, @NotNull String redemptionToggleLabel) {
        Intrinsics.h(label, "label");
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(creditsInfo, "creditsInfo");
        Intrinsics.h(redemptionToggleLabel, "redemptionToggleLabel");
        return new RewardsCredits(label, iconUrl, creditsInfo, isRedemptionEnabled, isUserRedeemingCredits, redemptionToggleLabel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsCredits)) {
            return false;
        }
        RewardsCredits rewardsCredits = (RewardsCredits) other;
        return Intrinsics.c(this.label, rewardsCredits.label) && Intrinsics.c(this.iconUrl, rewardsCredits.iconUrl) && Intrinsics.c(this.creditsInfo, rewardsCredits.creditsInfo) && this.isRedemptionEnabled == rewardsCredits.isRedemptionEnabled && this.isUserRedeemingCredits == rewardsCredits.isUserRedeemingCredits && Intrinsics.c(this.redemptionToggleLabel, rewardsCredits.redemptionToggleLabel);
    }

    @NotNull
    public final RewardsCreditsInfo getCreditsInfo() {
        return this.creditsInfo;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final String getRedemptionToggleLabel() {
        return this.redemptionToggleLabel;
    }

    public int hashCode() {
        return this.redemptionToggleLabel.hashCode() + b.e(b.e((this.creditsInfo.hashCode() + b.c(this.label.hashCode() * 31, 31, this.iconUrl)) * 31, 31, this.isRedemptionEnabled), 31, this.isUserRedeemingCredits);
    }

    public final boolean isRedemptionEnabled() {
        return this.isRedemptionEnabled;
    }

    public final boolean isUserRedeemingCredits() {
        return this.isUserRedeemingCredits;
    }

    @NotNull
    public String toString() {
        String str = this.label;
        String str2 = this.iconUrl;
        RewardsCreditsInfo rewardsCreditsInfo = this.creditsInfo;
        boolean z = this.isRedemptionEnabled;
        boolean z2 = this.isUserRedeemingCredits;
        String str3 = this.redemptionToggleLabel;
        StringBuilder sbV = a.v("RewardsCredits(label=", str, ", iconUrl=", str2, ", creditsInfo=");
        sbV.append(rewardsCreditsInfo);
        sbV.append(", isRedemptionEnabled=");
        sbV.append(z);
        sbV.append(", isUserRedeemingCredits=");
        sbV.append(z2);
        sbV.append(", redemptionToggleLabel=");
        sbV.append(str3);
        sbV.append(")");
        return sbV.toString();
    }
}
