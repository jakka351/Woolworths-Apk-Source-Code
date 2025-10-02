package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class YourGroceriesActivity$onCreate$1$1$5$1 extends FunctionReferenceImpl implements Function1<YourGroceriesProductItem, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        YourGroceriesProductItem p0 = (YourGroceriesProductItem) obj;
        Intrinsics.h(p0, "p0");
        ((YourGroceriesViewModel) this.receiver).X0(p0);
        return Unit.f24250a;
    }
}
