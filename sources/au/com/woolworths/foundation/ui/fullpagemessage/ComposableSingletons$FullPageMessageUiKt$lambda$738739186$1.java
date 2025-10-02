package au.com.woolworths.foundation.ui.fullpagemessage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.graphics.painter.ColorPainter;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.foundation.ui.fullpagemessage.ComposableSingletons$FullPageMessageUiKt$lambda$-738739186$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$FullPageMessageUiKt$lambda$738739186$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ColorPainter colorPainter = new ColorPainter(CoreTheme.b(composer).f4782a.f4783a.b.c);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new h(20);
                composer.A(objG);
            }
            Function0 function0 = (Function0) objG;
            Object objE = a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new h(20);
                composer.A(objE);
            }
            composer.l();
            FullPageMessageUiKt.a(FullPageMessageSpec.Companion.b(colorPainter, function0, (Function0) objE), null, null, composer, 0, 6);
        }
        return Unit.f24250a;
    }
}
