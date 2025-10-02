package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentResponse;", "", "Success", "Fail", "ValidationFail", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentResponse$Fail;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentResponse$Success;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentResponse$ValidationFail;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PaymentResponse {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentResponse$Fail;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentResponse;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Fail implements PaymentResponse {

        /* renamed from: a, reason: collision with root package name */
        public final String f8309a;
        public final AnalyticsData b;
        public final boolean c;

        public Fail(boolean z, String str, AnalyticsData analyticsData) {
            this.f8309a = str;
            this.b = analyticsData;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fail)) {
                return false;
            }
            Fail fail = (Fail) obj;
            return Intrinsics.c(this.f8309a, fail.f8309a) && Intrinsics.c(this.b, fail.b) && this.c == fail.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f8309a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Fail(errorMessage=");
            sb.append(this.f8309a);
            sb.append(", analytics=");
            sb.append(this.b);
            sb.append(", regenerateIdempotencyKey=");
            return a.k(")", sb, this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentResponse$Success;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentResponse;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success implements PaymentResponse {

        /* renamed from: a, reason: collision with root package name */
        public final int f8310a;

        public Success(int i) {
            this.f8310a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.f8310a == ((Success) obj).f8310a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f8310a);
        }

        public final String toString() {
            return a.e(this.f8310a, "Success(orderId=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentResponse$ValidationFail;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentResponse;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ValidationFail implements PaymentResponse {

        /* renamed from: a, reason: collision with root package name */
        public final String f8311a;
        public final String b;
        public final AnalyticsData c;

        public ValidationFail(String str, String str2, AnalyticsData analyticsData) {
            this.f8311a = str;
            this.b = str2;
            this.c = analyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidationFail)) {
                return false;
            }
            ValidationFail validationFail = (ValidationFail) obj;
            return Intrinsics.c(this.f8311a, validationFail.f8311a) && Intrinsics.c(this.b, validationFail.b) && Intrinsics.c(this.c, validationFail.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f8311a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.n(a.v("ValidationFail(errorTitle=", this.f8311a, ", errorMessage=", this.b, ", analytics="), this.c, ")");
        }
    }
}
