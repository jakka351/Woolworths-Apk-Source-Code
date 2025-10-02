package au.com.woolworths.shop.deliveryunlimited.signup.confirmation;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmation/ConfirmationContract;", "", "Actions", "ViewState", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ConfirmationContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmation/ConfirmationContract$Actions;", "", "LaunchHomePage", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmation/ConfirmationContract$Actions$LaunchHomePage;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmation/ConfirmationContract$Actions$LaunchHomePage;", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmation/ConfirmationContract$Actions;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchHomePage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchHomePage f10851a = new LaunchHomePage();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmation/ConfirmationContract$ViewState;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10852a;
        public final List b;

        public ViewState(boolean z, List feed) {
            Intrinsics.h(feed, "feed");
            this.f10852a = z;
            this.b = feed;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f10852a == viewState.f10852a && Intrinsics.c(this.b, viewState.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.f10852a) * 31);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f10852a + ", feed=" + this.b + ")";
        }
    }
}
