package au.com.woolworths.scanandgo.data;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001bR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006/"}, d2 = {"Lau/com/woolworths/scanandgo/data/ScanAndGoUserData;", "", "accessToken", "", "refreshToken", "expiresIn", "refreshTokenExpiresIn", Scopes.EMAIL, "rewardsCardNumber", "firstName", "lastName", "isTncAccepted", "", "isPaymentAdded", "isRewardsAvailable", "banner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken", "getExpiresIn", "getRefreshTokenExpiresIn", "getEmail", "getRewardsCardNumber", "getFirstName", "getLastName", "()Z", "getBanner", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "shop-scan-and-go_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
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

    public static /* synthetic */ ScanAndGoUserData copy$default(ScanAndGoUserData scanAndGoUserData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scanAndGoUserData.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = scanAndGoUserData.refreshToken;
        }
        if ((i & 4) != 0) {
            str3 = scanAndGoUserData.expiresIn;
        }
        if ((i & 8) != 0) {
            str4 = scanAndGoUserData.refreshTokenExpiresIn;
        }
        if ((i & 16) != 0) {
            str5 = scanAndGoUserData.email;
        }
        if ((i & 32) != 0) {
            str6 = scanAndGoUserData.rewardsCardNumber;
        }
        if ((i & 64) != 0) {
            str7 = scanAndGoUserData.firstName;
        }
        if ((i & 128) != 0) {
            str8 = scanAndGoUserData.lastName;
        }
        if ((i & 256) != 0) {
            z = scanAndGoUserData.isTncAccepted;
        }
        if ((i & 512) != 0) {
            z2 = scanAndGoUserData.isPaymentAdded;
        }
        if ((i & 1024) != 0) {
            z3 = scanAndGoUserData.isRewardsAvailable;
        }
        if ((i & 2048) != 0) {
            str9 = scanAndGoUserData.banner;
        }
        boolean z4 = z3;
        String str10 = str9;
        boolean z5 = z;
        boolean z6 = z2;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        return scanAndGoUserData.copy(str, str2, str3, str4, str13, str14, str11, str12, z5, z6, z4, str10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsPaymentAdded() {
        return this.isPaymentAdded;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsRewardsAvailable() {
        return this.isRewardsAvailable;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getBanner() {
        return this.banner;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getExpiresIn() {
        return this.expiresIn;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getRefreshTokenExpiresIn() {
        return this.refreshTokenExpiresIn;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getRewardsCardNumber() {
        return this.rewardsCardNumber;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsTncAccepted() {
        return this.isTncAccepted;
    }

    @NotNull
    public final ScanAndGoUserData copy(@NotNull String accessToken, @NotNull String refreshToken, @NotNull String expiresIn, @NotNull String refreshTokenExpiresIn, @NotNull String email, @NotNull String rewardsCardNumber, @NotNull String firstName, @NotNull String lastName, boolean isTncAccepted, boolean isPaymentAdded, boolean isRewardsAvailable, @NotNull String banner) {
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(refreshToken, "refreshToken");
        Intrinsics.h(expiresIn, "expiresIn");
        Intrinsics.h(refreshTokenExpiresIn, "refreshTokenExpiresIn");
        Intrinsics.h(email, "email");
        Intrinsics.h(rewardsCardNumber, "rewardsCardNumber");
        Intrinsics.h(firstName, "firstName");
        Intrinsics.h(lastName, "lastName");
        Intrinsics.h(banner, "banner");
        return new ScanAndGoUserData(accessToken, refreshToken, expiresIn, refreshTokenExpiresIn, email, rewardsCardNumber, firstName, lastName, isTncAccepted, isPaymentAdded, isRewardsAvailable, banner);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScanAndGoUserData)) {
            return false;
        }
        ScanAndGoUserData scanAndGoUserData = (ScanAndGoUserData) other;
        return Intrinsics.c(this.accessToken, scanAndGoUserData.accessToken) && Intrinsics.c(this.refreshToken, scanAndGoUserData.refreshToken) && Intrinsics.c(this.expiresIn, scanAndGoUserData.expiresIn) && Intrinsics.c(this.refreshTokenExpiresIn, scanAndGoUserData.refreshTokenExpiresIn) && Intrinsics.c(this.email, scanAndGoUserData.email) && Intrinsics.c(this.rewardsCardNumber, scanAndGoUserData.rewardsCardNumber) && Intrinsics.c(this.firstName, scanAndGoUserData.firstName) && Intrinsics.c(this.lastName, scanAndGoUserData.lastName) && this.isTncAccepted == scanAndGoUserData.isTncAccepted && this.isPaymentAdded == scanAndGoUserData.isPaymentAdded && this.isRewardsAvailable == scanAndGoUserData.isRewardsAvailable && Intrinsics.c(this.banner, scanAndGoUserData.banner);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final String getBanner() {
        return this.banner;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getExpiresIn() {
        return this.expiresIn;
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @NotNull
    public final String getRefreshTokenExpiresIn() {
        return this.refreshTokenExpiresIn;
    }

    @NotNull
    public final String getRewardsCardNumber() {
        return this.rewardsCardNumber;
    }

    public int hashCode() {
        return this.banner.hashCode() + b.e(b.e(b.e(b.c(b.c(b.c(b.c(b.c(b.c(b.c(this.accessToken.hashCode() * 31, 31, this.refreshToken), 31, this.expiresIn), 31, this.refreshTokenExpiresIn), 31, this.email), 31, this.rewardsCardNumber), 31, this.firstName), 31, this.lastName), 31, this.isTncAccepted), 31, this.isPaymentAdded), 31, this.isRewardsAvailable);
    }

    public final boolean isPaymentAdded() {
        return this.isPaymentAdded;
    }

    public final boolean isRewardsAvailable() {
        return this.isRewardsAvailable;
    }

    public final boolean isTncAccepted() {
        return this.isTncAccepted;
    }

    @NotNull
    public String toString() {
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
