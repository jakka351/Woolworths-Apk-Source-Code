package au.com.woolworths.feature.shop.myorders.details.pickupeta;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.details.models.OnMyWayPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/pickupeta/PickupEtaSelectorContract;", "", "Actions", "ViewState", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PickupEtaSelectorContract {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/pickupeta/PickupEtaSelectorContract$Actions;", "", "ConfirmPickupEta", "Lau/com/woolworths/feature/shop/myorders/details/pickupeta/PickupEtaSelectorContract$Actions$ConfirmPickupEta;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/pickupeta/PickupEtaSelectorContract$Actions$ConfirmPickupEta;", "Lau/com/woolworths/feature/shop/myorders/details/pickupeta/PickupEtaSelectorContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConfirmPickupEta implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7782a;

            public ConfirmPickupEta(String eta) {
                Intrinsics.h(eta, "eta");
                this.f7782a = eta;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ConfirmPickupEta) && Intrinsics.c(this.f7782a, ((ConfirmPickupEta) obj).f7782a);
            }

            public final int hashCode() {
                return this.f7782a.hashCode();
            }

            public final String toString() {
                return a.h("ConfirmPickupEta(eta=", this.f7782a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/pickupeta/PickupEtaSelectorContract$ViewState;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final OnMyWayPreferences f7783a;

        public ViewState(OnMyWayPreferences onMyWayPreferences) {
            Intrinsics.h(onMyWayPreferences, "onMyWayPreferences");
            this.f7783a = onMyWayPreferences;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && Intrinsics.c(this.f7783a, ((ViewState) obj).f7783a);
        }

        public final int hashCode() {
            return this.f7783a.hashCode();
        }

        public final String toString() {
            return "ViewState(onMyWayPreferences=" + this.f7783a + ")";
        }
    }
}
