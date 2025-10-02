package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.ComposableSingletons$DirectionAndDistanceIndicatorKt$lambda$-532634881$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$DirectionAndDistanceIndicatorKt$lambda$532634881$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            DirectionAndDistanceIndicatorKt.a(45.0f, 16.0f, null, composer, 54, 4);
        }
        return Unit.f24250a;
    }
}
