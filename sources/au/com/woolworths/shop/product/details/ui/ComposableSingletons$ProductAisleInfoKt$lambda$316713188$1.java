package au.com.woolworths.shop.product.details.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import au.com.woolworths.product.models.ProductCard;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.product.details.ui.ComposableSingletons$ProductAisleInfoKt$lambda$-316713188$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductAisleInfoKt$lambda$316713188$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductAisleInfoKt$lambda$316713188$1 d = new ComposableSingletons$ProductAisleInfoKt$lambda$316713188$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            float f = 10;
            ProductAisleInfoKt.a(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3), PaddingKt.j(Modifier.Companion.d, f, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 10), composer, ProductCard.$stable | 48);
        }
        return Unit.f24250a;
    }
}
