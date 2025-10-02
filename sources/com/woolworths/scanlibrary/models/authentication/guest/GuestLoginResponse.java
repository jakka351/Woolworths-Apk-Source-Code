package com.woolworths.scanlibrary.models.authentication.guest;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0013\"\u0004\b\u0016\u0010\u0015R\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006&"}, d2 = {"Lcom/woolworths/scanlibrary/models/authentication/guest/GuestLoginResponse;", "", "accessToken", "", "refreshToken", "istncaccepted", "", "isPaymentAdded", "isRewardsAvailable", "banner", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "getRefreshToken", "setRefreshToken", "getIstncaccepted", "()Z", "setIstncaccepted", "(Z)V", "setPaymentAdded", "setRewardsAvailable", "getBanner", "setBanner", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GuestLoginResponse {
    public static final int $stable = 8;

    @SerializedName("access_token")
    @NotNull
    private String accessToken;

    @SerializedName("banner")
    @NotNull
    private String banner;

    @SerializedName("ispaymentadded")
    private boolean isPaymentAdded;

    @SerializedName("isrewardsavailable")
    private boolean isRewardsAvailable;

    @SerializedName("istncaccepted")
    private boolean istncaccepted;

    @SerializedName("refresh_token")
    @NotNull
    private String refreshToken;

    public GuestLoginResponse(@NotNull String accessToken, @NotNull String refreshToken, boolean z, boolean z2, boolean z3, @NotNull String banner) {
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(refreshToken, "refreshToken");
        Intrinsics.h(banner, "banner");
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.istncaccepted = z;
        this.isPaymentAdded = z2;
        this.isRewardsAvailable = z3;
        this.banner = banner;
    }

    public static /* synthetic */ GuestLoginResponse copy$default(GuestLoginResponse guestLoginResponse, String str, String str2, boolean z, boolean z2, boolean z3, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = guestLoginResponse.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = guestLoginResponse.refreshToken;
        }
        if ((i & 4) != 0) {
            z = guestLoginResponse.istncaccepted;
        }
        if ((i & 8) != 0) {
            z2 = guestLoginResponse.isPaymentAdded;
        }
        if ((i & 16) != 0) {
            z3 = guestLoginResponse.isRewardsAvailable;
        }
        if ((i & 32) != 0) {
            str3 = guestLoginResponse.banner;
        }
        boolean z4 = z3;
        String str4 = str3;
        return guestLoginResponse.copy(str, str2, z, z2, z4, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIstncaccepted() {
        return this.istncaccepted;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPaymentAdded() {
        return this.isPaymentAdded;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsRewardsAvailable() {
        return this.isRewardsAvailable;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getBanner() {
        return this.banner;
    }

    @NotNull
    public final GuestLoginResponse copy(@NotNull String accessToken, @NotNull String refreshToken, boolean istncaccepted, boolean isPaymentAdded, boolean isRewardsAvailable, @NotNull String banner) {
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(refreshToken, "refreshToken");
        Intrinsics.h(banner, "banner");
        return new GuestLoginResponse(accessToken, refreshToken, istncaccepted, isPaymentAdded, isRewardsAvailable, banner);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuestLoginResponse)) {
            return false;
        }
        GuestLoginResponse guestLoginResponse = (GuestLoginResponse) other;
        return Intrinsics.c(this.accessToken, guestLoginResponse.accessToken) && Intrinsics.c(this.refreshToken, guestLoginResponse.refreshToken) && this.istncaccepted == guestLoginResponse.istncaccepted && this.isPaymentAdded == guestLoginResponse.isPaymentAdded && this.isRewardsAvailable == guestLoginResponse.isRewardsAvailable && Intrinsics.c(this.banner, guestLoginResponse.banner);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final String getBanner() {
        return this.banner;
    }

    public final boolean getIstncaccepted() {
        return this.istncaccepted;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        return this.banner.hashCode() + b.e(b.e(b.e(b.c(this.accessToken.hashCode() * 31, 31, this.refreshToken), 31, this.istncaccepted), 31, this.isPaymentAdded), 31, this.isRewardsAvailable);
    }

    public final boolean isPaymentAdded() {
        return this.isPaymentAdded;
    }

    public final boolean isRewardsAvailable() {
        return this.isRewardsAvailable;
    }

    public final void setAccessToken(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.accessToken = str;
    }

    public final void setBanner(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.banner = str;
    }

    public final void setIstncaccepted(boolean z) {
        this.istncaccepted = z;
    }

    public final void setPaymentAdded(boolean z) {
        this.isPaymentAdded = z;
    }

    public final void setRefreshToken(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.refreshToken = str;
    }

    public final void setRewardsAvailable(boolean z) {
        this.isRewardsAvailable = z;
    }

    @NotNull
    public String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        boolean z = this.istncaccepted;
        boolean z2 = this.isPaymentAdded;
        boolean z3 = this.isRewardsAvailable;
        String str3 = this.banner;
        StringBuilder sbV = a.v("GuestLoginResponse(accessToken=", str, ", refreshToken=", str2, ", istncaccepted=");
        au.com.woolworths.android.onesite.a.D(sbV, z, ", isPaymentAdded=", z2, ", isRewardsAvailable=");
        sbV.append(z3);
        sbV.append(", banner=");
        sbV.append(str3);
        sbV.append(")");
        return sbV.toString();
    }
}
