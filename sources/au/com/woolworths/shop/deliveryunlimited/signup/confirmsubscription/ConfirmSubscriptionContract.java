package au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribePayment;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpErrorState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract;", "", "Actions", "ViewState", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ConfirmSubscriptionContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions;", "", "OpenUrl", "LaunchConfirmationPage", "LaunchTermAndConditionsBottomSheet", "DismissTermsBottomSheet", "ShowSnackbar", "BindDigipayFragments", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions$BindDigipayFragments;", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions$DismissTermsBottomSheet;", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions$LaunchConfirmationPage;", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions$LaunchTermAndConditionsBottomSheet;", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions$OpenUrl;", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions$ShowSnackbar;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions$BindDigipayFragments;", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BindDigipayFragments extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final DeliveryUnlimitedSubscribePayment f10856a;

            public BindDigipayFragments(DeliveryUnlimitedSubscribePayment deliveryUnlimitedSubscribePayment) {
                this.f10856a = deliveryUnlimitedSubscribePayment;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BindDigipayFragments) && Intrinsics.c(this.f10856a, ((BindDigipayFragments) obj).f10856a);
            }

            public final int hashCode() {
                return this.f10856a.hashCode();
            }

            public final String toString() {
                return "BindDigipayFragments(payment=" + this.f10856a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions$DismissTermsBottomSheet;", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DismissTermsBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final DismissTermsBottomSheet f10857a = new DismissTermsBottomSheet();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions$LaunchConfirmationPage;", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchConfirmationPage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchConfirmationPage f10858a = new LaunchConfirmationPage();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions$LaunchTermAndConditionsBottomSheet;", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchTermAndConditionsBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchTermAndConditionsBottomSheet f10859a = new LaunchTermAndConditionsBottomSheet();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions$OpenUrl;", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10860a;

            public OpenUrl(String url) {
                Intrinsics.h(url, "url");
                this.f10860a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f10860a, ((OpenUrl) obj).f10860a);
            }

            public final int hashCode() {
                return this.f10860a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f10860a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions$ShowSnackbar;", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$Actions;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbar extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10861a;

            public ShowSnackbar(String str) {
                this.f10861a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackbar) && Intrinsics.c(this.f10861a, ((ShowSnackbar) obj).f10861a);
            }

            public final int hashCode() {
                return this.f10861a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ShowSnackbar(message=", this.f10861a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionContract$ViewState;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10862a;
        public final StatefulButtonState b;
        public final DeliveryUnlimitedSubscribePayment c;
        public final DeliveryUnlimitedSignUpErrorState d;

        public ViewState(boolean z, StatefulButtonState submitButtonState, DeliveryUnlimitedSubscribePayment deliveryUnlimitedSubscribePayment, DeliveryUnlimitedSignUpErrorState deliveryUnlimitedSignUpErrorState) {
            Intrinsics.h(submitButtonState, "submitButtonState");
            this.f10862a = z;
            this.b = submitButtonState;
            this.c = deliveryUnlimitedSubscribePayment;
            this.d = deliveryUnlimitedSignUpErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f10862a == viewState.f10862a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.f10862a) * 31)) * 31;
            DeliveryUnlimitedSubscribePayment deliveryUnlimitedSubscribePayment = this.c;
            int iHashCode2 = (iHashCode + (deliveryUnlimitedSubscribePayment == null ? 0 : deliveryUnlimitedSubscribePayment.hashCode())) * 31;
            DeliveryUnlimitedSignUpErrorState deliveryUnlimitedSignUpErrorState = this.d;
            return iHashCode2 + (deliveryUnlimitedSignUpErrorState != null ? deliveryUnlimitedSignUpErrorState.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f10862a + ", submitButtonState=" + this.b + ", deliveryUnlimitedSubscribePayment=" + this.c + ", errorState=" + this.d + ")";
        }
    }
}
