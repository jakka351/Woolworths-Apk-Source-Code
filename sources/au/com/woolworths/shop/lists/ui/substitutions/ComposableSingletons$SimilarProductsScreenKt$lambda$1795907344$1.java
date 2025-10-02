package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.lists.data.model.AlternativeProducts;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsCtaSection;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsDisclaimer;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsNoResultSection;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsTargetProductSection;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$SimilarProductsScreenKt$lambda$1795907344$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/ui/substitutions/ComposableSingletons$SimilarProductsScreenKt$lambda$1795907344$1$1", "Lau/com/woolworths/product/tile/ProductClickListener;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.ui.substitutions.ComposableSingletons$SimilarProductsScreenKt$lambda$1795907344$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProductClickListener {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ViewSimilarProductsContract.ViewState.Content content = new ViewSimilarProductsContract.ViewState.Content(new AlternativeProducts(CollectionsKt.R(new AlternativeProductsTargetProductSection(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -17840913, 3)), new AlternativeProductsNoResultSection("Sorry, we couldn’t find any suitable product suggestions."), new AlternativeProductsCtaSection("See all in this category", "search-by-category-name", "Cooking Oil")), new AlternativeProductsDisclaimer("Similar items are suggestions only", "Please check the product listing for allergen information or product warnings before adding to cart.", "Got it")), null, false, false, 62);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.shop.lists.ui.shoppinglist.compose.a(20);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.shop.lists.ui.shoppinglist.compose.a(21);
                composer.A(objE);
            }
            Function1 function12 = (Function1) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE2);
            }
            Function0 function0 = (Function0) objE2;
            Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new au.com.woolworths.shop.lists.ui.shoppinglist.compose.a(22);
                composer.A(objE3);
            }
            composer.l();
            SimilarProductsScreenKt.k(content, false, function1, function12, function0, (Function1) objE3, anonymousClass1, composer, 224688);
        }
        return Unit.f24250a;
    }
}
