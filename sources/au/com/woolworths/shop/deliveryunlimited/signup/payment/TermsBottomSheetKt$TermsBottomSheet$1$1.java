package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.TermItemUiModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class TermsBottomSheetKt$TermsBottomSheet$1$1 extends FunctionReferenceImpl implements Function2<TermItemUiModel, Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        TermItemUiModel p0 = (TermItemUiModel) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Intrinsics.h(p0, "p0");
        ((PaymentViewModel) this.receiver).v6(p0, zBooleanValue);
        return Unit.f24250a;
    }
}
