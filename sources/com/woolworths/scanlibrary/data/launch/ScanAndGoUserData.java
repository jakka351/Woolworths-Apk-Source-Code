package com.woolworths.scanlibrary.data.launch;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\r\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Lcom/woolworths/scanlibrary/data/launch/ScanAndGoUserData;", "", "", "accessToken", "refreshToken", "expiresIn", "refreshTokenExpiresIn", Scopes.EMAIL, "rewardsCardNumber", "firstName", "lastName", "", "isTncAccepted", "isPaymentAdded", "isRewardsAvailable", "banner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "h", "e", "getRefreshTokenExpiresIn", "d", "i", "f", "g", "Z", "k", "()Z", "j", "c", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ScanAndGoUserData {

    @SerializedName("accessToken")
    @NotNull
    private final String accessToken;

    @SerializedName("banner")
    @NotNull
    private final String banner;

    @SerializedName(Scopes.EMAIL)
    @NotNull
    private final String email;

    @SerializedName("expiresIn")
    @NotNull
    private final String expiresIn;

    @SerializedName("firstName")
    @NotNull
    private final String firstName;

    @SerializedName("isPaymentAdded")
    private final boolean isPaymentAdded;

    @SerializedName("isRewardsAvailable")
    private final boolean isRewardsAvailable;

    @SerializedName("isTncAccepted")
    private final boolean isTncAccepted;

    @SerializedName("lastName")
    @NotNull
    private final String lastName;

    @SerializedName("refreshToken")
    @NotNull
    private final String refreshToken;

    @SerializedName("refreshTokenExpiresIn")
    @NotNull
    private final String refreshTokenExpiresIn;

    @SerializedName("rewardsCardNumber")
    @NotNull
    private final String rewardsCardNumber;

    public ScanAndGoUserData(@NotNull String accessToken, @NotNull String refreshToken, @NotNull String expiresIn, @NotNull String refreshTokenExpiresIn, @NotNull String email, @NotNull String rewardsCardNumber, @NotNull String firstName, @NotNull String lastName, boolean z, boolean z2, boolean z3, @NotNull String banner) {
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(refreshToken, "refreshToken");
        Intrinsics.h(expiresIn, "expiresIn");
        Intrinsics.h(refreshTokenExpiresIn, "refreshTokenExpiresIn");
        Intrinsics.h(email, "email");
        Intrinsics.h(rewardsCardNumber, "rewardsCardNumber");
        Intrinsics.h(firstName, "firstName");
        Intrinsics.h(lastName, "lastName");
        Intrinsics.h(banner, "banner");
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expiresIn = expiresIn;
        this.refreshTokenExpiresIn = refreshTokenExpiresIn;
        this.email = email;
        this.rewardsCardNumber = rewardsCardNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isTncAccepted = z;
        this.isPaymentAdded = z2;
        this.isRewardsAvailable = z3;
        this.banner = banner;
    }

    public static ScanAndGoUserData a(ScanAndGoUserData scanAndGoUserData, String accessToken, String refreshToken) {
        String expiresIn = scanAndGoUserData.expiresIn;
        String refreshTokenExpiresIn = scanAndGoUserData.refreshTokenExpiresIn;
        String email = scanAndGoUserData.email;
        String rewardsCardNumber = scanAndGoUserData.rewardsCardNumber;
        String firstName = scanAndGoUserData.firstName;
        String lastName = scanAndGoUserData.lastName;
        boolean z = scanAndGoUserData.isTncAccepted;
        boolean z2 = scanAndGoUserData.isPaymentAdded;
        boolean z3 = scanAndGoUserData.isRewardsAvailable;
        String banner = scanAndGoUserData.banner;
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(refreshToken, "refreshToken");
        Intrinsics.h(expiresIn, "expiresIn");
        Intrinsics.h(refreshTokenExpiresIn, "refreshTokenExpiresIn");
        Intrinsics.h(email, "email");
        Intrinsics.h(rewardsCardNumber, "rewardsCardNumber");
        Intrinsics.h(firstName, "firstName");
        Intrinsics.h(lastName, "lastName");
        Intrinsics.h(banner, "banner");
        return new ScanAndGoUserData(accessToken, refreshToken, expiresIn, refreshTokenExpiresIn, email, rewardsCardNumber, firstName, lastName, z, z2, z3, banner);
    }

    /* renamed from: b, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: c, reason: from getter */
    public final String getBanner() {
        return this.banner;
    }

    /* renamed from: d, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: e, reason: from getter */
    public final String getExpiresIn() {
        return this.expiresIn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanAndGoUserData)) {
            return false;
        }
        ScanAndGoUserData scanAndGoUserData = (ScanAndGoUserData) obj;
        return Intrinsics.c(this.accessToken, scanAndGoUserData.accessToken) && Intrinsics.c(this.refreshToken, scanAndGoUserData.refreshToken) && Intrinsics.c(this.expiresIn, scanAndGoUserData.expiresIn) && Intrinsics.c(this.refreshTokenExpiresIn, scanAndGoUserData.refreshTokenExpiresIn) && Intrinsics.c(this.email, scanAndGoUserData.email) && Intrinsics.c(this.rewardsCardNumber, scanAndGoUserData.rewardsCardNumber) && Intrinsics.c(this.firstName, scanAndGoUserData.firstName) && Intrinsics.c(this.lastName, scanAndGoUserData.lastName) && this.isTncAccepted == scanAndGoUserData.isTncAccepted && this.isPaymentAdded == scanAndGoUserData.isPaymentAdded && this.isRewardsAvailable == scanAndGoUserData.isRewardsAvailable && Intrinsics.c(this.banner, scanAndGoUserData.banner);
    }

    /* renamed from: f, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: g, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: h, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final int hashCode() {
        return this.banner.hashCode() + b.e(b.e(b.e(b.c(b.c(b.c(b.c(b.c(b.c(b.c(this.accessToken.hashCode() * 31, 31, this.refreshToken), 31, this.expiresIn), 31, this.refreshTokenExpiresIn), 31, this.email), 31, this.rewardsCardNumber), 31, this.firstName), 31, this.lastName), 31, this.isTncAccepted), 31, this.isPaymentAdded), 31, this.isRewardsAvailable);
    }

    /* renamed from: i, reason: from getter */
    public final String getRewardsCardNumber() {
        return this.rewardsCardNumber;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsRewardsAvailable() {
        return this.isRewardsAvailable;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsTncAccepted() {
        return this.isTncAccepted;
    }

    public final String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        String str3 = this.expiresIn;
        String str4 = this.refreshTokenExpiresIn;
        String str5 = this.email;
        String str6 = this.rewardsCardNumber;
        String str7 = this.firstName;
        String str8 = this.lastName;
        boolean z = this.isTncAccepted;
        boolean z2 = this.isPaymentAdded;
        boolean z3 = this.isRewardsAvailable;
        String str9 = this.banner;
        StringBuilder sbV = a.v("ScanAndGoUserData(accessToken=", str, ", refreshToken=", str2, ", expiresIn=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", refreshTokenExpiresIn=", str4, ", email=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", rewardsCardNumber=", str6, ", firstName=");
        androidx.constraintlayout.core.state.a.B(sbV, str7, ", lastName=", str8, ", isTncAccepted=");
        au.com.woolworths.android.onesite.a.D(sbV, z, ", isPaymentAdded=", z2, ", isRewardsAvailable=");
        sbV.append(z3);
        sbV.append(", banner=");
        sbV.append(str9);
        sbV.append(")");
        return sbV.toString();
    }
}
