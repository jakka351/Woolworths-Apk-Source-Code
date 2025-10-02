package au.com.woolworths.foundation.shop.model.checkout;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/foundation/shop/model/checkout/PaymentErrors;", "", "", "message", "Lau/com/woolworths/foundation/shop/model/checkout/ResponseStatusWithErrorList;", "responseStatus", "<init>", "(Ljava/lang/String;Lau/com/woolworths/foundation/shop/model/checkout/ResponseStatusWithErrorList;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lau/com/woolworths/foundation/shop/model/checkout/ResponseStatusWithErrorList;", "a", "()Lau/com/woolworths/foundation/shop/model/checkout/ResponseStatusWithErrorList;", "model"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentErrors {

    @SerializedName("Message")
    @NotNull
    private final String message;

    @SerializedName("ResponseStatus")
    @Nullable
    private final ResponseStatusWithErrorList responseStatus;

    public PaymentErrors(@NotNull String message, @Nullable ResponseStatusWithErrorList responseStatusWithErrorList) {
        Intrinsics.h(message, "message");
        this.message = message;
        this.responseStatus = responseStatusWithErrorList;
    }

    /* renamed from: a, reason: from getter */
    public final ResponseStatusWithErrorList getResponseStatus() {
        return this.responseStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentErrors)) {
            return false;
        }
        PaymentErrors paymentErrors = (PaymentErrors) obj;
        return Intrinsics.c(this.message, paymentErrors.message) && Intrinsics.c(this.responseStatus, paymentErrors.responseStatus);
    }

    public final int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        ResponseStatusWithErrorList responseStatusWithErrorList = this.responseStatus;
        return iHashCode + (responseStatusWithErrorList == null ? 0 : responseStatusWithErrorList.hashCode());
    }

    public final String toString() {
        return "PaymentErrors(message=" + this.message + ", responseStatus=" + this.responseStatus + ")";
    }
}
