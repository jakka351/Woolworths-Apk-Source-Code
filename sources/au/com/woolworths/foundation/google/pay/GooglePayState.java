package au.com.woolworths.foundation.google.pay;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/google/pay/GooglePayState;", "", "Success", "Fail", "Lau/com/woolworths/foundation/google/pay/GooglePayState$Fail;", "Lau/com/woolworths/foundation/google/pay/GooglePayState$Success;", "google-pay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface GooglePayState {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/google/pay/GooglePayState$Fail;", "Lau/com/woolworths/foundation/google/pay/GooglePayState;", "google-pay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Fail implements GooglePayState {

        /* renamed from: a, reason: collision with root package name */
        public final int f8530a;
        public final String b;

        public Fail(int i, String str) {
            this.f8530a = i;
            this.b = str;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/google/pay/GooglePayState$Success;", "Lau/com/woolworths/foundation/google/pay/GooglePayState;", "google-pay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success implements GooglePayState {

        /* renamed from: a, reason: collision with root package name */
        public final String f8531a;

        public Success(String str) {
            this.f8531a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.c(this.f8531a, ((Success) obj).f8531a);
        }

        public final int hashCode() {
            return this.f8531a.hashCode();
        }

        public final String toString() {
            return a.h("Success(allowedPaymentMethods=", this.f8531a, ")");
        }
    }
}
