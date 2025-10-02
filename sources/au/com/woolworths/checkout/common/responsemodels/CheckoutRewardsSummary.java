package au.com.woolworths.checkout.common.responsemodels;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutRewardsSummary;", "", "wowRewardsToSpend", "", "wowRewardsEarned", "isWowRewardsCardRegistered", "", "isErrorInGettingWowRewardsBalance", "hasValidWowRewardsCard", "<init>", "(FFZZZ)V", "getWowRewardsToSpend", "()F", "getWowRewardsEarned", "()Z", "getHasValidWowRewardsCard", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutRewardsSummary {

    @SerializedName("HasValidWowRewardsCard")
    private final boolean hasValidWowRewardsCard;

    @SerializedName("IsErrorInGettingWowRewardsBalance")
    private final boolean isErrorInGettingWowRewardsBalance;

    @SerializedName("IsWowRewardsCardRegistered")
    private final boolean isWowRewardsCardRegistered;

    @SerializedName("WowRewardsEarned")
    private final float wowRewardsEarned;

    @SerializedName("WowRewardsToSpend")
    private final float wowRewardsToSpend;

    public CheckoutRewardsSummary(float f, float f2, boolean z, boolean z2, boolean z3) {
        this.wowRewardsToSpend = f;
        this.wowRewardsEarned = f2;
        this.isWowRewardsCardRegistered = z;
        this.isErrorInGettingWowRewardsBalance = z2;
        this.hasValidWowRewardsCard = z3;
    }

    public static /* synthetic */ CheckoutRewardsSummary copy$default(CheckoutRewardsSummary checkoutRewardsSummary, float f, float f2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = checkoutRewardsSummary.wowRewardsToSpend;
        }
        if ((i & 2) != 0) {
            f2 = checkoutRewardsSummary.wowRewardsEarned;
        }
        if ((i & 4) != 0) {
            z = checkoutRewardsSummary.isWowRewardsCardRegistered;
        }
        if ((i & 8) != 0) {
            z2 = checkoutRewardsSummary.isErrorInGettingWowRewardsBalance;
        }
        if ((i & 16) != 0) {
            z3 = checkoutRewardsSummary.hasValidWowRewardsCard;
        }
        boolean z4 = z3;
        boolean z5 = z;
        return checkoutRewardsSummary.copy(f, f2, z5, z2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final float getWowRewardsToSpend() {
        return this.wowRewardsToSpend;
    }

    /* renamed from: component2, reason: from getter */
    public final float getWowRewardsEarned() {
        return this.wowRewardsEarned;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsWowRewardsCardRegistered() {
        return this.isWowRewardsCardRegistered;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsErrorInGettingWowRewardsBalance() {
        return this.isErrorInGettingWowRewardsBalance;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasValidWowRewardsCard() {
        return this.hasValidWowRewardsCard;
    }

    @NotNull
    public final CheckoutRewardsSummary copy(float wowRewardsToSpend, float wowRewardsEarned, boolean isWowRewardsCardRegistered, boolean isErrorInGettingWowRewardsBalance, boolean hasValidWowRewardsCard) {
        return new CheckoutRewardsSummary(wowRewardsToSpend, wowRewardsEarned, isWowRewardsCardRegistered, isErrorInGettingWowRewardsBalance, hasValidWowRewardsCard);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutRewardsSummary)) {
            return false;
        }
        CheckoutRewardsSummary checkoutRewardsSummary = (CheckoutRewardsSummary) other;
        return Float.compare(this.wowRewardsToSpend, checkoutRewardsSummary.wowRewardsToSpend) == 0 && Float.compare(this.wowRewardsEarned, checkoutRewardsSummary.wowRewardsEarned) == 0 && this.isWowRewardsCardRegistered == checkoutRewardsSummary.isWowRewardsCardRegistered && this.isErrorInGettingWowRewardsBalance == checkoutRewardsSummary.isErrorInGettingWowRewardsBalance && this.hasValidWowRewardsCard == checkoutRewardsSummary.hasValidWowRewardsCard;
    }

    public final boolean getHasValidWowRewardsCard() {
        return this.hasValidWowRewardsCard;
    }

    public final float getWowRewardsEarned() {
        return this.wowRewardsEarned;
    }

    public final float getWowRewardsToSpend() {
        return this.wowRewardsToSpend;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasValidWowRewardsCard) + b.e(b.e(a.b(this.wowRewardsEarned, Float.hashCode(this.wowRewardsToSpend) * 31, 31), 31, this.isWowRewardsCardRegistered), 31, this.isErrorInGettingWowRewardsBalance);
    }

    public final boolean isErrorInGettingWowRewardsBalance() {
        return this.isErrorInGettingWowRewardsBalance;
    }

    public final boolean isWowRewardsCardRegistered() {
        return this.isWowRewardsCardRegistered;
    }

    @NotNull
    public String toString() {
        float f = this.wowRewardsToSpend;
        float f2 = this.wowRewardsEarned;
        boolean z = this.isWowRewardsCardRegistered;
        boolean z2 = this.isErrorInGettingWowRewardsBalance;
        boolean z3 = this.hasValidWowRewardsCard;
        StringBuilder sb = new StringBuilder("CheckoutRewardsSummary(wowRewardsToSpend=");
        sb.append(f);
        sb.append(", wowRewardsEarned=");
        sb.append(f2);
        sb.append(", isWowRewardsCardRegistered=");
        au.com.woolworths.android.onesite.a.D(sb, z, ", isErrorInGettingWowRewardsBalance=", z2, ", hasValidWowRewardsCard=");
        return YU.a.k(")", sb, z3);
    }
}
