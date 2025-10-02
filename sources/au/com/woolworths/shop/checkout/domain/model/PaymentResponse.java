package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/PaymentResponse;", "", "Success", "Fail", "ValidationError", "Lau/com/woolworths/shop/checkout/domain/model/PaymentResponse$Fail;", "Lau/com/woolworths/shop/checkout/domain/model/PaymentResponse$Success;", "Lau/com/woolworths/shop/checkout/domain/model/PaymentResponse$ValidationError;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PaymentResponse {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/PaymentResponse$Fail;", "Lau/com/woolworths/shop/checkout/domain/model/PaymentResponse;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Fail implements PaymentResponse {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f10627a;

        public Fail(ArrayList arrayList) {
            this.f10627a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fail) && this.f10627a.equals(((Fail) obj).f10627a);
        }

        public final int hashCode() {
            return this.f10627a.hashCode();
        }

        public final String toString() {
            return a.k("Fail(errors=", ")", this.f10627a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/PaymentResponse$Success;", "Lau/com/woolworths/shop/checkout/domain/model/PaymentResponse;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success implements PaymentResponse {

        /* renamed from: a, reason: collision with root package name */
        public final int f10628a;
        public final boolean b;

        public Success(int i, boolean z) {
            this.f10628a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.f10628a == success.f10628a && this.b == success.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.f10628a) * 31);
        }

        public final String toString() {
            return "Success(orderId=" + this.f10628a + ", placed=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/PaymentResponse$ValidationError;", "Lau/com/woolworths/shop/checkout/domain/model/PaymentResponse;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ValidationError implements PaymentResponse {

        /* renamed from: a, reason: collision with root package name */
        public final String f10629a;
        public final String b;

        public ValidationError(String str, String str2) {
            this.f10629a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidationError)) {
                return false;
            }
            ValidationError validationError = (ValidationError) obj;
            return Intrinsics.c(this.f10629a, validationError.f10629a) && Intrinsics.c(this.b, validationError.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10629a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("ValidationError(errorMessage=", this.f10629a, ", errorCode=", this.b, ")");
        }
    }
}
