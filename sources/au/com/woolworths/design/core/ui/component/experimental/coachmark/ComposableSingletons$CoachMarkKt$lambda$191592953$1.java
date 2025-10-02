package au.com.woolworths.design.core.ui.component.experimental.coachmark;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$CoachMarkKt$lambda$191592953$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CoachMarkKt$lambda$191592953$1 d = new ComposableSingletons$CoachMarkKt$lambda$191592953$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            CoachMarkKt.c("Sort items by Unit Price", "This tool puts the lowest unit price options at the top of your results with one easy tap.", "GOT IT", (Function0) objG, null, composer, 3510);
        }
        return Unit.f24250a;
    }
}
