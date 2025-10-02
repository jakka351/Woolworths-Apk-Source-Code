package au.com.woolworths.shop.deliveryunlimited.signup.selectplan;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanContract;", "", "Actions", "ViewState", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SelectPlanContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanContract$Actions;", "", "LaunchConfirmSubscription", "LaunchPaymentScreen", "OpenUrl", "Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanContract$Actions$LaunchConfirmSubscription;", "Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanContract$Actions$LaunchPaymentScreen;", "Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanContract$Actions$OpenUrl;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanContract$Actions$LaunchConfirmSubscription;", "Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanContract$Actions;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchConfirmSubscription extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10897a;

            public LaunchConfirmSubscription(String str) {
                this.f10897a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchConfirmSubscription) && Intrinsics.c(this.f10897a, ((LaunchConfirmSubscription) obj).f10897a);
            }

            public final int hashCode() {
                return this.f10897a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchConfirmSubscription(planId=", this.f10897a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanContract$Actions$LaunchPaymentScreen;", "Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanContract$Actions;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchPaymentScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10898a;

            public LaunchPaymentScreen(String str) {
                this.f10898a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchPaymentScreen) && Intrinsics.c(this.f10898a, ((LaunchPaymentScreen) obj).f10898a);
            }

            public final int hashCode() {
                return this.f10898a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchPaymentScreen(planId=", this.f10898a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanContract$Actions$OpenUrl;", "Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanContract$Actions;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10899a;

            public OpenUrl(String url) {
                Intrinsics.h(url, "url");
                this.f10899a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f10899a, ((OpenUrl) obj).f10899a);
            }

            public final int hashCode() {
                return this.f10899a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f10899a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanContract$ViewState;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final Object f10900a;

        public ViewState(List list) {
            this.f10900a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && this.f10900a.equals(((ViewState) obj).f10900a);
        }

        public final int hashCode() {
            return this.f10900a.hashCode();
        }

        public final String toString() {
            return androidx.camera.core.impl.b.n(this.f10900a, "ViewState(planTypes=", ")");
        }
    }
}
