package au.com.woolworths.feature.shop.contentpage;

import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.product.infoview.ProductInfoViewFactory;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ContentPageFragment$onCreateView$1$1$1$10$1 extends FunctionReferenceImpl implements Function2<Screen, ProductCard, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Screen screen = (Screen) obj;
        ProductCard p1 = (ProductCard) obj2;
        Intrinsics.h(p1, "p1");
        ContentPageFragment contentPageFragment = (ContentPageFragment) this.receiver;
        if (screen != null) {
            AddToListBottomSheetFragment.Companion.a(contentPageFragment.getChildFragmentManager(), null, screen, CollectionsKt.Q(new AddToListProductParameters(p1, (String) null, (Float) null, false, 30)), null, new ProductInfoViewFactory(p1), true, null, null, 914);
        } else {
            contentPageFragment.getClass();
        }
        return Unit.f24250a;
    }
}
