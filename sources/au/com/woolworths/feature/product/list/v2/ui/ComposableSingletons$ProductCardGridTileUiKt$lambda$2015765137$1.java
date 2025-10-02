package au.com.woolworths.feature.product.list.v2.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.product.list.v2.ui.ComposableSingletons$ProductCardGridTileUiKt$lambda$-2015765137$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductCardGridTileUiKt$lambda$2015765137$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/product/list/v2/ui/ComposableSingletons$ProductCardGridTileUiKt$lambda$-2015765137$1$1", "Lau/com/woolworths/product/tile/ProductClickListener;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.v2.ui.ComposableSingletons$ProductCardGridTileUiKt$lambda$-2015765137$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProductClickListener {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductCardGridTileUiKt.a(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -25165825, 3), new AnonymousClass1(), ProductCardConfig.copy$default(ProductCardConfig.INSTANCE.getDefault(), true, false, false, false, false, false, null, 126, null), EmptyList.d, null, null, null, composer, ProductCard.$stable | 3072 | (ProductCardConfig.$stable << 6), 112);
        }
        return Unit.f24250a;
    }
}
