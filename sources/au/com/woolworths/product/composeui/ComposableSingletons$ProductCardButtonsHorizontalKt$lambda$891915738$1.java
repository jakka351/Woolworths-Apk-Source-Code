package au.com.woolworths.product.composeui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.models.ProductTrolleyDataKt;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.ui.ListButtonType;
import au.com.woolworths.product.ui.ProductCardButtonType;
import au.com.woolworths.product.ui.ProductCardButtonsState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductCardButtonsHorizontalKt$lambda$891915738$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/product/composeui/ComposableSingletons$ProductCardButtonsHorizontalKt$lambda$891915738$1$1", "Lau/com/woolworths/product/tile/ProductClickListener;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductCardButtonsHorizontalKt$lambda$891915738$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProductClickListener {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductCardButtonsHorizontalKt.b(ProductCardPreviewDataKt.b(null, null, null, null, false, null, ProductTrolleyDataKt.defaultProductTrolleyData(), null, null, null, null, null, null, null, null, null, null, -32769, 3), null, new AnonymousClass1(), new ProductCardButtonsState(ProductCardButtonType.d, ListButtonType.e), PaddingKt.h(Modifier.Companion.d, 8, BitmapDescriptorFactory.HUE_RED, 2), false, composer, 24624, 32);
        }
        return Unit.f24250a;
    }
}
