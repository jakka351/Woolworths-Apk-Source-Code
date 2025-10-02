package au.com.woolworths.foundation.ui.shimmers;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductsSkeletonKt$lambda$292579682$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductsSkeletonKt$lambda$292579682$1 d = new ComposableSingletons$ProductsSkeletonKt$lambda$292579682$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductsSkeletonKt.b(0, 1, composer, null);
        }
        return Unit.f24250a;
    }
}
