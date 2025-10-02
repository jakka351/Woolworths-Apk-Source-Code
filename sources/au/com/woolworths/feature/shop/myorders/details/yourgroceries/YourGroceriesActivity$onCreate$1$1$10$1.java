package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import au.com.woolworths.analytics.supers.orderdetails.YourGroceriesAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class YourGroceriesActivity$onCreate$1$1$10$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((YourGroceriesViewModel) this.receiver).f.g(YourGroceriesAnalytics.YourGroceries.Action.e);
        return Unit.f24250a;
    }
}
