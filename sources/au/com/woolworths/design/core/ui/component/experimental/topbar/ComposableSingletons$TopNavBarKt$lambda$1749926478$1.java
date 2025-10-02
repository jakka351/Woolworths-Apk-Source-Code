package au.com.woolworths.design.core.ui.component.experimental.topbar;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ComposableSingletons$TopNavBarKt$lambda$1749926478$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$TopNavBarKt$lambda$1749926478$1 d = new ComposableSingletons$TopNavBarKt$lambda$1749926478$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ImageVector imageVector = CoreTheme.e(composer).e.b;
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(23);
                composer.A(objG);
            }
            composer.l();
            IconButtonKt.c(imageVector, "Back", (Function0) objG, null, false, null, 0L, composer, 432, 120);
        }
        return Unit.f24250a;
    }
}
