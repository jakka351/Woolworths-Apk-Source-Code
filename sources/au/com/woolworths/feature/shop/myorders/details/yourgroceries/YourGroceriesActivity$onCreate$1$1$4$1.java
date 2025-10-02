package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFullfilmentStatusItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class YourGroceriesActivity$onCreate$1$1$4$1 extends FunctionReferenceImpl implements Function1<YourGroceriesFullfilmentStatusItem, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        YourGroceriesFullfilmentStatusItem p0 = (YourGroceriesFullfilmentStatusItem) obj;
        Intrinsics.h(p0, "p0");
        ((YourGroceriesViewModel) this.receiver).y3(p0);
        return Unit.f24250a;
    }
}
