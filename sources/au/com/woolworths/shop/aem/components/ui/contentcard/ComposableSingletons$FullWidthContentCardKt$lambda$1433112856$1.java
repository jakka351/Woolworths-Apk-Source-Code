package au.com.woolworths.shop.aem.components.ui.contentcard;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.aem.components.ui.contentcard.ComposableSingletons$FullWidthContentCardKt$lambda$-1433112856$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$FullWidthContentCardKt$lambda$1433112856$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Orientation orientation = Orientation.d;
            FullWidthContentCardData fullWidthContentCardData = new FullWidthContentCardData(null, "", "This is a full width content card title that goes into second line", "This is a full width content card description that also goes into second line very easily", Boolean.TRUE, null);
            float f = 16;
            Modifier modifierG = PaddingKt.g(Modifier.Companion.d, f, f);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(4);
                composer.A(objG);
            }
            composer.l();
            FullWidthContentCardKt.a(orientation, fullWidthContentCardData, (Function1) objG, modifierG, composer, 3462, 0);
        }
        return Unit.f24250a;
    }
}
