package com.woolworths.scanlibrary.data.payment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.api.internal.a;
import com.google.gson.annotations.SerializedName;
import com.woolworths.scanlibrary.models.payment.PaymentInformation;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/data/payment/PaymentDetail;", "", "PaymentDetailStore", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PaymentDetail {
    void a();

    void b();

    boolean c();

    void d(PaymentInformation... paymentInformationArr);

    void e();

    void f(BigDecimal bigDecimal);

    void g();

    ArrayList h();

    void i(String str);

    void j(BigDecimal bigDecimal);

    void reset();

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/woolworths/scanlibrary/data/payment/PaymentDetail$PaymentDetailStore;", "", "", "Lcom/woolworths/scanlibrary/models/payment/PaymentInformation;", "selectedPayments", "Ljava/math/BigDecimal;", "totalAmount", "paid", "", "paymentMade", "", "cartId", "<init>", "(Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;)V", "Ljava/util/List;", "getSelectedPayments", "()Ljava/util/List;", "Ljava/math/BigDecimal;", "getTotalAmount", "()Ljava/math/BigDecimal;", "getPaid", "Z", "getPaymentMade", "()Z", "Ljava/lang/String;", "getCartId", "()Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentDetailStore {

        @SerializedName("cartId")
        @NotNull
        private final String cartId;

        @SerializedName("paid")
        @NotNull
        private final BigDecimal paid;

        @SerializedName("paymentDone")
        private final boolean paymentMade;

        @SerializedName("paymentMethod")
        @NotNull
        private final List<PaymentInformation> selectedPayments;

        @SerializedName("total")
        @NotNull
        private final BigDecimal totalAmount;

        public PaymentDetailStore(@NotNull List<PaymentInformation> selectedPayments, @NotNull BigDecimal totalAmount, @NotNull BigDecimal paid, boolean z, @NotNull String cartId) {
            Intrinsics.h(selectedPayments, "selectedPayments");
            Intrinsics.h(totalAmount, "totalAmount");
            Intrinsics.h(paid, "paid");
            Intrinsics.h(cartId, "cartId");
            this.selectedPayments = selectedPayments;
            this.totalAmount = totalAmount;
            this.paid = paid;
            this.paymentMade = z;
            this.cartId = cartId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentDetailStore)) {
                return false;
            }
            PaymentDetailStore paymentDetailStore = (PaymentDetailStore) obj;
            return Intrinsics.c(this.selectedPayments, paymentDetailStore.selectedPayments) && Intrinsics.c(this.totalAmount, paymentDetailStore.totalAmount) && Intrinsics.c(this.paid, paymentDetailStore.paid) && this.paymentMade == paymentDetailStore.paymentMade && Intrinsics.c(this.cartId, paymentDetailStore.cartId);
        }

        public final int hashCode() {
            return this.cartId.hashCode() + b.e(a.c(this.paid, a.c(this.totalAmount, this.selectedPayments.hashCode() * 31, 31), 31), 31, this.paymentMade);
        }

        public final String toString() {
            List<PaymentInformation> list = this.selectedPayments;
            BigDecimal bigDecimal = this.totalAmount;
            BigDecimal bigDecimal2 = this.paid;
            boolean z = this.paymentMade;
            String str = this.cartId;
            StringBuilder sb = new StringBuilder("PaymentDetailStore(selectedPayments=");
            sb.append(list);
            sb.append(", totalAmount=");
            sb.append(bigDecimal);
            sb.append(", paid=");
            sb.append(bigDecimal2);
            sb.append(", paymentMade=");
            sb.append(z);
            sb.append(", cartId=");
            return YU.a.o(sb, str, ")");
        }

        public /* synthetic */ PaymentDetailStore(List list, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, bigDecimal, bigDecimal2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str);
        }
    }
}
