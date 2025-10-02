package au.com.woolworths.feature.product.list.compose.recipe;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.product.list.compose.recipe.ComposableSingletons$ListSectionHeaderKt$lambda$-571048345$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ListSectionHeaderKt$lambda$571048345$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CoreThemeKt.c(6, composer, ComposableSingletons$ListSectionHeaderKt.f5273a);
        }
        return Unit.f24250a;
    }
}
