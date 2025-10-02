package au.com.woolworths.feature.shop.instore.cart.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
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
/* renamed from: au.com.woolworths.feature.shop.instore.cart.ui.ComposableSingletons$InstoreCartItemKt$lambda$-1232397251$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$InstoreCartItemKt$lambda$1232397251$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            InstoreCartItemKt.a(new ProductCard("0", "Helga's Bread Light Rye 680g", null, null, 290, null, null, null, "$0.72 per 100G", true, false, null, null, null, null, new ProductTrolleyData(1.0d, 29.0d, 1.0d, 1.0d, null, "Kilo", ProductTileButtonType.ADD, "Add", null, null), null, new ProductShoppingList(0.0d, 0.0d, 1.0d, 0.0d, null, 16, null), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, new MemberPriceInfo("Member Price", "$88.88", "$88.88 per 1KG"), null, null, null, null, null, null, -165652, 253, null), true, PaddingKt.f(Modifier.Companion.d, 16), null, null, null, false, false, null, composer, ProductCard.$stable | 28080, 2016);
        }
        return Unit.f24250a;
    }
}
