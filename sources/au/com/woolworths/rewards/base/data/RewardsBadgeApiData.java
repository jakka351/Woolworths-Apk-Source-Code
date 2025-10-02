package au.com.woolworths.rewards.base.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsBadgeApiData;", "", AnnotatedPrivateKey.LABEL, "", "type", "Lau/com/woolworths/rewards/base/data/RewardsBadgeTypeApiData;", "altText", "<init>", "(Ljava/lang/String;Lau/com/woolworths/rewards/base/data/RewardsBadgeTypeApiData;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getType", "()Lau/com/woolworths/rewards/base/data/RewardsBadgeTypeApiData;", "getAltText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsBadgeApiData {
    public static final int $stable = 0;

    @Nullable
    private final String altText;

    @NotNull
    private final String label;

    @NotNull
    private final RewardsBadgeTypeApiData type;

    public RewardsBadgeApiData(@NotNull String label, @NotNull RewardsBadgeTypeApiData type, @Nullable String str) {
        Intrinsics.h(label, "label");
        Intrinsics.h(type, "type");
        this.label = label;
        this.type = type;
        this.altText = str;
    }

    public static /* synthetic */ RewardsBadgeApiData copy$default(RewardsBadgeApiData rewardsBadgeApiData, String str, RewardsBadgeTypeApiData rewardsBadgeTypeApiData, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsBadgeApiData.label;
        }
        if ((i & 2) != 0) {
            rewardsBadgeTypeApiData = rewardsBadgeApiData.type;
        }
        if ((i & 4) != 0) {
            str2 = rewardsBadgeApiData.altText;
        }
        return rewardsBadgeApiData.copy(str, rewardsBadgeTypeApiData, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RewardsBadgeTypeApiData getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    @NotNull
    public final RewardsBadgeApiData copy(@NotNull String label, @NotNull RewardsBadgeTypeApiData type, @Nullable String altText) {
        Intrinsics.h(label, "label");
        Intrinsics.h(type, "type");
        return new RewardsBadgeApiData(label, type, altText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsBadgeApiData)) {
            return false;
        }
        RewardsBadgeApiData rewardsBadgeApiData = (RewardsBadgeApiData) other;
        return Intrinsics.c(this.label, rewardsBadgeApiData.label) && this.type == rewardsBadgeApiData.type && Intrinsics.c(this.altText, rewardsBadgeApiData.altText);
    }

    @Nullable
    public final String getAltText() {
        return this.altText;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final RewardsBadgeTypeApiData getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (this.label.hashCode() * 31)) * 31;
        String str = this.altText;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.label;
        RewardsBadgeTypeApiData rewardsBadgeTypeApiData = this.type;
        String str2 = this.altText;
        StringBuilder sb = new StringBuilder("RewardsBadgeApiData(label=");
        sb.append(str);
        sb.append(", type=");
        sb.append(rewardsBadgeTypeApiData);
        sb.append(", altText=");
        return a.o(sb, str2, ")");
    }

    public /* synthetic */ RewardsBadgeApiData(String str, RewardsBadgeTypeApiData rewardsBadgeTypeApiData, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rewardsBadgeTypeApiData, (i & 4) != 0 ? null : str2);
    }
}
