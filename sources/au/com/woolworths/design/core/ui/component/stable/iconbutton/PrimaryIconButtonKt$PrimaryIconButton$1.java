package au.com.woolworths.design.core.ui.component.stable.iconbutton;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.color.CoreColors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PrimaryIconButtonKt$PrimaryIconButton$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        composer.o(-907102112);
        CoreColors.Action action = CoreTheme.b(composer).f4782a;
        composer.l();
        throw null;
    }
}
