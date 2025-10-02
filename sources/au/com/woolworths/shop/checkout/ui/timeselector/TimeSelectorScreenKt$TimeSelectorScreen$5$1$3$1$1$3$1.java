package au.com.woolworths.shop.checkout.ui.timeselector;

import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class TimeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$3$1 extends FunctionReferenceImpl implements Function1<FulfilmentSlot, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FulfilmentSlot p0 = (FulfilmentSlot) obj;
        Intrinsics.h(p0, "p0");
        ((TimeSelectorViewModel) this.receiver).u6(p0);
        return Unit.f24250a;
    }
}
