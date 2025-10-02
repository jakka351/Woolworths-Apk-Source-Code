package com.woolworths.scanlibrary.models.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/woolworths/scanlibrary/models/payment/PaymentRequest;", "", "clientReference", "", "payment", "", "Lcom/woolworths/scanlibrary/models/payment/PaymentInformation;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getClientReference", "()Ljava/lang/String;", "getPayment", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PaymentRequest {
    public static final int $stable = 8;

    @SerializedName("clientReference")
    @NotNull
    private final String clientReference;

    @SerializedName("payment")
    @NotNull
    private final List<PaymentInformation> payment;

    public PaymentRequest(@NotNull String clientReference, @NotNull List<PaymentInformation> payment) {
        Intrinsics.h(clientReference, "clientReference");
        Intrinsics.h(payment, "payment");
        this.clientReference = clientReference;
        this.payment = payment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentRequest copy$default(PaymentRequest paymentRequest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentRequest.clientReference;
        }
        if ((i & 2) != 0) {
            list = paymentRequest.payment;
        }
        return paymentRequest.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getClientReference() {
        return this.clientReference;
    }

    @NotNull
    public final List<PaymentInformation> component2() {
        return this.payment;
    }

    @NotNull
    public final PaymentRequest copy(@NotNull String clientReference, @NotNull List<PaymentInformation> payment) {
        Intrinsics.h(clientReference, "clientReference");
        Intrinsics.h(payment, "payment");
        return new PaymentRequest(clientReference, payment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentRequest)) {
            return false;
        }
        PaymentRequest paymentRequest = (PaymentRequest) other;
        return Intrinsics.c(this.clientReference, paymentRequest.clientReference) && Intrinsics.c(this.payment, paymentRequest.payment);
    }

    @NotNull
    public final String getClientReference() {
        return this.clientReference;
    }

    @NotNull
    public final List<PaymentInformation> getPayment() {
        return this.payment;
    }

    public int hashCode() {
        return this.payment.hashCode() + (this.clientReference.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.i("PaymentRequest(clientReference=", this.clientReference, ", payment=", ")", this.payment);
    }
}
