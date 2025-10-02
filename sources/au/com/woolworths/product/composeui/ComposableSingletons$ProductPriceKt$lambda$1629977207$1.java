package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductPriceKt$lambda$-1629977207$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductPriceKt$lambda$1629977207$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductPriceKt$lambda$1629977207$1 d = new ComposableSingletons$ProductPriceKt$lambda$1629977207$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductPriceKt.a(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3).getPrice(), null, null, null, 0L, false, composer, 48, 60);
        }
        return Unit.f24250a;
    }
}
