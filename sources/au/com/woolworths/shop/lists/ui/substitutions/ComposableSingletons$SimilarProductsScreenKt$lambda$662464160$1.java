package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.lists.ui.substitutions.ComposableSingletons$SimilarProductsScreenKt$lambda$-662464160$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$SimilarProductsScreenKt$lambda$662464160$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SimilarProductsScreenKt$lambda$662464160$1 d = new ComposableSingletons$SimilarProductsScreenKt$lambda$662464160$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        }
        return Unit.f24250a;
    }
}
