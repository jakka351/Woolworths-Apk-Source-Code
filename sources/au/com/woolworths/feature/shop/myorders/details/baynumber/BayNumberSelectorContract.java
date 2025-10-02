package au.com.woolworths.feature.shop.myorders.details.baynumber;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.details.models.BayNumberPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorContract;", "", "Actions", "ViewState", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BayNumberSelectorContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorContract$Actions;", "", "ConfirmBayNumber", "DontKnowBayNumber", "Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorContract$Actions$ConfirmBayNumber;", "Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorContract$Actions$DontKnowBayNumber;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorContract$Actions$ConfirmBayNumber;", "Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConfirmBayNumber implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7686a;

            public ConfirmBayNumber(String bayNumber) {
                Intrinsics.h(bayNumber, "bayNumber");
                this.f7686a = bayNumber;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ConfirmBayNumber) && Intrinsics.c(this.f7686a, ((ConfirmBayNumber) obj).f7686a);
            }

            public final int hashCode() {
                return this.f7686a.hashCode();
            }

            public final String toString() {
                return a.h("ConfirmBayNumber(bayNumber=", this.f7686a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorContract$Actions$DontKnowBayNumber;", "Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DontKnowBayNumber implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final DontKnowBayNumber f7687a = new DontKnowBayNumber();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorContract$ViewState;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final BayNumberPreferences f7688a;

        public ViewState(BayNumberPreferences bayNumberPreferences) {
            Intrinsics.h(bayNumberPreferences, "bayNumberPreferences");
            this.f7688a = bayNumberPreferences;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && Intrinsics.c(this.f7688a, ((ViewState) obj).f7688a);
        }

        public final int hashCode() {
            return this.f7688a.hashCode();
        }

        public final String toString() {
            return "ViewState(bayNumberPreferences=" + this.f7688a + ")";
        }
    }
}
