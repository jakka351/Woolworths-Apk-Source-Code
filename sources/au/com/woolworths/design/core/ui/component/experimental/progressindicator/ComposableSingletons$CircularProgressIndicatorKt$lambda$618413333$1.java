package au.com.woolworths.design.core.ui.component.experimental.progressindicator;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.design.core.ui.component.experimental.progressindicator.ComposableSingletons$CircularProgressIndicatorKt$lambda$-618413333$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$CircularProgressIndicatorKt$lambda$618413333$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SurfaceKt.b(null, null, 0L, 0L, null, null, ComposableSingletons$CircularProgressIndicatorKt.f4726a, composer, 63);
        }
        return Unit.f24250a;
    }
}
