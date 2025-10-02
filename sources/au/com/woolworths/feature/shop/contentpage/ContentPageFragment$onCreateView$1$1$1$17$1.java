package au.com.woolworths.feature.shop.contentpage;

import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ContentPageFragment$onCreateView$1$1$1$17$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws NumberFormatException {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        ShopAppNavigator shopAppNavigator = ((ContentPageFragment) this.receiver).j;
        if (shopAppNavigator != null) {
            shopAppNavigator.d(p0);
            return Unit.f24250a;
        }
        Intrinsics.p("shopAppNavigator");
        throw null;
    }
}
