package au.com.woolworths.android.onesite.modules.checkout.common;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/common/CheckoutNotifyUser;", "", "InvalidWindowError", "Lau/com/woolworths/android/onesite/modules/checkout/common/CheckoutNotifyUser$InvalidWindowError;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CheckoutNotifyUser {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/common/CheckoutNotifyUser$InvalidWindowError;", "Lau/com/woolworths/android/onesite/modules/checkout/common/CheckoutNotifyUser;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InvalidWindowError extends CheckoutNotifyUser {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4274a;

        public InvalidWindowError(boolean z) {
            this.f4274a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidWindowError) && this.f4274a == ((InvalidWindowError) obj).f4274a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4274a);
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.n("InvalidWindowError(isDeliveryMode=", ")", this.f4274a);
        }
    }
}
