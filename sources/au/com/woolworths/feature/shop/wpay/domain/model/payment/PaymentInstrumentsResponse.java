package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.model.AnalyticsData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentInstrumentsResponse;", "", "Success", "ValidationFailure", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentInstrumentsResponse$Success;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentInstrumentsResponse$ValidationFailure;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class PaymentInstrumentsResponse {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentInstrumentsResponse$Success;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentInstrumentsResponse;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends PaymentInstrumentsResponse {

        /* renamed from: a, reason: collision with root package name */
        public final GiftCardSection f8303a;
        public final PaymentMethodSection b;
        public final PaymentInstrumentTotalDetails c;
        public final List d;
        public final String e;
        public final String f;
        public final Map g;

        public Success(GiftCardSection giftCardSection, PaymentMethodSection paymentMethodSection, PaymentInstrumentTotalDetails paymentInstrumentTotalDetails, List list, String str, String str2, Map map) {
            this.f8303a = giftCardSection;
            this.b = paymentMethodSection;
            this.c = paymentInstrumentTotalDetails;
            this.d = list;
            this.e = str;
            this.f = str2;
            this.g = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.c(this.f8303a, success.f8303a) && Intrinsics.c(this.b, success.b) && Intrinsics.c(this.c, success.c) && Intrinsics.c(this.d, success.d) && Intrinsics.c(this.e, success.e) && Intrinsics.c(this.f, success.f) && Intrinsics.c(this.g, success.g);
        }

        public final int hashCode() {
            int iD = b.d((this.c.hashCode() + ((this.b.hashCode() + (this.f8303a.hashCode() * 31)) * 31)) * 31, 31, this.d);
            String str = this.e;
            int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return this.g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(giftCardSection=");
            sb.append(this.f8303a);
            sb.append(", paymentMethodSection=");
            sb.append(this.b);
            sb.append(", paymentInstrumentTotalDetails=");
            sb.append(this.c);
            sb.append(", analytics=");
            sb.append(this.d);
            sb.append(", footerMessageMd=");
            a.B(sb, this.e, ", snackBarMessage=", this.f, ", headers=");
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentInstrumentsResponse$ValidationFailure;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentInstrumentsResponse;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ValidationFailure extends PaymentInstrumentsResponse {

        /* renamed from: a, reason: collision with root package name */
        public final String f8304a;
        public final String b;
        public final AnalyticsData c;

        public ValidationFailure(String str, String str2, AnalyticsData analyticsData) {
            this.f8304a = str;
            this.b = str2;
            this.c = analyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidationFailure)) {
                return false;
            }
            ValidationFailure validationFailure = (ValidationFailure) obj;
            return Intrinsics.c(this.f8304a, validationFailure.f8304a) && Intrinsics.c(this.b, validationFailure.b) && Intrinsics.c(this.c, validationFailure.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f8304a.hashCode() * 31, 31, this.b);
            AnalyticsData analyticsData = this.c;
            return iC + (analyticsData == null ? 0 : analyticsData.hashCode());
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.n(YU.a.v("ValidationFailure(errorMessage=", this.f8304a, ", errorTitle=", this.b, ", impressionAnalytics="), this.c, ")");
        }
    }

    public final PaymentMethodItem a() {
        PaymentMethodSection paymentMethodSection;
        List listA;
        Success successB = b();
        Object obj = null;
        if (successB == null || (paymentMethodSection = successB.b) == null || (listA = paymentMethodSection.getPaymentMethods()) == null) {
            return null;
        }
        Iterator it = listA.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((PaymentMethodItem) next).isActive()) {
                obj = next;
                break;
            }
        }
        return (PaymentMethodItem) obj;
    }

    public final Success b() {
        if (this instanceof Success) {
            return (Success) this;
        }
        return null;
    }
}
