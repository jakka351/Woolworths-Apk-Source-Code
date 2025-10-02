package au.com.woolworths.foundation.ui.fullpagemessage.legacy;

import androidx.compose.runtime.Composer;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$FullPageMessageUiKt$lambda$1438931024$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            FullPageMessageUiKt.a(FullPageMessageSpec.Companion.f(null, "¯\\_(ツ)_/¯", "No results."), null, null, composer, 0, 6);
        }
        return Unit.f24250a;
    }
}
