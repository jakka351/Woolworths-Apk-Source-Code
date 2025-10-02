package au.com.woolworths.shop.auth.data;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsState;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\"Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lau/com/woolworths/shop/auth/data/MemberData;", "", "", "accessToken", "expiresIn", "trolleyHref", "paymentHref", "shopperId", "firstName", Scopes.EMAIL, "dateOfBirth", "fulfilmentStoreId", "deliveryMethod", "rewardsCardNumber", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;", "rewardsState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "d", "k", "g", "j", "e", "c", "b", "f", "getDeliveryMethod", "h", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;", "i", "()Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;", "Companion", "shop-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MemberData {

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

    @SerializedName("rewardscardNumber")
    @Nullable
    private final String rewardsCardNumber;

    @SerializedName("rewardsState")
    @Nullable
    private final RewardsState rewardsState;

    @SerializedName("shopperid")
    @NotNull
    private final String shopperId;

    @SerializedName("trolleyhref")
    @NotNull
    private final String trolleyHref;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/auth/data/MemberData$Companion;", "", "", "DEFAULT_EXPIRY_MS", "J", "shop-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static MemberData a(String authToken) {
            Intrinsics.h(authToken, "authToken");
            return new MemberData(authToken, "600", "", "", "", "Thomas", "thomas@aa.com", "", "", "", null, null);
        }
    }

    public MemberData(@NotNull String accessToken, @NotNull String expiresIn, @NotNull String trolleyHref, @NotNull String paymentHref, @NotNull String shopperId, @NotNull String firstName, @NotNull String email, @NotNull String dateOfBirth, @NotNull String fulfilmentStoreId, @NotNull String deliveryMethod, @Nullable String str, @Nullable RewardsState rewardsState) {
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(expiresIn, "expiresIn");
        Intrinsics.h(trolleyHref, "trolleyHref");
        Intrinsics.h(paymentHref, "paymentHref");
        Intrinsics.h(shopperId, "shopperId");
        Intrinsics.h(firstName, "firstName");
        Intrinsics.h(email, "email");
        Intrinsics.h(dateOfBirth, "dateOfBirth");
        Intrinsics.h(fulfilmentStoreId, "fulfilmentStoreId");
        Intrinsics.h(deliveryMethod, "deliveryMethod");
        this.accessToken = accessToken;
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

    /* renamed from: a, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: b, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* renamed from: c, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: d, reason: from getter */
    public final String getExpiresIn() {
        return this.expiresIn;
    }

    /* renamed from: e, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemberData)) {
            return false;
        }
        MemberData memberData = (MemberData) obj;
        return Intrinsics.c(this.accessToken, memberData.accessToken) && Intrinsics.c(this.expiresIn, memberData.expiresIn) && Intrinsics.c(this.trolleyHref, memberData.trolleyHref) && Intrinsics.c(this.paymentHref, memberData.paymentHref) && Intrinsics.c(this.shopperId, memberData.shopperId) && Intrinsics.c(this.firstName, memberData.firstName) && Intrinsics.c(this.email, memberData.email) && Intrinsics.c(this.dateOfBirth, memberData.dateOfBirth) && Intrinsics.c(this.fulfilmentStoreId, memberData.fulfilmentStoreId) && Intrinsics.c(this.deliveryMethod, memberData.deliveryMethod) && Intrinsics.c(this.rewardsCardNumber, memberData.rewardsCardNumber) && this.rewardsState == memberData.rewardsState;
    }

    /* renamed from: f, reason: from getter */
    public final String getFulfilmentStoreId() {
        return this.fulfilmentStoreId;
    }

    /* renamed from: g, reason: from getter */
    public final String getPaymentHref() {
        return this.paymentHref;
    }

    /* renamed from: h, reason: from getter */
    public final String getRewardsCardNumber() {
        return this.rewardsCardNumber;
    }

    public final int hashCode() {
        int iC = b.c(b.c(b.c(b.c(b.c(b.c(b.c(b.c(b.c(this.accessToken.hashCode() * 31, 31, this.expiresIn), 31, this.trolleyHref), 31, this.paymentHref), 31, this.shopperId), 31, this.firstName), 31, this.email), 31, this.dateOfBirth), 31, this.fulfilmentStoreId), 31, this.deliveryMethod);
        String str = this.rewardsCardNumber;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        RewardsState rewardsState = this.rewardsState;
        return iHashCode + (rewardsState != null ? rewardsState.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final RewardsState getRewardsState() {
        return this.rewardsState;
    }

    /* renamed from: j, reason: from getter */
    public final String getShopperId() {
        return this.shopperId;
    }

    /* renamed from: k, reason: from getter */
    public final String getTrolleyHref() {
        return this.trolleyHref;
    }

    public final String toString() {
        String str = this.accessToken;
        String str2 = this.expiresIn;
        String str3 = this.trolleyHref;
        String str4 = this.paymentHref;
        String str5 = this.shopperId;
        String str6 = this.firstName;
        String str7 = this.email;
        String str8 = this.dateOfBirth;
        String str9 = this.fulfilmentStoreId;
        String str10 = this.deliveryMethod;
        String str11 = this.rewardsCardNumber;
        RewardsState rewardsState = this.rewardsState;
        StringBuilder sbV = a.v("MemberData(accessToken=", str, ", expiresIn=", str2, ", trolleyHref=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", paymentHref=", str4, ", shopperId=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", firstName=", str6, ", email=");
        androidx.constraintlayout.core.state.a.B(sbV, str7, ", dateOfBirth=", str8, ", fulfilmentStoreId=");
        androidx.constraintlayout.core.state.a.B(sbV, str9, ", deliveryMethod=", str10, ", rewardsCardNumber=");
        sbV.append(str11);
        sbV.append(", rewardsState=");
        sbV.append(rewardsState);
        sbV.append(")");
        return sbV.toString();
    }
}
