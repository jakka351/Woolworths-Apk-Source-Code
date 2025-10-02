package au.com.woolworths.rewards.base.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsCoachMark;", "", TextBundle.TEXT_ENTRY, "", "anchor", "Lau/com/woolworths/rewards/base/data/RewardsCoachMarkAnchor;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/rewards/base/data/RewardsCoachMarkAnchor;)V", "getText", "()Ljava/lang/String;", "getAnchor", "()Lau/com/woolworths/rewards/base/data/RewardsCoachMarkAnchor;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsCoachMark {
    public static final int $stable = 0;

    @SerializedName("anchor")
    @NotNull
    private final RewardsCoachMarkAnchor anchor;

    @SerializedName(TextBundle.TEXT_ENTRY)
    @NotNull
    private final String text;

    public RewardsCoachMark(@NotNull String text, @NotNull RewardsCoachMarkAnchor anchor) {
        Intrinsics.h(text, "text");
        Intrinsics.h(anchor, "anchor");
        this.text = text;
        this.anchor = anchor;
    }

    public static /* synthetic */ RewardsCoachMark copy$default(RewardsCoachMark rewardsCoachMark, String str, RewardsCoachMarkAnchor rewardsCoachMarkAnchor, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsCoachMark.text;
        }
        if ((i & 2) != 0) {
            rewardsCoachMarkAnchor = rewardsCoachMark.anchor;
        }
        return rewardsCoachMark.copy(str, rewardsCoachMarkAnchor);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RewardsCoachMarkAnchor getAnchor() {
        return this.anchor;
    }

    @NotNull
    public final RewardsCoachMark copy(@NotNull String text, @NotNull RewardsCoachMarkAnchor anchor) {
        Intrinsics.h(text, "text");
        Intrinsics.h(anchor, "anchor");
        return new RewardsCoachMark(text, anchor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsCoachMark)) {
            return false;
        }
        RewardsCoachMark rewardsCoachMark = (RewardsCoachMark) other;
        return Intrinsics.c(this.text, rewardsCoachMark.text) && this.anchor == rewardsCoachMark.anchor;
    }

    @NotNull
    public final RewardsCoachMarkAnchor getAnchor() {
        return this.anchor;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.anchor.hashCode() + (this.text.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RewardsCoachMark(text=" + this.text + ", anchor=" + this.anchor + ")";
    }
}
