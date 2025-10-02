package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductUnavailablePriceLabelKt$lambda$816996453$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductUnavailablePriceLabelKt$lambda$816996453$1 d = new ComposableSingletons$ProductUnavailablePriceLabelKt$lambda$816996453$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductUnavailablePriceLabelKt.a(null, false, composer, 0, 3);
        }
        return Unit.f24250a;
    }
}
