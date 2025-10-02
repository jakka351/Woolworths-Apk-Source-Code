package au.com.woolworths.feature.shop.brandedshop;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class BrandedShopActivity$onCreate$1$1$4$1 extends FunctionReferenceImpl implements Function1<UiEvent, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UiEvent p0 = (UiEvent) obj;
        Intrinsics.h(p0, "p0");
        ((BrandedShopViewModel) this.receiver).t6(p0);
        return Unit.f24250a;
    }
}
