package au.com.woolworths.base.shopapp.rewards.models;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001a\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\"\u0010\u001a¨\u0006#"}, d2 = {"Lau/com/woolworths/base/shopapp/rewards/models/RewardsBalanceDetailApiModel;", "", "", "availableFuelVouchers", "Lau/com/woolworths/base/shopapp/rewards/models/SaveForLaterPreference;", "saveForLaterPreference", "", "qantasMessage", "totalLifeTimeDollarValueEarned", "lifetimeRedeemed", "lifeTimeEarned", "currentPointBalance", "currentWowPointBalance", "currentVoucherBalance", "availableVouchers", "nextVoucherExpiryDate", "<init>", "(Ljava/lang/Integer;Lau/com/woolworths/base/shopapp/rewards/models/SaveForLaterPreference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Integer;", "getAvailableFuelVouchers", "()Ljava/lang/Integer;", "Lau/com/woolworths/base/shopapp/rewards/models/SaveForLaterPreference;", "getSaveForLaterPreference", "()Lau/com/woolworths/base/shopapp/rewards/models/SaveForLaterPreference;", "Ljava/lang/String;", "getQantasMessage", "()Ljava/lang/String;", "getTotalLifeTimeDollarValueEarned", "getLifetimeRedeemed", "getLifeTimeEarned", "getCurrentPointBalance", "getCurrentWowPointBalance", "getCurrentVoucherBalance", "getAvailableVouchers", "getNextVoucherExpiryDate", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsBalanceDetailApiModel {

    @SerializedName("availableFuelVouchers")
    @Nullable
    private final Integer availableFuelVouchers;

    @SerializedName("availableVouchers")
    @NotNull
    private final String availableVouchers;

    @SerializedName("currentPointBalance")
    @NotNull
    private final String currentPointBalance;

    @SerializedName("currentVoucherBalance")
    @NotNull
    private final String currentVoucherBalance;

    @SerializedName("currentWowPointBalance")
    @NotNull
    private final String currentWowPointBalance;

    @SerializedName("lifeTimeEarned")
    @NotNull
    private final String lifeTimeEarned;

    @SerializedName("lifetimeRedeemed")
    @Nullable
    private final String lifetimeRedeemed;

    @SerializedName("nextVoucherExpiryDate")
    @NotNull
    private final String nextVoucherExpiryDate;

    @SerializedName("qantasMessage")
    @Nullable
    private final String qantasMessage;

    @SerializedName("saveForLaterPreference")
    @Nullable
    private final SaveForLaterPreference saveForLaterPreference;

    @SerializedName("totalLifeTimeDollarValueEarned")
    @NotNull
    private final String totalLifeTimeDollarValueEarned;

    public RewardsBalanceDetailApiModel(@Nullable Integer num, @Nullable SaveForLaterPreference saveForLaterPreference, @Nullable String str, @NotNull String totalLifeTimeDollarValueEarned, @Nullable String str2, @NotNull String lifeTimeEarned, @NotNull String currentPointBalance, @NotNull String currentWowPointBalance, @NotNull String currentVoucherBalance, @NotNull String availableVouchers, @NotNull String nextVoucherExpiryDate) {
        Intrinsics.h(totalLifeTimeDollarValueEarned, "totalLifeTimeDollarValueEarned");
        Intrinsics.h(lifeTimeEarned, "lifeTimeEarned");
        Intrinsics.h(currentPointBalance, "currentPointBalance");
        Intrinsics.h(currentWowPointBalance, "currentWowPointBalance");
        Intrinsics.h(currentVoucherBalance, "currentVoucherBalance");
        Intrinsics.h(availableVouchers, "availableVouchers");
        Intrinsics.h(nextVoucherExpiryDate, "nextVoucherExpiryDate");
        this.availableFuelVouchers = num;
        this.saveForLaterPreference = saveForLaterPreference;
        this.qantasMessage = str;
        this.totalLifeTimeDollarValueEarned = totalLifeTimeDollarValueEarned;
        this.lifetimeRedeemed = str2;
        this.lifeTimeEarned = lifeTimeEarned;
        this.currentPointBalance = currentPointBalance;
        this.currentWowPointBalance = currentWowPointBalance;
        this.currentVoucherBalance = currentVoucherBalance;
        this.availableVouchers = availableVouchers;
        this.nextVoucherExpiryDate = nextVoucherExpiryDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsBalanceDetailApiModel)) {
            return false;
        }
        RewardsBalanceDetailApiModel rewardsBalanceDetailApiModel = (RewardsBalanceDetailApiModel) obj;
        return Intrinsics.c(this.availableFuelVouchers, rewardsBalanceDetailApiModel.availableFuelVouchers) && this.saveForLaterPreference == rewardsBalanceDetailApiModel.saveForLaterPreference && Intrinsics.c(this.qantasMessage, rewardsBalanceDetailApiModel.qantasMessage) && Intrinsics.c(this.totalLifeTimeDollarValueEarned, rewardsBalanceDetailApiModel.totalLifeTimeDollarValueEarned) && Intrinsics.c(this.lifetimeRedeemed, rewardsBalanceDetailApiModel.lifetimeRedeemed) && Intrinsics.c(this.lifeTimeEarned, rewardsBalanceDetailApiModel.lifeTimeEarned) && Intrinsics.c(this.currentPointBalance, rewardsBalanceDetailApiModel.currentPointBalance) && Intrinsics.c(this.currentWowPointBalance, rewardsBalanceDetailApiModel.currentWowPointBalance) && Intrinsics.c(this.currentVoucherBalance, rewardsBalanceDetailApiModel.currentVoucherBalance) && Intrinsics.c(this.availableVouchers, rewardsBalanceDetailApiModel.availableVouchers) && Intrinsics.c(this.nextVoucherExpiryDate, rewardsBalanceDetailApiModel.nextVoucherExpiryDate);
    }

    public final int hashCode() {
        Integer num = this.availableFuelVouchers;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        SaveForLaterPreference saveForLaterPreference = this.saveForLaterPreference;
        int iHashCode2 = (iHashCode + (saveForLaterPreference == null ? 0 : saveForLaterPreference.hashCode())) * 31;
        String str = this.qantasMessage;
        int iC = b.c((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.totalLifeTimeDollarValueEarned);
        String str2 = this.lifetimeRedeemed;
        return this.nextVoucherExpiryDate.hashCode() + b.c(b.c(b.c(b.c(b.c((iC + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.lifeTimeEarned), 31, this.currentPointBalance), 31, this.currentWowPointBalance), 31, this.currentVoucherBalance), 31, this.availableVouchers);
    }

    public final String toString() {
        Integer num = this.availableFuelVouchers;
        SaveForLaterPreference saveForLaterPreference = this.saveForLaterPreference;
        String str = this.qantasMessage;
        String str2 = this.totalLifeTimeDollarValueEarned;
        String str3 = this.lifetimeRedeemed;
        String str4 = this.lifeTimeEarned;
        String str5 = this.currentPointBalance;
        String str6 = this.currentWowPointBalance;
        String str7 = this.currentVoucherBalance;
        String str8 = this.availableVouchers;
        String str9 = this.nextVoucherExpiryDate;
        StringBuilder sb = new StringBuilder("RewardsBalanceDetailApiModel(availableFuelVouchers=");
        sb.append(num);
        sb.append(", saveForLaterPreference=");
        sb.append(saveForLaterPreference);
        sb.append(", qantasMessage=");
        a.B(sb, str, ", totalLifeTimeDollarValueEarned=", str2, ", lifetimeRedeemed=");
        a.B(sb, str3, ", lifeTimeEarned=", str4, ", currentPointBalance=");
        a.B(sb, str5, ", currentWowPointBalance=", str6, ", currentVoucherBalance=");
        a.B(sb, str7, ", availableVouchers=", str8, ", nextVoucherExpiryDate=");
        return YU.a.o(sb, str9, ")");
    }
}
