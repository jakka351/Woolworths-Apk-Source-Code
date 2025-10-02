package au.com.woolworths.shared.ui.compose.price.core;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PriceLabelCoreKt$lambda$1016667863$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            PriceLabelCoreKt.a(BackgroundKt.b(Modifier.Companion.d, Color.f, RectangleShapeKt.f1779a), null, null, "50", null, 0L, null, composer, 3078, 118);
        }
        return Unit.f24250a;
    }
}
