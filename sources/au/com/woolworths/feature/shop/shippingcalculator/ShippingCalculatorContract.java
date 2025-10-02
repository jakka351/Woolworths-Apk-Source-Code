package au.com.woolworths.feature.shop.shippingcalculator;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.shippingcalculator.ScreenState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/ShippingCalculatorContract;", "", "ViewState", "Action", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShippingCalculatorContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/ShippingCalculatorContract$Action;", "", "Finish", "Lau/com/woolworths/feature/shop/shippingcalculator/ShippingCalculatorContract$Action$Finish;", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/ShippingCalculatorContract$Action$Finish;", "Lau/com/woolworths/feature/shop/shippingcalculator/ShippingCalculatorContract$Action;", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Finish extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final Finish f8097a = new Finish();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Finish);
            }

            public final int hashCode() {
                return -892796886;
            }

            public final String toString() {
                return "Finish";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/ShippingCalculatorContract$ViewState;", "", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final ScreenState f8098a;

        public ViewState(ScreenState screenState) {
            this.f8098a = screenState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && Intrinsics.c(this.f8098a, ((ViewState) obj).f8098a);
        }

        public final int hashCode() {
            return this.f8098a.hashCode();
        }

        public final String toString() {
            return "ViewState(screenState=" + this.f8098a + ")";
        }

        public /* synthetic */ ViewState() {
            this(ScreenState.Init.f8094a);
        }
    }
}
