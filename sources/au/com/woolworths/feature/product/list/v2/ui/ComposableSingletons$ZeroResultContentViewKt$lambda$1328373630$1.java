package au.com.woolworths.feature.product.list.v2.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.product.list.v2.data.ProductListZeroResults;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.ProductTileButtonType;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.PurchaseRestriction;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.product.list.v2.ui.ComposableSingletons$ZeroResultContentViewKt$lambda$-1328373630$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ZeroResultContentViewKt$lambda$1328373630$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/product/list/v2/ui/ComposableSingletons$ZeroResultContentViewKt$lambda$-1328373630$1$1", "Lau/com/woolworths/product/tile/ProductClickListener;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.v2.ui.ComposableSingletons$ZeroResultContentViewKt$lambda$-1328373630$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProductClickListener {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductShoppingList productShoppingList = new ProductShoppingList(1.0d, 3.0d, 1.0d, 1.0d, "");
            ProductTileButtonType productTileButtonType = ProductTileButtonType.ADD;
            ProductTrolleyData productTrolleyData = new ProductTrolleyData(1.0d, 5.0d, 1.0d, 1.0d, null, "", productTileButtonType, "Add", "", null);
            PurchaseRestriction purchaseRestriction = PurchaseRestriction.NO_RESTRICTION;
            ProductListZeroResults.ZeroResultData zeroResultData = new ProductListZeroResults.ZeroResultData("No result found for ", "‘asdfghji’", "Check the spelling or select a different shopping method, like ‘pick up’ or ‘delivery’.", CollectionsKt.Q(new HorizontalListData("Related Products", null, null, null, null, CollectionsKt.R(new ProductCard("", "Billy Tea Campfire Brew Tea", null, null, 500, null, null, null, "$0.05 each", true, false, null, null, null, null, productTrolleyData, null, productShoppingList, null, purchaseRestriction, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, -689940, 255, null), new ProductCard("", "Apple MacBook", null, null, 500, null, null, null, "$0.05 each", true, false, null, null, null, null, new ProductTrolleyData(1.0d, 5.0d, 1.0d, 1.0d, null, "", productTileButtonType, "Add", "", null), null, new ProductShoppingList(1.0d, 3.0d, 1.0d, 1.0d, ""), null, purchaseRestriction, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, -689940, 255, null), new ProductCard("", "Cheese", null, null, 500, null, null, null, "$0.05 each", true, false, null, null, null, null, new ProductTrolleyData(1.0d, 5.0d, 1.0d, 1.0d, null, "", productTileButtonType, "Add", "", null), null, new ProductShoppingList(1.0d, 3.0d, 1.0d, 1.0d, ""), null, purchaseRestriction, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, -689940, 255, null)), null, null, null, null, null, null)));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new d(3);
                composer.A(objG);
            }
            composer.l();
            ZeroResultContentViewKt.b(zeroResultData, false, anonymousClass1, true, (Function1) objG, null, composer, 27696, 32);
        }
        return Unit.f24250a;
    }
}
