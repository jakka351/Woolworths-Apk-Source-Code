package au.com.woolworths.feature.product.list.legacy.compose.productfinder;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductFinderTopBarKt$lambda$1829995718$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductFinderTopBarKt.a("", null, false, ProductFinderTopBarKt.f5348a, composer, 3510);
        }
        return Unit.f24250a;
    }
}
