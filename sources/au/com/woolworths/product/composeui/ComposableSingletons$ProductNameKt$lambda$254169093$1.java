package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductNameKt$lambda$254169093$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductNameKt$lambda$254169093$1 d = new ComposableSingletons$ProductNameKt$lambda$254169093$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductNameKt.b(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, EmptyList.d, null, null, null, null, null, null, null, -524289, 3), true, null, 0, null, composer, 48, 28);
        }
        return Unit.f24250a;
    }
}
