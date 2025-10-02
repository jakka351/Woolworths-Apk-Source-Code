package au.com.woolworths.android.onesite.models.trolley;

import androidx.compose.ui.input.pointer.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/android/onesite/models/trolley/UpdateRedemptionSettingsData;", "", "isUserRedeeming", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UpdateRedemptionSettingsData {

    @SerializedName("isRedeemingRewardsCredits")
    private final boolean isUserRedeeming;

    public UpdateRedemptionSettingsData(boolean z) {
        this.isUserRedeeming = z;
    }

    public static /* synthetic */ UpdateRedemptionSettingsData copy$default(UpdateRedemptionSettingsData updateRedemptionSettingsData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = updateRedemptionSettingsData.isUserRedeeming;
        }
        return updateRedemptionSettingsData.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsUserRedeeming() {
        return this.isUserRedeeming;
    }

    @NotNull
    public final UpdateRedemptionSettingsData copy(boolean isUserRedeeming) {
        return new UpdateRedemptionSettingsData(isUserRedeeming);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpdateRedemptionSettingsData) && this.isUserRedeeming == ((UpdateRedemptionSettingsData) other).isUserRedeeming;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isUserRedeeming);
    }

    public final boolean isUserRedeeming() {
        return this.isUserRedeeming;
    }

    @NotNull
    public String toString() {
        return a.n("UpdateRedemptionSettingsData(isUserRedeeming=", ")", this.isUserRedeeming);
    }
}
