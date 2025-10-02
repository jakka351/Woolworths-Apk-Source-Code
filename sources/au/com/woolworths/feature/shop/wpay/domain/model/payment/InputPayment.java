package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/InputPayment;", "", "None", "CreditCard", "PayPal", "GooglePay", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/InputPayment$CreditCard;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/InputPayment$GooglePay;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/InputPayment$None;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/InputPayment$PayPal;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InputPayment {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/InputPayment$CreditCard;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/InputPayment;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CreditCard implements InputPayment {

        /* renamed from: a, reason: collision with root package name */
        public final String f8294a;
        public final int b;

        public CreditCard(String id, int i) {
            Intrinsics.h(id, "id");
            this.f8294a = id;
            this.b = i;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/InputPayment$GooglePay;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/InputPayment;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GooglePay implements InputPayment {

        /* renamed from: a, reason: collision with root package name */
        public final int f8295a;
        public final String b;

        public GooglePay(int i, String str) {
            this.f8295a = i;
            this.b = str;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/InputPayment$None;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/InputPayment;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class None implements InputPayment {

        /* renamed from: a, reason: collision with root package name */
        public static final None f8296a = new None();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/InputPayment$PayPal;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/InputPayment;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PayPal implements InputPayment {

        /* renamed from: a, reason: collision with root package name */
        public final String f8297a;
        public final int b;

        public PayPal(String str, int i) {
            this.f8297a = str;
            this.b = i;
        }
    }
}
