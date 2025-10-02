package au.com.woolworths.design.core.ui.component.experimental.topbar;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TopBarConstants$Elevation$1 implements Function2<Composer, Integer, CoreElevation> {
    public static final TopBarConstants$Elevation$1 d = new TopBarConstants$Elevation$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        composer.o(-1017654114);
        CoreElevation coreElevation = CoreTheme.c(composer).c;
        composer.l();
        return coreElevation;
    }
}
