package au.com.woolworths.feature.shop.contentpage;

import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ContentPageFragment$onCreateView$1$1$1$11$1 extends FunctionReferenceImpl implements Function2<Screen, ProductCard, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Screen screen = (Screen) obj;
        ProductCard p1 = (ProductCard) obj2;
        Intrinsics.h(p1, "p1");
        ContentPageFragment contentPageFragment = (ContentPageFragment) this.receiver;
        if (screen != null) {
            AddToCartBottomSheetFragment.Companion.b(contentPageFragment.getChildFragmentManager(), p1, screen);
        } else {
            contentPageFragment.getClass();
        }
        return Unit.f24250a;
    }
}
