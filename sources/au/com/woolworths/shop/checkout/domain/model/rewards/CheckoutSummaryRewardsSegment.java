package au.com.woolworths.shop.checkout.domain.model.rewards;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.checkout.domain.model.CheckoutInfoDialog;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/rewards/CheckoutSummaryRewardsSegment;", "", "Registered", "RegisteredRedeemable", "Lau/com/woolworths/shop/checkout/domain/model/rewards/CheckoutSummaryRewardsSegment$Registered;", "Lau/com/woolworths/shop/checkout/domain/model/rewards/CheckoutSummaryRewardsSegment$RegisteredRedeemable;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CheckoutSummaryRewardsSegment {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/rewards/CheckoutSummaryRewardsSegment$Registered;", "Lau/com/woolworths/shop/checkout/domain/model/rewards/CheckoutSummaryRewardsSegment;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Registered implements CheckoutSummaryRewardsSegment {

        /* renamed from: a, reason: collision with root package name */
        public final String f10655a;
        public final String b;
        public final String c;

        public Registered(String str, String str2, String str3) {
            this.f10655a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Registered)) {
                return false;
            }
            Registered registered = (Registered) obj;
            return this.f10655a.equals(registered.f10655a) && this.b.equals(registered.b) && this.c.equals(registered.c);
        }

        public final int hashCode() {
            return Integer.hashCode(R.drawable.ic_rewards_card_small) + b.c(b.c(this.f10655a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return a.o(a.v("Registered(title=", this.f10655a, ", subtitle=", this.b, ", imageUrl="), this.c, ", imageBackup=2131231555)");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/rewards/CheckoutSummaryRewardsSegment$RegisteredRedeemable;", "Lau/com/woolworths/shop/checkout/domain/model/rewards/CheckoutSummaryRewardsSegment;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RegisteredRedeemable implements CheckoutSummaryRewardsSegment {

        /* renamed from: a, reason: collision with root package name */
        public final String f10656a;
        public final String b;
        public final boolean c;
        public final CheckoutInfoDialog d;

        public RegisteredRedeemable(String str, String str2, boolean z, CheckoutInfoDialog checkoutInfoDialog) {
            this.f10656a = str;
            this.b = str2;
            this.c = z;
            this.d = checkoutInfoDialog;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegisteredRedeemable)) {
                return false;
            }
            RegisteredRedeemable registeredRedeemable = (RegisteredRedeemable) obj;
            return Intrinsics.c(this.f10656a, registeredRedeemable.f10656a) && Intrinsics.c(this.b, registeredRedeemable.b) && this.c == registeredRedeemable.c && Intrinsics.c(this.d, registeredRedeemable.d);
        }

        public final int hashCode() {
            int iE = b.e(b.c(this.f10656a.hashCode() * 31, 31, this.b), 31, this.c);
            CheckoutInfoDialog checkoutInfoDialog = this.d;
            return iE + (checkoutInfoDialog == null ? 0 : checkoutInfoDialog.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("RegisteredRedeemable(redeemText=", this.f10656a, ", buttonTitle=", this.b, ", isRedeemed=");
            sbV.append(this.c);
            sbV.append(", redeemInfo=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }
}
