package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsUiModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/payment/TermsBottomSheetData;", "", "Terms", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/TermsBottomSheetData$Terms;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class TermsBottomSheetData {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/payment/TermsBottomSheetData$Terms;", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/TermsBottomSheetData;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Terms extends TermsBottomSheetData {

        /* renamed from: a, reason: collision with root package name */
        public final ConfirmSubscriptionTermsUiModel f10894a;
        public final String b;

        public Terms(ConfirmSubscriptionTermsUiModel confirmSubscriptionTermsUiModel) {
            this.f10894a = confirmSubscriptionTermsUiModel;
            this.b = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Terms)) {
                return false;
            }
            Terms terms = (Terms) obj;
            return Intrinsics.c(this.f10894a, terms.f10894a) && Intrinsics.c(this.b, terms.b);
        }

        public final int hashCode() {
            int iHashCode = this.f10894a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Terms(terms=" + this.f10894a + ", checkoutSessionId=" + this.b + ")";
        }

        public Terms(ConfirmSubscriptionTermsUiModel confirmSubscriptionTermsUiModel, String str) {
            this.f10894a = confirmSubscriptionTermsUiModel;
            this.b = str;
        }
    }
}
