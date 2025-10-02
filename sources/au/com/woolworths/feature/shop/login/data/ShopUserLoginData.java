package au.com.woolworths.feature.shop.login.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsState;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b \u0010\u0015R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lau/com/woolworths/feature/shop/login/data/ShopUserLoginData;", "", "", "accessToken", "refreshToken", "expiresIn", "trolleyHref", "paymentHref", "shopperId", "firstName", Scopes.EMAIL, "dateOfBirth", "fulfilmentStoreId", "deliveryMethod", "rewardsCardNumber", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;", "rewardsState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;)V", "Ljava/lang/String;", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken", "getExpiresIn", "getTrolleyHref", "getPaymentHref", "getShopperId", "getFirstName", "getEmail", "getDateOfBirth", "getFulfilmentStoreId", "getDeliveryMethod", "getRewardsCardNumber", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;", "getRewardsState", "()Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;", "Companion", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShopUserLoginData {

    @SerializedName("access_token")
    @NotNull
    private final String accessToken;

    @SerializedName("dateofbirth")
    @NotNull
    private final String dateOfBirth;

    @SerializedName("deliverymethod")
    @NotNull
    private final String deliveryMethod;

    @SerializedName(Scopes.EMAIL)
    @NotNull
    private final String email;

    @SerializedName("expires_in")
    @NotNull
    private final String expiresIn;

    @SerializedName("firstname")
    @NotNull
    private final String firstName;

    @SerializedName("fulfilmentstoreid")
    @NotNull
    private final String fulfilmentStoreId;

    @SerializedName("paymenthref")
    @NotNull
    private final String paymentHref;

    @SerializedName("refresh_token")
    @NotNull
    private final String refreshToken;

    @SerializedName("rewardscardNumber")
    @Nullable
    private final String rewardsCardNumber;

    @SerializedName("rewardsState")
    @NotNull
    private final RewardsState rewardsState;

    @SerializedName("shopperid")
    @NotNull
    private final String shopperId;

    @SerializedName("trolleyhref")
    @NotNull
    private final String trolleyHref;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/login/data/ShopUserLoginData$Companion;", "", "", "DEFAULT_EXPIRY_MS", "J", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ShopUserLoginData(@NotNull String accessToken, @NotNull String refreshToken, @NotNull String expiresIn, @NotNull String trolleyHref, @NotNull String paymentHref, @NotNull String shopperId, @NotNull String firstName, @NotNull String email, @NotNull String dateOfBirth, @NotNull String fulfilmentStoreId, @NotNull String deliveryMethod, @Nullable String str, @NotNull RewardsState rewardsState) {
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(refreshToken, "refreshToken");
        Intrinsics.h(expiresIn, "expiresIn");
        Intrinsics.h(trolleyHref, "trolleyHref");
        Intrinsics.h(paymentHref, "paymentHref");
        Intrinsics.h(shopperId, "shopperId");
        Intrinsics.h(firstName, "firstName");
        Intrinsics.h(email, "email");
        Intrinsics.h(dateOfBirth, "dateOfBirth");
        Intrinsics.h(fulfilmentStoreId, "fulfilmentStoreId");
        Intrinsics.h(deliveryMethod, "deliveryMethod");
        Intrinsics.h(rewardsState, "rewardsState");
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expiresIn = expiresIn;
        this.trolleyHref = trolleyHref;
        this.paymentHref = paymentHref;
        this.shopperId = shopperId;
        this.firstName = firstName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.fulfilmentStoreId = fulfilmentStoreId;
        this.deliveryMethod = deliveryMethod;
        this.rewardsCardNumber = str;
        this.rewardsState = rewardsState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopUserLoginData)) {
            return false;
        }
        ShopUserLoginData shopUserLoginData = (ShopUserLoginData) obj;
        return Intrinsics.c(this.accessToken, shopUserLoginData.accessToken) && Intrinsics.c(this.refreshToken, shopUserLoginData.refreshToken) && Intrinsics.c(this.expiresIn, shopUserLoginData.expiresIn) && Intrinsics.c(this.trolleyHref, shopUserLoginData.trolleyHref) && Intrinsics.c(this.paymentHref, shopUserLoginData.paymentHref) && Intrinsics.c(this.shopperId, shopUserLoginData.shopperId) && Intrinsics.c(this.firstName, shopUserLoginData.firstName) && Intrinsics.c(this.email, shopUserLoginData.email) && Intrinsics.c(this.dateOfBirth, shopUserLoginData.dateOfBirth) && Intrinsics.c(this.fulfilmentStoreId, shopUserLoginData.fulfilmentStoreId) && Intrinsics.c(this.deliveryMethod, shopUserLoginData.deliveryMethod) && Intrinsics.c(this.rewardsCardNumber, shopUserLoginData.rewardsCardNumber) && this.rewardsState == shopUserLoginData.rewardsState;
    }

    public final int hashCode() {
        int iC = b.c(b.c(b.c(b.c(b.c(b.c(b.c(b.c(b.c(b.c(this.accessToken.hashCode() * 31, 31, this.refreshToken), 31, this.expiresIn), 31, this.trolleyHref), 31, this.paymentHref), 31, this.shopperId), 31, this.firstName), 31, this.email), 31, this.dateOfBirth), 31, this.fulfilmentStoreId), 31, this.deliveryMethod);
        String str = this.rewardsCardNumber;
        return this.rewardsState.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        String str3 = this.expiresIn;
        String str4 = this.trolleyHref;
        String str5 = this.paymentHref;
        String str6 = this.shopperId;
        String str7 = this.firstName;
        String str8 = this.email;
        String str9 = this.dateOfBirth;
        String str10 = this.fulfilmentStoreId;
        String str11 = this.deliveryMethod;
        String str12 = this.rewardsCardNumber;
        RewardsState rewardsState = this.rewardsState;
        StringBuilder sbV = a.v("ShopUserLoginData(accessToken=", str, ", refreshToken=", str2, ", expiresIn=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", trolleyHref=", str4, ", paymentHref=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", shopperId=", str6, ", firstName=");
        androidx.constraintlayout.core.state.a.B(sbV, str7, ", email=", str8, ", dateOfBirth=");
        androidx.constraintlayout.core.state.a.B(sbV, str9, ", fulfilmentStoreId=", str10, ", deliveryMethod=");
        androidx.constraintlayout.core.state.a.B(sbV, str11, ", rewardsCardNumber=", str12, ", rewardsState=");
        sbV.append(rewardsState);
        sbV.append(")");
        return sbV.toString();
    }
}
