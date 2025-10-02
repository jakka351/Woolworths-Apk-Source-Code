package au.com.woolworths.feature.shop.wpay.ui.addgiftcard;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$AddGiftCardContentKt$lambda$1497918517$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AddGiftCardContentKt$lambda$1497918517$1 d = new ComposableSingletons$AddGiftCardContentKt$lambda$1497918517$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IconKt.b(CoreTheme.e(composer).f.i, null, BackgroundKt.b(Modifier.Companion.d, CoreTheme.b(composer).e.f4848a.d, RectangleShapeKt.f1779a), 0L, composer, 48, 8);
        }
        return Unit.f24250a;
    }
}
