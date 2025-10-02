package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesSubstitutedProduct;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class YourGroceriesActivity$onCreate$1$1$6$1 extends FunctionReferenceImpl implements Function1<YourGroceriesSubstitutedProduct, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        YourGroceriesSubstitutedProduct p0 = (YourGroceriesSubstitutedProduct) obj;
        Intrinsics.h(p0, "p0");
        ((YourGroceriesViewModel) this.receiver).O4(p0);
        return Unit.f24250a;
    }
}
