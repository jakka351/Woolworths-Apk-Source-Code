package au.com.woolworths.shop.checkout.domain.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository;
import io.reactivex.internal.operators.single.SingleCreate;
import kotlin.Metadata;
import kotlinx.coroutines.rx2.RxSingleKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/interactor/MakeZeroPayment;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MakeZeroPayment {

    /* renamed from: a, reason: collision with root package name */
    public final CheckoutPaymentDataRepository f10550a;

    public MakeZeroPayment(CheckoutPaymentDataRepository checkoutPaymentDataRepository) {
        this.f10550a = checkoutPaymentDataRepository;
    }

    public final SingleCreate a() {
        return RxSingleKt.a(new MakeZeroPayment$invoke$1(this, null));
    }
}
