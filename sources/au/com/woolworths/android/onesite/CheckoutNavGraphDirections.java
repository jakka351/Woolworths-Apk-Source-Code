package au.com.woolworths.android.onesite;

import android.os.Bundle;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDirections;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/CheckoutNavGraphDirections;", "", "ActionToOrderConfirmation", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckoutNavGraphDirections {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/CheckoutNavGraphDirections$ActionToOrderConfirmation;", "Landroidx/navigation/NavDirections;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionToOrderConfirmation implements NavDirections {

        /* renamed from: a, reason: collision with root package name */
        public final long f4051a;

        public ActionToOrderConfirmation(long j) {
            this.f4051a = j;
        }

        @Override // androidx.navigation.NavDirections
        public final Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putLong("orderId", this.f4051a);
            return bundle;
        }

        @Override // androidx.navigation.NavDirections
        public final int c() {
            return com.woolworths.R.id.action_to_order_confirmation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionToOrderConfirmation) && this.f4051a == ((ActionToOrderConfirmation) obj).f4051a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f4051a);
        }

        public final String toString() {
            return b.l(this.f4051a, "ActionToOrderConfirmation(orderId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/CheckoutNavGraphDirections$Companion;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static NavDirections a(long j) {
            return new ActionToOrderConfirmation(j);
        }
    }
}
