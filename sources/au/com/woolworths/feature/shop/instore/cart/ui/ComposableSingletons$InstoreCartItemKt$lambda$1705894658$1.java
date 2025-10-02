package au.com.woolworths.feature.shop.instore.cart.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.models.AisleSide;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.InStoreLocationType;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.InstoreLocationDetailsData;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.ProductTileButtonType;
import au.com.woolworths.product.models.ProductTrolleyData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$InstoreCartItemKt$lambda$1705894658$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            InstoreCartItemKt.a(new ProductCard("2", "Helga's Bread Light Rye 680g", null, null, 290, null, null, null, "$0.72 per 100G", true, false, null, null, null, null, new ProductTrolleyData(1.0d, 29.0d, 1.0d, 1.0d, Double.valueOf(99.0d), null, ProductTileButtonType.ADD, "Add", null, null), null, new ProductShoppingList(0.0d, 0.0d, 1.0d, 0.0d, null, 16, null), new InstoreDetailsData("Aisle 3", InStoreLocationType.AVAILABLE), null, null, null, null, null, null, null, null, null, null, null, null, false, null, new MemberPriceInfo("Member Price", "$88.88", "$88.88 per 1KG"), null, new InStoreLocationData(new InstoreLocationDetailsData(3, AisleSide.LEFT, "location", 3, null, 1, 5.0d, 6.0d, 0.0d), null), null, null, null, null, -427796, 245, null), true, PaddingKt.f(Modifier.Companion.d, 16), null, null, null, true, true, null, composer, ProductCard.$stable | 905997744, 1248);
        }
        return Unit.f24250a;
    }
}
