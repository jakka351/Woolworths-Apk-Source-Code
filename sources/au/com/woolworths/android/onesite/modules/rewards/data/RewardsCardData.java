package au.com.woolworths.android.onesite.modules.rewards.data;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\r\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001b"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardData;", "", "", "number", "displayCardNumber", "displayName", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardTypeData;", "cardType", "ccv", "modeData", "regionData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardTypeData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "d", "getDisplayName", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardTypeData;", "b", "()Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardTypeData;", "c", "e", "getModeData$annotations", "()V", "g", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RewardsCardData {

    @SerializedName("cardType")
    @NotNull
    private final RewardsCardTypeData cardType;

    @SerializedName("ccv")
    @Nullable
    private final String ccv;

    @SerializedName("displayCardNumber")
    @NotNull
    private final String displayCardNumber;

    @SerializedName("displayName")
    @NotNull
    private final String displayName;

    @SerializedName("mode")
    @Nullable
    private final String modeData;

    @SerializedName("cardNumber")
    @NotNull
    private final String number;

    @SerializedName("region")
    @Nullable
    private final String regionData;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardData$Companion;", "", "", "ModeDefaultValue", "Ljava/lang/String;", "RegionDefaultValue", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public RewardsCardData(@NotNull String number, @NotNull String displayCardNumber, @NotNull String displayName, @NotNull RewardsCardTypeData cardType, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.h(number, "number");
        Intrinsics.h(displayCardNumber, "displayCardNumber");
        Intrinsics.h(displayName, "displayName");
        Intrinsics.h(cardType, "cardType");
        this.number = number;
        this.displayCardNumber = displayCardNumber;
        this.displayName = displayName;
        this.cardType = cardType;
        this.ccv = str;
        this.modeData = str2;
        this.regionData = str3;
    }

    public static RewardsCardData a(RewardsCardData rewardsCardData, String str, String str2, String str3, RewardsCardTypeData rewardsCardTypeData, String str4, int i) {
        if ((i & 1) != 0) {
            str = rewardsCardData.number;
        }
        String number = str;
        if ((i & 2) != 0) {
            str2 = rewardsCardData.displayCardNumber;
        }
        String displayCardNumber = str2;
        if ((i & 4) != 0) {
            str3 = rewardsCardData.displayName;
        }
        String displayName = str3;
        if ((i & 8) != 0) {
            rewardsCardTypeData = rewardsCardData.cardType;
        }
        RewardsCardTypeData cardType = rewardsCardTypeData;
        if ((i & 16) != 0) {
            str4 = rewardsCardData.ccv;
        }
        String str5 = rewardsCardData.modeData;
        String str6 = rewardsCardData.regionData;
        Intrinsics.h(number, "number");
        Intrinsics.h(displayCardNumber, "displayCardNumber");
        Intrinsics.h(displayName, "displayName");
        Intrinsics.h(cardType, "cardType");
        return new RewardsCardData(number, displayCardNumber, displayName, cardType, str4, str5, str6);
    }

    /* renamed from: b, reason: from getter */
    public final RewardsCardTypeData getCardType() {
        return this.cardType;
    }

    /* renamed from: c, reason: from getter */
    public final String getCcv() {
        return this.ccv;
    }

    /* renamed from: d, reason: from getter */
    public final String getDisplayCardNumber() {
        return this.displayCardNumber;
    }

    /* renamed from: e, reason: from getter */
    public final String getModeData() {
        return this.modeData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsCardData)) {
            return false;
        }
        RewardsCardData rewardsCardData = (RewardsCardData) obj;
        return Intrinsics.c(this.number, rewardsCardData.number) && Intrinsics.c(this.displayCardNumber, rewardsCardData.displayCardNumber) && Intrinsics.c(this.displayName, rewardsCardData.displayName) && this.cardType == rewardsCardData.cardType && Intrinsics.c(this.ccv, rewardsCardData.ccv) && Intrinsics.c(this.modeData, rewardsCardData.modeData) && Intrinsics.c(this.regionData, rewardsCardData.regionData);
    }

    /* renamed from: f, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: g, reason: from getter */
    public final String getRegionData() {
        return this.regionData;
    }

    public final int hashCode() {
        int iHashCode = (this.cardType.hashCode() + b.c(b.c(this.number.hashCode() * 31, 31, this.displayCardNumber), 31, this.displayName)) * 31;
        String str = this.ccv;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.modeData;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.regionData;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.number;
        String str2 = this.displayCardNumber;
        String str3 = this.displayName;
        RewardsCardTypeData rewardsCardTypeData = this.cardType;
        String str4 = this.ccv;
        String str5 = this.modeData;
        String str6 = this.regionData;
        StringBuilder sbV = a.v("RewardsCardData(number=", str, ", displayCardNumber=", str2, ", displayName=");
        sbV.append(str3);
        sbV.append(", cardType=");
        sbV.append(rewardsCardTypeData);
        sbV.append(", ccv=");
        androidx.constraintlayout.core.state.a.B(sbV, str4, ", modeData=", str5, ", regionData=");
        return a.o(sbV, str6, ")");
    }

    public /* synthetic */ RewardsCardData(String str, String str2, String str3, RewardsCardTypeData rewardsCardTypeData, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, rewardsCardTypeData, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
