package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/UnlinkCreditCardResponse;", "", "Success", "ValidationFailure", "Failure", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/UnlinkCreditCardResponse$Failure;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/UnlinkCreditCardResponse$Success;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/UnlinkCreditCardResponse$ValidationFailure;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class UnlinkCreditCardResponse {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/UnlinkCreditCardResponse$Failure;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/UnlinkCreditCardResponse;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failure extends UnlinkCreditCardResponse {

        /* renamed from: a, reason: collision with root package name */
        public final String f8315a;
        public final AnalyticsData b;

        public Failure(String str, AnalyticsData analyticsData) {
            this.f8315a = str;
            this.b = analyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.c(this.f8315a, failure.f8315a) && Intrinsics.c(this.b, failure.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8315a.hashCode() * 31);
        }

        public final String toString() {
            return "Failure(errorMessage=" + this.f8315a + ", analytics=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/UnlinkCreditCardResponse$Success;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/UnlinkCreditCardResponse;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Success extends UnlinkCreditCardResponse {

        /* renamed from: a, reason: collision with root package name */
        public static final Success f8316a = new Success();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/UnlinkCreditCardResponse$ValidationFailure;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/UnlinkCreditCardResponse;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ValidationFailure extends UnlinkCreditCardResponse {

        /* renamed from: a, reason: collision with root package name */
        public final String f8317a;
        public final String b;
        public final String c;
        public final AnalyticsData d;

        public ValidationFailure(String str, String str2, String str3, AnalyticsData analyticsData) {
            this.f8317a = str;
            this.b = str2;
            this.c = str3;
            this.d = analyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidationFailure)) {
                return false;
            }
            ValidationFailure validationFailure = (ValidationFailure) obj;
            return Intrinsics.c(this.f8317a, validationFailure.f8317a) && Intrinsics.c(this.b, validationFailure.b) && Intrinsics.c(this.c, validationFailure.c) && Intrinsics.c(this.d, validationFailure.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f8317a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ValidationFailure(errorMessage=", this.f8317a, ", errorTitle=", this.b, ", errorButton=");
            sbV.append(this.c);
            sbV.append(", analytics=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }
}
