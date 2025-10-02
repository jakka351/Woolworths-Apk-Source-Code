package au.com.woolworths.shop.checkout.ui.confirmation;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract;", "", "Action", "ViewState", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OrderConfirmationContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$Action;", "", "HandleBannerClick", "LaunchProductListProductGroup", "NavigateToHome", "ShowVocSurvey", "Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$Action$HandleBannerClick;", "Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$Action$LaunchProductListProductGroup;", "Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$Action$NavigateToHome;", "Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$Action$ShowVocSurvey;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$Action$HandleBannerClick;", "Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class HandleBannerClick extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f10716a;

            public HandleBannerClick(String link) {
                Intrinsics.h(link, "link");
                this.f10716a = link;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HandleBannerClick) && Intrinsics.c(this.f10716a, ((HandleBannerClick) obj).f10716a);
            }

            public final int hashCode() {
                return this.f10716a.hashCode();
            }

            public final String toString() {
                return YU.a.h("HandleBannerClick(link=", this.f10716a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$Action$LaunchProductListProductGroup;", "Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductListProductGroup extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f10717a;
            public final String b;
            public final String c;

            public LaunchProductListProductGroup(String str, String str2, String str3) {
                this.f10717a = str;
                this.b = str2;
                this.c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchProductListProductGroup)) {
                    return false;
                }
                LaunchProductListProductGroup launchProductListProductGroup = (LaunchProductListProductGroup) obj;
                return Intrinsics.c(this.f10717a, launchProductListProductGroup.f10717a) && Intrinsics.c(this.b, launchProductListProductGroup.b) && Intrinsics.c(this.c, launchProductListProductGroup.c);
            }

            public final int hashCode() {
                int iHashCode = this.f10717a.hashCode() * 31;
                String str = this.b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return YU.a.o(YU.a.v("LaunchProductListProductGroup(groupId=", this.f10717a, ", title=", this.b, ", type="), this.c, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$Action$NavigateToHome;", "Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToHome extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToHome f10718a = new NavigateToHome();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateToHome);
            }

            public final int hashCode() {
                return 734116526;
            }

            public final String toString() {
                return "NavigateToHome";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$Action$ShowVocSurvey;", "Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowVocSurvey extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowVocSurvey f10719a = new ShowVocSurvey();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowVocSurvey);
            }

            public final int hashCode() {
                return 1596868100;
            }

            public final String toString() {
                return "ShowVocSurvey";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$ViewState;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10720a;
        public final List b;
        public final Text c;
        public final OrderConfirmationErrorState d;

        public ViewState(boolean z, List contentList, Text buttonTitle, OrderConfirmationErrorState orderConfirmationErrorState) {
            Intrinsics.h(contentList, "contentList");
            Intrinsics.h(buttonTitle, "buttonTitle");
            this.f10720a = z;
            this.b = contentList;
            this.c = buttonTitle;
            this.d = orderConfirmationErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f10720a == viewState.f10720a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d;
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + androidx.camera.core.impl.b.d(Boolean.hashCode(this.f10720a) * 31, 31, this.b)) * 31;
            OrderConfirmationErrorState orderConfirmationErrorState = this.d;
            return iHashCode + (orderConfirmationErrorState == null ? 0 : orderConfirmationErrorState.hashCode());
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f10720a + ", contentList=" + this.b + ", buttonTitle=" + this.c + ", errorState=" + this.d + ")";
        }
    }
}
