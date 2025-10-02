package au.com.woolworths.feature.shop.shippingcalculator;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorRepository", f = "ShippingCalculatorRepository.kt", l = {24}, m = "fetchSuburbsList")
/* loaded from: classes3.dex */
final class ShippingCalculatorRepository$fetchSuburbsList$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ShippingCalculatorRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingCalculatorRepository$fetchSuburbsList$1(ShippingCalculatorRepository shippingCalculatorRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = shippingCalculatorRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
