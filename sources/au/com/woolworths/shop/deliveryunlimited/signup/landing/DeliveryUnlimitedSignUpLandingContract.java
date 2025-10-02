package au.com.woolworths.shop.deliveryunlimited.signup.landing;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlans;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpLandingContract;", "", "ViewState", "Actions", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DeliveryUnlimitedSignUpLandingContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpLandingContract$Actions;", "", "LaunchSelectPlanPage", "LaunchFeatureLink", "Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpLandingContract$Actions$LaunchFeatureLink;", "Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpLandingContract$Actions$LaunchSelectPlanPage;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpLandingContract$Actions$LaunchFeatureLink;", "Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpLandingContract$Actions;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchFeatureLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10876a;

            public LaunchFeatureLink(String featureUrlLink) {
                Intrinsics.h(featureUrlLink, "featureUrlLink");
                this.f10876a = featureUrlLink;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchFeatureLink) && Intrinsics.c(this.f10876a, ((LaunchFeatureLink) obj).f10876a);
            }

            public final int hashCode() {
                return this.f10876a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchFeatureLink(featureUrlLink=", this.f10876a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpLandingContract$Actions$LaunchSelectPlanPage;", "Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpLandingContract$Actions;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSelectPlanPage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final DeliveryUnlimitedSignUpPlans f10877a;
            public final boolean b;

            public LaunchSelectPlanPage(DeliveryUnlimitedSignUpPlans plans, boolean z) {
                Intrinsics.h(plans, "plans");
                this.f10877a = plans;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchSelectPlanPage)) {
                    return false;
                }
                LaunchSelectPlanPage launchSelectPlanPage = (LaunchSelectPlanPage) obj;
                return Intrinsics.c(this.f10877a, launchSelectPlanPage.f10877a) && this.b == launchSelectPlanPage.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.f10877a.hashCode() * 31);
            }

            public final String toString() {
                return "LaunchSelectPlanPage(plans=" + this.f10877a + ", isUserWPayMigrated=" + this.b + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpLandingContract$ViewState;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10878a;
        public final DeliveryUnlimitedSubscribe b;
        public final DeliveryUnlimitedSignUpErrorState c;

        public ViewState(boolean z, DeliveryUnlimitedSubscribe deliveryUnlimitedSubscribe, DeliveryUnlimitedSignUpErrorState deliveryUnlimitedSignUpErrorState) {
            this.f10878a = z;
            this.b = deliveryUnlimitedSubscribe;
            this.c = deliveryUnlimitedSignUpErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f10878a == viewState.f10878a && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f10878a) * 31;
            DeliveryUnlimitedSubscribe deliveryUnlimitedSubscribe = this.b;
            int iHashCode2 = (iHashCode + (deliveryUnlimitedSubscribe == null ? 0 : deliveryUnlimitedSubscribe.hashCode())) * 31;
            DeliveryUnlimitedSignUpErrorState deliveryUnlimitedSignUpErrorState = this.c;
            return iHashCode2 + (deliveryUnlimitedSignUpErrorState != null ? deliveryUnlimitedSignUpErrorState.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f10878a + ", deliveryUnlimitedSubscribe=" + this.b + ", errorState=" + this.c + ")";
        }
    }
}
