package au.com.woolworths.feature.shop.shippingcalculator;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState;", "", "Init", "Empty", "Success", "Error", "Loading", "Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState$Empty;", "Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState$Error;", "Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState$Init;", "Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState$Loading;", "Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState$Success;", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ScreenState {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState$Empty;", "Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState;", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Empty extends ScreenState {

        /* renamed from: a, reason: collision with root package name */
        public static final Empty f8092a = new Empty();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return 1614059673;
        }

        public final String toString() {
            return "Empty";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState$Error;", "Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState;", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends ScreenState {

        /* renamed from: a, reason: collision with root package name */
        public final int f8093a;
        public final int b;

        public Error(int i, int i2) {
            this.f8093a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.f8093a == error.f8093a && this.b == error.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.f8093a) * 31);
        }

        public final String toString() {
            return b.j(this.f8093a, this.b, "Error(title=", ", message=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState$Init;", "Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState;", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Init extends ScreenState {

        /* renamed from: a, reason: collision with root package name */
        public static final Init f8094a = new Init();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Init);
        }

        public final int hashCode() {
            return -1194739644;
        }

        public final String toString() {
            return "Init";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState$Loading;", "Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState;", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loading extends ScreenState {

        /* renamed from: a, reason: collision with root package name */
        public static final Loading f8095a = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1706339960;
        }

        public final String toString() {
            return "Loading";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState$Success;", "Lau/com/woolworths/feature/shop/shippingcalculator/ScreenState;", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends ScreenState {

        /* renamed from: a, reason: collision with root package name */
        public final List f8096a;

        public Success(List list) {
            this.f8096a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.c(this.f8096a, ((Success) obj).f8096a);
        }

        public final int hashCode() {
            return this.f8096a.hashCode();
        }

        public final String toString() {
            return a.l("Success(suburbs=", ")", this.f8096a);
        }
    }
}
