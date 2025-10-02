package au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/terms/ConfirmSubscriptionTermsAndConditionContract;", "", "ViewState", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ConfirmSubscriptionTermsAndConditionContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/terms/ConfirmSubscriptionTermsAndConditionContract$ViewState;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final ConfirmSubscriptionTermsUiModel f10867a;

        public ViewState(ConfirmSubscriptionTermsUiModel confirmSubscriptionTermsUiModel) {
            this.f10867a = confirmSubscriptionTermsUiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && Intrinsics.c(this.f10867a, ((ViewState) obj).f10867a);
        }

        public final int hashCode() {
            return this.f10867a.hashCode();
        }

        public final String toString() {
            return "ViewState(terms=" + this.f10867a + ")";
        }
    }
}
