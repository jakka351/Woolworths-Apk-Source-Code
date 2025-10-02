package au.com.woolworths.checkout.common.responsemodels;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutLoyalty;", "", "points", "", "saveForLaterPreference", "redeemNowEnabled", "", "wowRewardsRedeemMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getPoints", "()Ljava/lang/String;", "getSaveForLaterPreference", "getRedeemNowEnabled", "()Z", "getWowRewardsRedeemMessage", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutLoyalty {

    @SerializedName("Points")
    @NotNull
    private final String points;

    @SerializedName("RedeemNowEnabled")
    private final boolean redeemNowEnabled;

    @SerializedName("SaveForLaterPreference")
    @Nullable
    private final String saveForLaterPreference;

    @SerializedName("WowRewardsRedeemMessage")
    @NotNull
    private final String wowRewardsRedeemMessage;

    public CheckoutLoyalty(@NotNull String points, @Nullable String str, boolean z, @NotNull String wowRewardsRedeemMessage) {
        Intrinsics.h(points, "points");
        Intrinsics.h(wowRewardsRedeemMessage, "wowRewardsRedeemMessage");
        this.points = points;
        this.saveForLaterPreference = str;
        this.redeemNowEnabled = z;
        this.wowRewardsRedeemMessage = wowRewardsRedeemMessage;
    }

    public static /* synthetic */ CheckoutLoyalty copy$default(CheckoutLoyalty checkoutLoyalty, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLoyalty.points;
        }
        if ((i & 2) != 0) {
            str2 = checkoutLoyalty.saveForLaterPreference;
        }
        if ((i & 4) != 0) {
            z = checkoutLoyalty.redeemNowEnabled;
        }
        if ((i & 8) != 0) {
            str3 = checkoutLoyalty.wowRewardsRedeemMessage;
        }
        return checkoutLoyalty.copy(str, str2, z, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSaveForLaterPreference() {
        return this.saveForLaterPreference;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRedeemNowEnabled() {
        return this.redeemNowEnabled;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getWowRewardsRedeemMessage() {
        return this.wowRewardsRedeemMessage;
    }

    @NotNull
    public final CheckoutLoyalty copy(@NotNull String points, @Nullable String saveForLaterPreference, boolean redeemNowEnabled, @NotNull String wowRewardsRedeemMessage) {
        Intrinsics.h(points, "points");
        Intrinsics.h(wowRewardsRedeemMessage, "wowRewardsRedeemMessage");
        return new CheckoutLoyalty(points, saveForLaterPreference, redeemNowEnabled, wowRewardsRedeemMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutLoyalty)) {
            return false;
        }
        CheckoutLoyalty checkoutLoyalty = (CheckoutLoyalty) other;
        return Intrinsics.c(this.points, checkoutLoyalty.points) && Intrinsics.c(this.saveForLaterPreference, checkoutLoyalty.saveForLaterPreference) && this.redeemNowEnabled == checkoutLoyalty.redeemNowEnabled && Intrinsics.c(this.wowRewardsRedeemMessage, checkoutLoyalty.wowRewardsRedeemMessage);
    }

    @NotNull
    public final String getPoints() {
        return this.points;
    }

    public final boolean getRedeemNowEnabled() {
        return this.redeemNowEnabled;
    }

    @Nullable
    public final String getSaveForLaterPreference() {
        return this.saveForLaterPreference;
    }

    @NotNull
    public final String getWowRewardsRedeemMessage() {
        return this.wowRewardsRedeemMessage;
    }

    public int hashCode() {
        int iHashCode = this.points.hashCode() * 31;
        String str = this.saveForLaterPreference;
        return this.wowRewardsRedeemMessage.hashCode() + b.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.redeemNowEnabled);
    }

    @NotNull
    public String toString() {
        String str = this.points;
        String str2 = this.saveForLaterPreference;
        boolean z = this.redeemNowEnabled;
        String str3 = this.wowRewardsRedeemMessage;
        StringBuilder sbV = a.v("CheckoutLoyalty(points=", str, ", saveForLaterPreference=", str2, ", redeemNowEnabled=");
        sbV.append(z);
        sbV.append(", wowRewardsRedeemMessage=");
        sbV.append(str3);
        sbV.append(")");
        return sbV.toString();
    }
}
