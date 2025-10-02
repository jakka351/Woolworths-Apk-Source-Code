package au.com.woolworths.feature.shop.shippingcalculator;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/ShippingCalculatorInteractorImpl;", "Lau/com/woolworths/feature/shop/shippingcalculator/ShippingCalculatorInteractor;", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShippingCalculatorInteractorImpl implements ShippingCalculatorInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ShippingCalculatorRepository f8099a;

    public ShippingCalculatorInteractorImpl(ShippingCalculatorRepository shippingCalculatorRepository) {
        this.f8099a = shippingCalculatorRepository;
    }

    @Override // au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorInteractor
    public final Serializable a(String str, Continuation continuation) {
        return this.f8099a.a(str, (ContinuationImpl) continuation);
    }
}
