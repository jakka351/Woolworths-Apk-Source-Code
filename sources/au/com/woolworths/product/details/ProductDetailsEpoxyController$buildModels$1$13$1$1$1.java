package au.com.woolworths.product.details;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class ProductDetailsEpoxyController$buildModels$1$13$1$1$1 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        ((ProductDetailsClickHandler) this.receiver).M3(p0, p1);
        return Unit.f24250a;
    }
}
