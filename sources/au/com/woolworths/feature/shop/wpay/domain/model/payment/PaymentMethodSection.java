package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodSection;", "", "", "title", "", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem;", "paymentMethods", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethodSection {

    @SerializedName("paymentMethods")
    @NotNull
    private final List<PaymentMethodItem> paymentMethods;

    @SerializedName("title")
    @NotNull
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodSection(@NotNull String title, @NotNull List<? extends PaymentMethodItem> paymentMethods) {
        Intrinsics.h(title, "title");
        Intrinsics.h(paymentMethods, "paymentMethods");
        this.title = title;
        this.paymentMethods = paymentMethods;
    }

    /* renamed from: a, reason: from getter */
    public final List getPaymentMethods() {
        return this.paymentMethods;
    }

    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodSection)) {
            return false;
        }
        PaymentMethodSection paymentMethodSection = (PaymentMethodSection) obj;
        return Intrinsics.c(this.title, paymentMethodSection.title) && Intrinsics.c(this.paymentMethods, paymentMethodSection.paymentMethods);
    }

    public final int hashCode() {
        return this.paymentMethods.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return a.i("PaymentMethodSection(title=", this.title, ", paymentMethods=", ")", this.paymentMethods);
    }
}
