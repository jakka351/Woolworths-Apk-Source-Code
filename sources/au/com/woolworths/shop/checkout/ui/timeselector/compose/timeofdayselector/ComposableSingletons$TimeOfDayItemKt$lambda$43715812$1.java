package au.com.woolworths.shop.checkout.ui.timeselector.compose.timeofdayselector;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.checkout.ui.timeselector.compose.timeofdayselector.ComposableSingletons$TimeOfDayItemKt$lambda$-43715812$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$TimeOfDayItemKt$lambda$43715812$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ImageVector imageVector = CoreTheme.e(composer).c.f;
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            TimeOfDayItemKt.a(true, "Morning", imageVector, (Function0) objG, null, composer, 3126, 16);
        }
        return Unit.f24250a;
    }
}
