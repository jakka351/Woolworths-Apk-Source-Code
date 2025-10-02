package au.com.woolworths.shop.aem.components.ui.button;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.sdui.legacy.banner.c;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ButtonSectionKt$Preview_ButtonSection$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Intrinsics.h(null, "style");
            ButtonData buttonData = new ButtonData(null, "null Button", null, true, null, null, null, null);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new c(28);
                composer.A(objG);
            }
            composer.l();
            ButtonSectionKt.a(buttonData, (Function1) objG, PaddingKt.g(SizeKt.e(Modifier.Companion.d, 1.0f), 16, 8), null, composer, 432);
        }
        return Unit.f24250a;
    }
}
