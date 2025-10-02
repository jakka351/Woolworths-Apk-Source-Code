package au.com.woolworths.design.wx.component;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$ScaffoldKt$lambda$318463324$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ScaffoldKt$lambda$318463324$1 d = new ComposableSingletons$ScaffoldKt$lambda$318463324$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        }
        return Unit.f24250a;
    }
}
