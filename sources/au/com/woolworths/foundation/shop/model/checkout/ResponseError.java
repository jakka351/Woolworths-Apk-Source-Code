package au.com.woolworths.foundation.shop.model.checkout;

import YU.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/foundation/shop/model/checkout/ResponseError;", "", "", "errorCode", "message", "paymentInstrumentId", "Lau/com/woolworths/foundation/shop/model/checkout/PaymentStepUp;", "stepUp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/foundation/shop/model/checkout/PaymentStepUp;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "getMessage", "getPaymentInstrumentId", "Lau/com/woolworths/foundation/shop/model/checkout/PaymentStepUp;", "b", "()Lau/com/woolworths/foundation/shop/model/checkout/PaymentStepUp;", "model"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ResponseError {

    @SerializedName("ErrorCode")
    @Nullable
    private final String errorCode;

    @SerializedName("Message")
    @Nullable
    private final String message;

    @SerializedName("PaymentInstrumentId")
    @Nullable
    private final String paymentInstrumentId;

    @SerializedName("StepUp")
    @Nullable
    private final PaymentStepUp stepUp;

    public ResponseError(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable PaymentStepUp paymentStepUp) {
        this.errorCode = str;
        this.message = str2;
        this.paymentInstrumentId = str3;
        this.stepUp = paymentStepUp;
    }

    /* renamed from: a, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: b, reason: from getter */
    public final PaymentStepUp getStepUp() {
        return this.stepUp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseError)) {
            return false;
        }
        ResponseError responseError = (ResponseError) obj;
        return Intrinsics.c(this.errorCode, responseError.errorCode) && Intrinsics.c(this.message, responseError.message) && Intrinsics.c(this.paymentInstrumentId, responseError.paymentInstrumentId) && Intrinsics.c(this.stepUp, responseError.stepUp);
    }

    public final int hashCode() {
        String str = this.errorCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentInstrumentId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PaymentStepUp paymentStepUp = this.stepUp;
        return iHashCode3 + (paymentStepUp != null ? paymentStepUp.hashCode() : 0);
    }

    public final String toString() {
        String str = this.errorCode;
        String str2 = this.message;
        String str3 = this.paymentInstrumentId;
        PaymentStepUp paymentStepUp = this.stepUp;
        StringBuilder sbV = a.v("ResponseError(errorCode=", str, ", message=", str2, ", paymentInstrumentId=");
        sbV.append(str3);
        sbV.append(", stepUp=");
        sbV.append(paymentStepUp);
        sbV.append(")");
        return sbV.toString();
    }
}
