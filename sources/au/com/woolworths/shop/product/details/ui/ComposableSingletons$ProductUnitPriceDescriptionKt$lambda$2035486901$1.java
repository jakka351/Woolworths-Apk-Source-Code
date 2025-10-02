package au.com.woolworths.shop.product.details.ui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.product.details.ui.ComposableSingletons$ProductUnitPriceDescriptionKt$lambda$-2035486901$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductUnitPriceDescriptionKt$lambda$2035486901$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductUnitPriceDescriptionKt$lambda$2035486901$1 d = new ComposableSingletons$ProductUnitPriceDescriptionKt$lambda$2035486901$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductUnitPriceDescriptionKt.a(6, 2, composer, null, "$888.88/ 100G");
        }
        return Unit.f24250a;
    }
}
