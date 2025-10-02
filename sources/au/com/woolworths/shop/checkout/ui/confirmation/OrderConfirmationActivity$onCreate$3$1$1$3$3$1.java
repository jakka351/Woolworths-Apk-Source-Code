package au.com.woolworths.shop.checkout.ui.confirmation;

import au.com.woolworths.feature.shop.voc.score.VocViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class OrderConfirmationActivity$onCreate$3$1$1$3$3$1 extends FunctionReferenceImpl implements Function3<String, String, String, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        String p2 = (String) obj3;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        Intrinsics.h(p2, "p2");
        ((VocViewModel) this.receiver).w6(p0, p1, p2);
        return Unit.f24250a;
    }
}
