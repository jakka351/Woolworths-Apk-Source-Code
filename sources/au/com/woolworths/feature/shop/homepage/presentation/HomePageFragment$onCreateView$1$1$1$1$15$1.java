package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HomePageFragment$onCreateView$1$1$1$1$15$1 extends FunctionReferenceImpl implements Function2<Screen, ProductCard, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ProductCard p1 = (ProductCard) obj2;
        Intrinsics.h(p1, "p1");
        ((HomePageFragment) this.receiver).m2((Screen) obj, p1);
        return Unit.f24250a;
    }
}
