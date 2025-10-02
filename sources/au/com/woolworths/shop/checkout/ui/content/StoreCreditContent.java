package au.com.woolworths.shop.checkout.ui.content;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.checkout.domain.model.CheckoutStoreCreditDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/StoreCreditContent;", "", "Loading", "Success", "ConnectionError", "ServerError", "Lau/com/woolworths/shop/checkout/ui/content/StoreCreditContent$ConnectionError;", "Lau/com/woolworths/shop/checkout/ui/content/StoreCreditContent$Loading;", "Lau/com/woolworths/shop/checkout/ui/content/StoreCreditContent$ServerError;", "Lau/com/woolworths/shop/checkout/ui/content/StoreCreditContent$Success;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class StoreCreditContent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/StoreCreditContent$ConnectionError;", "Lau/com/woolworths/shop/checkout/ui/content/StoreCreditContent;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConnectionError extends StoreCreditContent {

        /* renamed from: a, reason: collision with root package name */
        public static final ConnectionError f10764a = new ConnectionError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectionError);
        }

        public final int hashCode() {
            return -1575556627;
        }

        public final String toString() {
            return "ConnectionError";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/StoreCreditContent$Loading;", "Lau/com/woolworths/shop/checkout/ui/content/StoreCreditContent;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loading extends StoreCreditContent {

        /* renamed from: a, reason: collision with root package name */
        public static final Loading f10765a = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1848926113;
        }

        public final String toString() {
            return "Loading";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/StoreCreditContent$ServerError;", "Lau/com/woolworths/shop/checkout/ui/content/StoreCreditContent;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ServerError extends StoreCreditContent {

        /* renamed from: a, reason: collision with root package name */
        public static final ServerError f10766a = new ServerError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ServerError);
        }

        public final int hashCode() {
            return 1737112104;
        }

        public final String toString() {
            return "ServerError";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/StoreCreditContent$Success;", "Lau/com/woolworths/shop/checkout/ui/content/StoreCreditContent;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends StoreCreditContent {

        /* renamed from: a, reason: collision with root package name */
        public final CheckoutStoreCreditDetail f10767a;

        public Success(CheckoutStoreCreditDetail checkoutStoreCreditDetail) {
            this.f10767a = checkoutStoreCreditDetail;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.c(this.f10767a, ((Success) obj).f10767a);
        }

        public final int hashCode() {
            return this.f10767a.hashCode();
        }

        public final String toString() {
            return "Success(storeCreditDetail=" + this.f10767a + ")";
        }
    }
}
