package au.com.woolworths.shop.deliveryunlimited.signup.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribe;", "", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpSummary;", ErrorBundle.SUMMARY_ENTRY, "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpPlans;", "plans", "", "isUserWPayMigrated", "<init>", "(Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpSummary;Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpPlans;Ljava/lang/Boolean;)V", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpSummary;", "b", "()Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpSummary;", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpPlans;", "a", "()Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpPlans;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSubscribe {

    @SerializedName("isUserWPayMigrated")
    @Nullable
    private final Boolean isUserWPayMigrated;

    @SerializedName("plans")
    @NotNull
    private final DeliveryUnlimitedSignUpPlans plans;

    @SerializedName(ErrorBundle.SUMMARY_ENTRY)
    @NotNull
    private final DeliveryUnlimitedSignUpSummary summary;

    public DeliveryUnlimitedSubscribe(@NotNull DeliveryUnlimitedSignUpSummary summary, @NotNull DeliveryUnlimitedSignUpPlans plans, @Nullable Boolean bool) {
        Intrinsics.h(summary, "summary");
        Intrinsics.h(plans, "plans");
        this.summary = summary;
        this.plans = plans;
        this.isUserWPayMigrated = bool;
    }

    /* renamed from: a, reason: from getter */
    public final DeliveryUnlimitedSignUpPlans getPlans() {
        return this.plans;
    }

    /* renamed from: b, reason: from getter */
    public final DeliveryUnlimitedSignUpSummary getSummary() {
        return this.summary;
    }

    /* renamed from: c, reason: from getter */
    public final Boolean getIsUserWPayMigrated() {
        return this.isUserWPayMigrated;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSubscribe)) {
            return false;
        }
        DeliveryUnlimitedSubscribe deliveryUnlimitedSubscribe = (DeliveryUnlimitedSubscribe) obj;
        return Intrinsics.c(this.summary, deliveryUnlimitedSubscribe.summary) && Intrinsics.c(this.plans, deliveryUnlimitedSubscribe.plans) && Intrinsics.c(this.isUserWPayMigrated, deliveryUnlimitedSubscribe.isUserWPayMigrated);
    }

    public final int hashCode() {
        int iHashCode = (this.plans.hashCode() + (this.summary.hashCode() * 31)) * 31;
        Boolean bool = this.isUserWPayMigrated;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        DeliveryUnlimitedSignUpSummary deliveryUnlimitedSignUpSummary = this.summary;
        DeliveryUnlimitedSignUpPlans deliveryUnlimitedSignUpPlans = this.plans;
        Boolean bool = this.isUserWPayMigrated;
        StringBuilder sb = new StringBuilder("DeliveryUnlimitedSubscribe(summary=");
        sb.append(deliveryUnlimitedSignUpSummary);
        sb.append(", plans=");
        sb.append(deliveryUnlimitedSignUpPlans);
        sb.append(", isUserWPayMigrated=");
        return a.o(sb, bool, ")");
    }
}
